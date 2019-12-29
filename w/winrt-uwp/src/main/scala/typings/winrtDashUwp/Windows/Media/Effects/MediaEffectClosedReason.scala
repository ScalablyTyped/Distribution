package typings.winrtDashUwp.Windows.Media.Effects

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaEffectClosedReason extends js.Object

/** Specifies the reason why a media effect was closed. */
@JSGlobal("Windows.Media.Effects.MediaEffectClosedReason")
@js.native
object MediaEffectClosedReason extends js.Object {
  /** The operation is complete. */
  @js.native
  sealed trait done extends MediaEffectClosedReason
  
  /** The effect has been unloaded. */
  @js.native
  sealed trait effectCurrentlyUnloaded extends MediaEffectClosedReason
  
  /** An unknown error has occurred. */
  @js.native
  sealed trait unknownError extends MediaEffectClosedReason
  
  /** The media effect does not support the required encoding format. */
  @js.native
  sealed trait unsupportedEncodingFormat extends MediaEffectClosedReason
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaEffectClosedReason with Double] = js.native
  /* 0 */ @js.native
  object done extends TopLevel[done with Double]
  
  /* 3 */ @js.native
  object effectCurrentlyUnloaded extends TopLevel[effectCurrentlyUnloaded with Double]
  
  /* 1 */ @js.native
  object unknownError extends TopLevel[unknownError with Double]
  
  /* 2 */ @js.native
  object unsupportedEncodingFormat extends TopLevel[unsupportedEncodingFormat with Double]
  
}

