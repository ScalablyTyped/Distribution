package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitAsyncRefOperationFailureStatus extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitAsyncRefOperationFailureStatus")
@js.native
object GitAsyncRefOperationFailureStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitAsyncRefOperationFailureStatus & Double] = js.native
  
  /**
    * Async operation was not found
    */
  @js.native
  sealed trait AsyncOperationNotFound
    extends StObject
       with GitAsyncRefOperationFailureStatus
  /* 8 */ val AsyncOperationNotFound: typings.vsoNodeApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.AsyncOperationNotFound & Double = js.native
  
  /**
    * The ref update request could not be completed because the user lacks the permission to create a branch
    */
  @js.native
  sealed trait CreateBranchPermissionRequired
    extends StObject
       with GitAsyncRefOperationFailureStatus
  /* 3 */ val CreateBranchPermissionRequired: typings.vsoNodeApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.CreateBranchPermissionRequired & Double = js.native
  
  /**
    * Git object is too large to materialize into memory
    */
  @js.native
  sealed trait GitObjectTooLarge
    extends StObject
       with GitAsyncRefOperationFailureStatus
  /* 6 */ val GitObjectTooLarge: typings.vsoNodeApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.GitObjectTooLarge & Double = js.native
  
  /**
    * Indicates that the ref update request could not be completed because the ref name presented in the request was not valid.
    */
  @js.native
  sealed trait InvalidRefName
    extends StObject
       with GitAsyncRefOperationFailureStatus
  /* 1 */ val InvalidRefName: typings.vsoNodeApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.InvalidRefName & Double = js.native
  
  /**
    * No status
    */
  @js.native
  sealed trait None
    extends StObject
       with GitAsyncRefOperationFailureStatus
  /* 0 */ val None: typings.vsoNodeApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.None & Double = js.native
  
  /**
    * Identity who authorized the operation was not found
    */
  @js.native
  sealed trait OperationIndentityNotFound
    extends StObject
       with GitAsyncRefOperationFailureStatus
  /* 7 */ val OperationIndentityNotFound: typings.vsoNodeApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.OperationIndentityNotFound & Double = js.native
  
  /**
    * Unexpected failure
    */
  @js.native
  sealed trait Other
    extends StObject
       with GitAsyncRefOperationFailureStatus
  /* 9 */ val Other: typings.vsoNodeApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.Other & Double = js.native
  
  /**
    * The ref update could not be completed because, in case-insensitive mode, the ref name conflicts with an existing, differently-cased ref name.
    */
  @js.native
  sealed trait RefNameConflict
    extends StObject
       with GitAsyncRefOperationFailureStatus
  /* 2 */ val RefNameConflict: typings.vsoNodeApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.RefNameConflict & Double = js.native
  
  /**
    * Target branch was deleted after Git async operation started
    */
  @js.native
  sealed trait TargetBranchDeleted
    extends StObject
       with GitAsyncRefOperationFailureStatus
  /* 5 */ val TargetBranchDeleted: typings.vsoNodeApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.TargetBranchDeleted & Double = js.native
  
  /**
    * The ref update request could not be completed because the user lacks write permissions required to write this ref
    */
  @js.native
  sealed trait WritePermissionRequired
    extends StObject
       with GitAsyncRefOperationFailureStatus
  /* 4 */ val WritePermissionRequired: typings.vsoNodeApi.interfacesGitInterfacesMod.GitAsyncRefOperationFailureStatus.WritePermissionRequired & Double = js.native
}
