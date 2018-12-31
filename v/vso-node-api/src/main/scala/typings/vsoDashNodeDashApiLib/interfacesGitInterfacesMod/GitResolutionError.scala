package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  sealed trait InvalidPath
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionError
  
  /**
    * User set a blob id for resolving a content merge, but blob was not found in repo during application
    */
  @js.native
  sealed trait MergeContentNotFound
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionError
  
  /**
    * No error
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionError
  
  /**
    * Any error for which a more specific code doesn't apply
    */
  @js.native
  sealed trait OtherError
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionError
  
  /**
    * Attempted to resolve a conflict by moving a file to another path, but path was already in use
    */
  @js.native
  sealed trait PathInUse
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionError
  
  /**
    * GitResolutionAction was set to an unrecognized value
    */
  @js.native
  sealed trait UnknownAction
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionError
  
  /**
    * GitResolutionMergeType was set to an unrecognized value
    */
  @js.native
  sealed trait UnknownMergeType
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionError
  
  /* 3 */ val InvalidPath: InvalidPath with scala.Double = js.native
  /* 1 */ val MergeContentNotFound: MergeContentNotFound with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 255 */ val OtherError: OtherError with scala.Double = js.native
  /* 2 */ val PathInUse: PathInUse with scala.Double = js.native
  /* 4 */ val UnknownAction: UnknownAction with scala.Double = js.native
  /* 5 */ val UnknownMergeType: UnknownMergeType with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionError with scala.Double
  ] = js.native
}

