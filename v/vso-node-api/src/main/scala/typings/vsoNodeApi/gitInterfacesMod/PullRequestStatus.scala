package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PullRequestStatus extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "PullRequestStatus")
@js.native
object PullRequestStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PullRequestStatus & Double] = js.native
  
  /**
    * Pull request is abandoned.
    */
  @js.native
  sealed trait Abandoned
    extends StObject
       with PullRequestStatus
  /* 2 */ val Abandoned: typings.vsoNodeApi.gitInterfacesMod.PullRequestStatus.Abandoned & Double = js.native
  
  /**
    * Pull request is active.
    */
  @js.native
  sealed trait Active
    extends StObject
       with PullRequestStatus
  /* 1 */ val Active: typings.vsoNodeApi.gitInterfacesMod.PullRequestStatus.Active & Double = js.native
  
  /**
    * Used in pull request search criterias to include all statuses.
    */
  @js.native
  sealed trait All
    extends StObject
       with PullRequestStatus
  /* 4 */ val All: typings.vsoNodeApi.gitInterfacesMod.PullRequestStatus.All & Double = js.native
  
  /**
    * Pull request is completed.
    */
  @js.native
  sealed trait Completed
    extends StObject
       with PullRequestStatus
  /* 3 */ val Completed: typings.vsoNodeApi.gitInterfacesMod.PullRequestStatus.Completed & Double = js.native
  
  /**
    * Status not set. Default state.
    */
  @js.native
  sealed trait NotSet
    extends StObject
       with PullRequestStatus
  /* 0 */ val NotSet: typings.vsoNodeApi.gitInterfacesMod.PullRequestStatus.NotSet & Double = js.native
}
