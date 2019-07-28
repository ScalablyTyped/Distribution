package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
  
  /* 2 */ val Abandoned: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.PullRequestStatus.Abandoned with Double = js.native
  /* 1 */ val Active: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.PullRequestStatus.Active with Double = js.native
  /* 4 */ val All: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.PullRequestStatus.All with Double = js.native
  /* 3 */ val Completed: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.PullRequestStatus.Completed with Double = js.native
  /* 0 */ val NotSet: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.PullRequestStatus.NotSet with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PullRequestStatus with Double] = js.native
}

