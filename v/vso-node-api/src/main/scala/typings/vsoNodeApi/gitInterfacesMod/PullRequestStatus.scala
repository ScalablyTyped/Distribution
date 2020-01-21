package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PullRequestStatus extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "PullRequestStatus")
@js.native
object PullRequestStatus extends js.Object {
  /**
    * Pull request is abandoned.
    */
  @js.native
  sealed trait Abandoned extends PullRequestStatus
  
  /**
    * Pull request is active.
    */
  @js.native
  sealed trait Active extends PullRequestStatus
  
  /**
    * Used in pull request search criterias to include all statuses.
    */
  @js.native
  sealed trait All extends PullRequestStatus
  
  /**
    * Pull request is completed.
    */
  @js.native
  sealed trait Completed extends PullRequestStatus
  
  /**
    * Status not set. Default state.
    */
  @js.native
  sealed trait NotSet extends PullRequestStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PullRequestStatus with Double] = js.native
  /* 2 */ @js.native
  object Abandoned extends TopLevel[Abandoned with Double]
  
  /* 1 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /* 4 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 3 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /* 0 */ @js.native
  object NotSet extends TopLevel[NotSet with Double]
  
}

