package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  sealed trait Abandoned
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestStatus
  
  /**
    * Pull request is active.
    */
  @js.native
  sealed trait Active
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestStatus
  
  /**
    * Used in pull request search criterias to include all statuses.
    */
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestStatus
  
  /**
    * Pull request is completed.
    */
  @js.native
  sealed trait Completed
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestStatus
  
  /**
    * Status not set. Default state.
    */
  @js.native
  sealed trait NotSet
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestStatus
  
  /* 2 */ val Abandoned: Abandoned with scala.Double = js.native
  /* 1 */ val Active: Active with scala.Double = js.native
  /* 4 */ val All: All with scala.Double = js.native
  /* 3 */ val Completed: Completed with scala.Double = js.native
  /* 0 */ val NotSet: NotSet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestStatus with scala.Double
  ] = js.native
}

