package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionError extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionError")
@js.native
object GitResolutionError extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionError with Double] = js.native
  
  /**
    * No error
    */
  @js.native
  sealed trait InvalidPath extends GitResolutionError
  /* 3 */ val InvalidPath: typings.vsoNodeApi.gitInterfacesMod.GitResolutionError.InvalidPath with Double = js.native
  
  /**
    * User set a blob id for resolving a content merge, but blob was not found in repo during application
    */
  @js.native
  sealed trait MergeContentNotFound extends GitResolutionError
  /* 1 */ val MergeContentNotFound: typings.vsoNodeApi.gitInterfacesMod.GitResolutionError.MergeContentNotFound with Double = js.native
  
  /**
    * No error
    */
  @js.native
  sealed trait None extends GitResolutionError
  /* 0 */ val None: typings.vsoNodeApi.gitInterfacesMod.GitResolutionError.None with Double = js.native
  
  /**
    * Any error for which a more specific code doesn't apply
    */
  @js.native
  sealed trait OtherError extends GitResolutionError
  /* 255 */ val OtherError: typings.vsoNodeApi.gitInterfacesMod.GitResolutionError.OtherError with Double = js.native
  
  /**
    * Attempted to resolve a conflict by moving a file to another path, but path was already in use
    */
  @js.native
  sealed trait PathInUse extends GitResolutionError
  /* 2 */ val PathInUse: typings.vsoNodeApi.gitInterfacesMod.GitResolutionError.PathInUse with Double = js.native
  
  /**
    * GitResolutionAction was set to an unrecognized value
    */
  @js.native
  sealed trait UnknownAction extends GitResolutionError
  /* 4 */ val UnknownAction: typings.vsoNodeApi.gitInterfacesMod.GitResolutionError.UnknownAction with Double = js.native
  
  /**
    * GitResolutionMergeType was set to an unrecognized value
    */
  @js.native
  sealed trait UnknownMergeType extends GitResolutionError
  /* 5 */ val UnknownMergeType: typings.vsoNodeApi.gitInterfacesMod.GitResolutionError.UnknownMergeType with Double = js.native
}
