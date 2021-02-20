package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PullRequestAsyncStatus extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "PullRequestAsyncStatus")
@js.native
object PullRequestAsyncStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PullRequestAsyncStatus with Double] = js.native
  
  /**
    * Pull request merge failed due to conflicts.
    */
  @js.native
  sealed trait Conflicts extends PullRequestAsyncStatus
  /* 2 */ val Conflicts: typings.vsoNodeApi.gitInterfacesMod.PullRequestAsyncStatus.Conflicts with Double = js.native
  
  /**
    * Pull request merge failed.
    */
  @js.native
  sealed trait Failure extends PullRequestAsyncStatus
  /* 5 */ val Failure: typings.vsoNodeApi.gitInterfacesMod.PullRequestAsyncStatus.Failure with Double = js.native
  
  /**
    * Status is not set. Default state.
    */
  @js.native
  sealed trait NotSet extends PullRequestAsyncStatus
  /* 0 */ val NotSet: typings.vsoNodeApi.gitInterfacesMod.PullRequestAsyncStatus.NotSet with Double = js.native
  
  /**
    * Pull request merge is queued.
    */
  @js.native
  sealed trait Queued extends PullRequestAsyncStatus
  /* 1 */ val Queued: typings.vsoNodeApi.gitInterfacesMod.PullRequestAsyncStatus.Queued with Double = js.native
  
  /**
    * Pull request merge rejected by policy.
    */
  @js.native
  sealed trait RejectedByPolicy extends PullRequestAsyncStatus
  /* 4 */ val RejectedByPolicy: typings.vsoNodeApi.gitInterfacesMod.PullRequestAsyncStatus.RejectedByPolicy with Double = js.native
  
  /**
    * Pull request merge succeeded.
    */
  @js.native
  sealed trait Succeeded extends PullRequestAsyncStatus
  /* 3 */ val Succeeded: typings.vsoNodeApi.gitInterfacesMod.PullRequestAsyncStatus.Succeeded with Double = js.native
}
