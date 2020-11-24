package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitAsyncRefOperationFailureStatus extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitAsyncRefOperationFailureStatus")
@js.native
object GitAsyncRefOperationFailureStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitAsyncRefOperationFailureStatus with Double] = js.native
  
  /**
    * Async operation was not found
    */
  @js.native
  sealed trait AsyncOperationNotFound extends GitAsyncRefOperationFailureStatus
  /* 8 */ @js.native
  object AsyncOperationNotFound extends TopLevel[AsyncOperationNotFound with Double]
  
  /**
    * The ref update request could not be completed because the user lacks the permission to create a branch
    */
  @js.native
  sealed trait CreateBranchPermissionRequired extends GitAsyncRefOperationFailureStatus
  /* 3 */ @js.native
  object CreateBranchPermissionRequired extends TopLevel[CreateBranchPermissionRequired with Double]
  
  /**
    * Git object is too large to materialize into memory
    */
  @js.native
  sealed trait GitObjectTooLarge extends GitAsyncRefOperationFailureStatus
  /* 6 */ @js.native
  object GitObjectTooLarge extends TopLevel[GitObjectTooLarge with Double]
  
  /**
    * Indicates that the ref update request could not be completed because the ref name presented in the request was not valid.
    */
  @js.native
  sealed trait InvalidRefName extends GitAsyncRefOperationFailureStatus
  /* 1 */ @js.native
  object InvalidRefName extends TopLevel[InvalidRefName with Double]
  
  /**
    * No status
    */
  @js.native
  sealed trait None extends GitAsyncRefOperationFailureStatus
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Identity who authorized the operation was not found
    */
  @js.native
  sealed trait OperationIndentityNotFound extends GitAsyncRefOperationFailureStatus
  /* 7 */ @js.native
  object OperationIndentityNotFound extends TopLevel[OperationIndentityNotFound with Double]
  
  /**
    * Unexpected failure
    */
  @js.native
  sealed trait Other extends GitAsyncRefOperationFailureStatus
  /* 9 */ @js.native
  object Other extends TopLevel[Other with Double]
  
  /**
    * The ref update could not be completed because, in case-insensitive mode, the ref name conflicts with an existing, differently-cased ref name.
    */
  @js.native
  sealed trait RefNameConflict extends GitAsyncRefOperationFailureStatus
  /* 2 */ @js.native
  object RefNameConflict extends TopLevel[RefNameConflict with Double]
  
  /**
    * Target branch was deleted after Git async operation started
    */
  @js.native
  sealed trait TargetBranchDeleted extends GitAsyncRefOperationFailureStatus
  /* 5 */ @js.native
  object TargetBranchDeleted extends TopLevel[TargetBranchDeleted with Double]
  
  /**
    * The ref update request could not be completed because the user lacks write permissions required to write this ref
    */
  @js.native
  sealed trait WritePermissionRequired extends GitAsyncRefOperationFailureStatus
  /* 4 */ @js.native
  object WritePermissionRequired extends TopLevel[WritePermissionRequired with Double]
}
