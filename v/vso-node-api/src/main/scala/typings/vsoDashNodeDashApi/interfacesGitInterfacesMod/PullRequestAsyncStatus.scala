package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PullRequestAsyncStatus extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "PullRequestAsyncStatus")
@js.native
object PullRequestAsyncStatus extends js.Object {
  /**
    * Pull request merge failed due to conflicts.
    */
  @js.native
  sealed trait Conflicts extends PullRequestAsyncStatus
  
  /**
    * Pull request merge failed.
    */
  @js.native
  sealed trait Failure extends PullRequestAsyncStatus
  
  /**
    * Status is not set. Default state.
    */
  @js.native
  sealed trait NotSet extends PullRequestAsyncStatus
  
  /**
    * Pull request merge is queued.
    */
  @js.native
  sealed trait Queued extends PullRequestAsyncStatus
  
  /**
    * Pull request merge rejected by policy.
    */
  @js.native
  sealed trait RejectedByPolicy extends PullRequestAsyncStatus
  
  /**
    * Pull request merge succeeded.
    */
  @js.native
  sealed trait Succeeded extends PullRequestAsyncStatus
  
  /* 2 */ val Conflicts: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.PullRequestAsyncStatus.Conflicts with Double = js.native
  /* 5 */ val Failure: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.PullRequestAsyncStatus.Failure with Double = js.native
  /* 0 */ val NotSet: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.PullRequestAsyncStatus.NotSet with Double = js.native
  /* 1 */ val Queued: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.PullRequestAsyncStatus.Queued with Double = js.native
  /* 4 */ val RejectedByPolicy: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.PullRequestAsyncStatus.RejectedByPolicy with Double = js.native
  /* 3 */ val Succeeded: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.PullRequestAsyncStatus.Succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PullRequestAsyncStatus with Double] = js.native
}

