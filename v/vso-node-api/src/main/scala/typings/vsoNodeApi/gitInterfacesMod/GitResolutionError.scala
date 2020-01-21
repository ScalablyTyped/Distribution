package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionError with Double] = js.native
  /* 3 */ @js.native
  object InvalidPath extends TopLevel[InvalidPath with Double]
  
  /* 1 */ @js.native
  object MergeContentNotFound extends TopLevel[MergeContentNotFound with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 255 */ @js.native
  object OtherError extends TopLevel[OtherError with Double]
  
  /* 2 */ @js.native
  object PathInUse extends TopLevel[PathInUse with Double]
  
  /* 4 */ @js.native
  object UnknownAction extends TopLevel[UnknownAction with Double]
  
  /* 5 */ @js.native
  object UnknownMergeType extends TopLevel[UnknownMergeType with Double]
  
}

