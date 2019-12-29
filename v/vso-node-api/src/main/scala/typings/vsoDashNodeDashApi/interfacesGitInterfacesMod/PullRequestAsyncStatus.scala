package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PullRequestAsyncStatus with Double] = js.native
  /* 2 */ @js.native
  object Conflicts extends TopLevel[Conflicts with Double]
  
  /* 5 */ @js.native
  object Failure extends TopLevel[Failure with Double]
  
  /* 0 */ @js.native
  object NotSet extends TopLevel[NotSet with Double]
  
  /* 1 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
  /* 4 */ @js.native
  object RejectedByPolicy extends TopLevel[RejectedByPolicy with Double]
  
  /* 3 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
}

