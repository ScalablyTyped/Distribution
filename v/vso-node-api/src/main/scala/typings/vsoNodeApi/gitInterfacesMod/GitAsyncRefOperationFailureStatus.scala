package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitAsyncRefOperationFailureStatus extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitAsyncRefOperationFailureStatus")
@js.native
object GitAsyncRefOperationFailureStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitAsyncRefOperationFailureStatus with Double] = js.native
  
  /**
    * Async operation was not found
    */
  @js.native
  sealed trait AsyncOperationNotFound extends GitAsyncRefOperationFailureStatus
  /* 8 */ val AsyncOperationNotFound: typings.vsoNodeApi.gitInterfacesMod.GitAsyncRefOperationFailureStatus.AsyncOperationNotFound with Double = js.native
  
  /**
    * The ref update request could not be completed because the user lacks the permission to create a branch
    */
  @js.native
  sealed trait CreateBranchPermissionRequired extends GitAsyncRefOperationFailureStatus
  /* 3 */ val CreateBranchPermissionRequired: typings.vsoNodeApi.gitInterfacesMod.GitAsyncRefOperationFailureStatus.CreateBranchPermissionRequired with Double = js.native
  
  /**
    * Git object is too large to materialize into memory
    */
  @js.native
  sealed trait GitObjectTooLarge extends GitAsyncRefOperationFailureStatus
  /* 6 */ val GitObjectTooLarge: typings.vsoNodeApi.gitInterfacesMod.GitAsyncRefOperationFailureStatus.GitObjectTooLarge with Double = js.native
  
  /**
    * Indicates that the ref update request could not be completed because the ref name presented in the request was not valid.
    */
  @js.native
  sealed trait InvalidRefName extends GitAsyncRefOperationFailureStatus
  /* 1 */ val InvalidRefName: typings.vsoNodeApi.gitInterfacesMod.GitAsyncRefOperationFailureStatus.InvalidRefName with Double = js.native
  
  /**
    * No status
    */
  @js.native
  sealed trait None extends GitAsyncRefOperationFailureStatus
  /* 0 */ val None: typings.vsoNodeApi.gitInterfacesMod.GitAsyncRefOperationFailureStatus.None with Double = js.native
  
  /**
    * Identity who authorized the operation was not found
    */
  @js.native
  sealed trait OperationIndentityNotFound extends GitAsyncRefOperationFailureStatus
  /* 7 */ val OperationIndentityNotFound: typings.vsoNodeApi.gitInterfacesMod.GitAsyncRefOperationFailureStatus.OperationIndentityNotFound with Double = js.native
  
  /**
    * Unexpected failure
    */
  @js.native
  sealed trait Other extends GitAsyncRefOperationFailureStatus
  /* 9 */ val Other: typings.vsoNodeApi.gitInterfacesMod.GitAsyncRefOperationFailureStatus.Other with Double = js.native
  
  /**
    * The ref update could not be completed because, in case-insensitive mode, the ref name conflicts with an existing, differently-cased ref name.
    */
  @js.native
  sealed trait RefNameConflict extends GitAsyncRefOperationFailureStatus
  /* 2 */ val RefNameConflict: typings.vsoNodeApi.gitInterfacesMod.GitAsyncRefOperationFailureStatus.RefNameConflict with Double = js.native
  
  /**
    * Target branch was deleted after Git async operation started
    */
  @js.native
  sealed trait TargetBranchDeleted extends GitAsyncRefOperationFailureStatus
  /* 5 */ val TargetBranchDeleted: typings.vsoNodeApi.gitInterfacesMod.GitAsyncRefOperationFailureStatus.TargetBranchDeleted with Double = js.native
  
  /**
    * The ref update request could not be completed because the user lacks write permissions required to write this ref
    */
  @js.native
  sealed trait WritePermissionRequired extends GitAsyncRefOperationFailureStatus
  /* 4 */ val WritePermissionRequired: typings.vsoNodeApi.gitInterfacesMod.GitAsyncRefOperationFailureStatus.WritePermissionRequired with Double = js.native
}
