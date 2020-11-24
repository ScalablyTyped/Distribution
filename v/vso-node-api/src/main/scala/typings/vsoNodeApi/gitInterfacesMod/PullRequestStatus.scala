package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PullRequestStatus extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "PullRequestStatus")
@js.native
object PullRequestStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PullRequestStatus with Double] = js.native
  
  /**
    * Pull request is abandoned.
    */
  @js.native
  sealed trait Abandoned extends PullRequestStatus
  /* 2 */ @js.native
  object Abandoned extends TopLevel[Abandoned with Double]
  
  /**
    * Pull request is active.
    */
  @js.native
  sealed trait Active extends PullRequestStatus
  /* 1 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /**
    * Used in pull request search criterias to include all statuses.
    */
  @js.native
  sealed trait All extends PullRequestStatus
  /* 4 */ @js.native
  object All extends TopLevel[All with Double]
  
  /**
    * Pull request is completed.
    */
  @js.native
  sealed trait Completed extends PullRequestStatus
  /* 3 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /**
    * Status not set. Default state.
    */
  @js.native
  sealed trait NotSet extends PullRequestStatus
  /* 0 */ @js.native
  object NotSet extends TopLevel[NotSet with Double]
}
