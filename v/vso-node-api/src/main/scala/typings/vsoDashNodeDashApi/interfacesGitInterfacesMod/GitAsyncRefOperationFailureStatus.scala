package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
  
  /* 8 */ val AsyncOperationNotFound: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.AsyncOperationNotFound with Double = js.native
  /* 3 */ val CreateBranchPermissionRequired: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.CreateBranchPermissionRequired with Double = js.native
  /* 6 */ val GitObjectTooLarge: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.GitObjectTooLarge with Double = js.native
  /* 1 */ val InvalidRefName: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.InvalidRefName with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.None with Double = js.native
  /* 7 */ val OperationIndentityNotFound: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.OperationIndentityNotFound with Double = js.native
  /* 9 */ val Other: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.Other with Double = js.native
  /* 2 */ val RefNameConflict: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.RefNameConflict with Double = js.native
  /* 5 */ val TargetBranchDeleted: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.TargetBranchDeleted with Double = js.native
  /* 4 */ val WritePermissionRequired: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.WritePermissionRequired with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitAsyncRefOperationFailureStatus with Double] = js.native
}

