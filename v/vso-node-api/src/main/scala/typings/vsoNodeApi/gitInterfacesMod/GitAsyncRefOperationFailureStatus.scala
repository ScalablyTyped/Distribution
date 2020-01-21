package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitAsyncRefOperationFailureStatus extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitAsyncRefOperationFailureStatus")
@js.native
object GitAsyncRefOperationFailureStatus extends js.Object {
  /**
    * Async operation was not found
    */
  @js.native
  sealed trait AsyncOperationNotFound extends GitAsyncRefOperationFailureStatus
  
  /**
    * The ref update request could not be completed because the user lacks the permission to create a branch
    */
  @js.native
  sealed trait CreateBranchPermissionRequired extends GitAsyncRefOperationFailureStatus
  
  /**
    * Git object is too large to materialize into memory
    */
  @js.native
  sealed trait GitObjectTooLarge extends GitAsyncRefOperationFailureStatus
  
  /**
    * Indicates that the ref update request could not be completed because the ref name presented in the request was not valid.
    */
  @js.native
  sealed trait InvalidRefName extends GitAsyncRefOperationFailureStatus
  
  /**
    * No status
    */
  @js.native
  sealed trait None extends GitAsyncRefOperationFailureStatus
  
  /**
    * Identity who authorized the operation was not found
    */
  @js.native
  sealed trait OperationIndentityNotFound extends GitAsyncRefOperationFailureStatus
  
  /**
    * Unexpected failure
    */
  @js.native
  sealed trait Other extends GitAsyncRefOperationFailureStatus
  
  /**
    * The ref update could not be completed because, in case-insensitive mode, the ref name conflicts with an existing, differently-cased ref name.
    */
  @js.native
  sealed trait RefNameConflict extends GitAsyncRefOperationFailureStatus
  
  /**
    * Target branch was deleted after Git async operation started
    */
  @js.native
  sealed trait TargetBranchDeleted extends GitAsyncRefOperationFailureStatus
  
  /**
    * The ref update request could not be completed because the user lacks write permissions required to write this ref
    */
  @js.native
  sealed trait WritePermissionRequired extends GitAsyncRefOperationFailureStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitAsyncRefOperationFailureStatus with Double] = js.native
  /* 8 */ @js.native
  object AsyncOperationNotFound extends TopLevel[AsyncOperationNotFound with Double]
  
  /* 3 */ @js.native
  object CreateBranchPermissionRequired extends TopLevel[CreateBranchPermissionRequired with Double]
  
  /* 6 */ @js.native
  object GitObjectTooLarge extends TopLevel[GitObjectTooLarge with Double]
  
  /* 1 */ @js.native
  object InvalidRefName extends TopLevel[InvalidRefName with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 7 */ @js.native
  object OperationIndentityNotFound extends TopLevel[OperationIndentityNotFound with Double]
  
  /* 9 */ @js.native
  object Other extends TopLevel[Other with Double]
  
  /* 2 */ @js.native
  object RefNameConflict extends TopLevel[RefNameConflict with Double]
  
  /* 5 */ @js.native
  object TargetBranchDeleted extends TopLevel[TargetBranchDeleted with Double]
  
  /* 4 */ @js.native
  object WritePermissionRequired extends TopLevel[WritePermissionRequired with Double]
  
}

