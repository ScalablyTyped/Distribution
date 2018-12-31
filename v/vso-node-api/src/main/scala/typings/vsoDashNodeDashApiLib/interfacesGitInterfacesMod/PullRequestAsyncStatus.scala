package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  sealed trait Conflicts
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestAsyncStatus
  
  /**
    * Pull request merge failed.
    */
  @js.native
  sealed trait Failure
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestAsyncStatus
  
  /**
    * Status is not set. Default state.
    */
  @js.native
  sealed trait NotSet
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestAsyncStatus
  
  /**
    * Pull request merge is queued.
    */
  @js.native
  sealed trait Queued
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestAsyncStatus
  
  /**
    * Pull request merge rejected by policy.
    */
  @js.native
  sealed trait RejectedByPolicy
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestAsyncStatus
  
  /**
    * Pull request merge succeeded.
    */
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestAsyncStatus
  
  /* 2 */ val Conflicts: Conflicts with scala.Double = js.native
  /* 5 */ val Failure: Failure with scala.Double = js.native
  /* 0 */ val NotSet: NotSet with scala.Double = js.native
  /* 1 */ val Queued: Queued with scala.Double = js.native
  /* 4 */ val RejectedByPolicy: RejectedByPolicy with scala.Double = js.native
  /* 3 */ val Succeeded: Succeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestAsyncStatus with scala.Double
  ] = js.native
}

