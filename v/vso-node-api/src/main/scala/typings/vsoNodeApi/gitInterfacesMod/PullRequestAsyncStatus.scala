package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PullRequestAsyncStatus extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "PullRequestAsyncStatus")
@js.native
object PullRequestAsyncStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PullRequestAsyncStatus with Double] = js.native
  
  /**
    * Pull request merge failed due to conflicts.
    */
  @js.native
  sealed trait Conflicts extends PullRequestAsyncStatus
  /* 2 */ @js.native
  object Conflicts extends TopLevel[Conflicts with Double]
  
  /**
    * Pull request merge failed.
    */
  @js.native
  sealed trait Failure extends PullRequestAsyncStatus
  /* 5 */ @js.native
  object Failure extends TopLevel[Failure with Double]
  
  /**
    * Status is not set. Default state.
    */
  @js.native
  sealed trait NotSet extends PullRequestAsyncStatus
  /* 0 */ @js.native
  object NotSet extends TopLevel[NotSet with Double]
  
  /**
    * Pull request merge is queued.
    */
  @js.native
  sealed trait Queued extends PullRequestAsyncStatus
  /* 1 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
  /**
    * Pull request merge rejected by policy.
    */
  @js.native
  sealed trait RejectedByPolicy extends PullRequestAsyncStatus
  /* 4 */ @js.native
  object RejectedByPolicy extends TopLevel[RejectedByPolicy with Double]
  
  /**
    * Pull request merge succeeded.
    */
  @js.native
  sealed trait Succeeded extends PullRequestAsyncStatus
  /* 3 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
}
