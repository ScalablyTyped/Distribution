package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitResolutionError extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionError")
@js.native
object GitResolutionError extends js.Object {
  /**
    * No error
    */
  @js.native
  sealed trait InvalidPath extends GitResolutionError
  
  /**
    * User set a blob id for resolving a content merge, but blob was not found in repo during application
    */
  @js.native
  sealed trait MergeContentNotFound extends GitResolutionError
  
  /**
    * No error
    */
  @js.native
  sealed trait None extends GitResolutionError
  
  /**
    * Any error for which a more specific code doesn't apply
    */
  @js.native
  sealed trait OtherError extends GitResolutionError
  
  /**
    * Attempted to resolve a conflict by moving a file to another path, but path was already in use
    */
  @js.native
  sealed trait PathInUse extends GitResolutionError
  
  /**
    * GitResolutionAction was set to an unrecognized value
    */
  @js.native
  sealed trait UnknownAction extends GitResolutionError
  
  /**
    * GitResolutionMergeType was set to an unrecognized value
    */
  @js.native
  sealed trait UnknownMergeType extends GitResolutionError
  
  /* 3 */ val InvalidPath: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionError.InvalidPath with Double = js.native
  /* 1 */ val MergeContentNotFound: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionError.MergeContentNotFound with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionError.None with Double = js.native
  /* 255 */ val OtherError: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionError.OtherError with Double = js.native
  /* 2 */ val PathInUse: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionError.PathInUse with Double = js.native
  /* 4 */ val UnknownAction: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionError.UnknownAction with Double = js.native
  /* 5 */ val UnknownMergeType: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionError.UnknownMergeType with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionError with Double] = js.native
}

