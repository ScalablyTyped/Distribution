package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  sealed trait AsyncOperationNotFound
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus
  
  /**
       * The ref update request could not be completed because the user lacks the permission to create a branch
       */
  @js.native
  sealed trait CreateBranchPermissionRequired
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus
  
  /**
       * Git object is too large to materialize into memory
       */
  @js.native
  sealed trait GitObjectTooLarge
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus
  
  /**
       * Indicates that the ref update request could not be completed because the ref name presented in the request was not valid.
       */
  @js.native
  sealed trait InvalidRefName
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus
  
  /**
       * No status
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus
  
  /**
       * Identity who authorized the operation was not found
       */
  @js.native
  sealed trait OperationIndentityNotFound
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus
  
  /**
       * Unexpected failure
       */
  @js.native
  sealed trait Other
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus
  
  /**
       * The ref update could not be completed because, in case-insensitive mode, the ref name conflicts with an existing, differently-cased ref name.
       */
  @js.native
  sealed trait RefNameConflict
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus
  
  /**
       * Target branch was deleted after Git async operation started
       */
  @js.native
  sealed trait TargetBranchDeleted
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus
  
  /**
       * The ref update request could not be completed because the user lacks write permissions required to write this ref
       */
  @js.native
  sealed trait WritePermissionRequired
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus
  
  /* 8 */ val AsyncOperationNotFound: AsyncOperationNotFound with scala.Double = js.native
  /* 3 */ val CreateBranchPermissionRequired: CreateBranchPermissionRequired with scala.Double = js.native
  /* 6 */ val GitObjectTooLarge: GitObjectTooLarge with scala.Double = js.native
  /* 1 */ val InvalidRefName: InvalidRefName with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 7 */ val OperationIndentityNotFound: OperationIndentityNotFound with scala.Double = js.native
  /* 9 */ val Other: Other with scala.Double = js.native
  /* 2 */ val RefNameConflict: RefNameConflict with scala.Double = js.native
  /* 5 */ val TargetBranchDeleted: TargetBranchDeleted with scala.Double = js.native
  /* 4 */ val WritePermissionRequired: WritePermissionRequired with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus with scala.Double
  ] = js.native
}

