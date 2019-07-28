package typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs

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
  
  /* 0 */ val done: typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs.MediaEffectClosedReason.done with Double = js.native
  /* 3 */ val effectCurrentlyUnloaded: typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs.MediaEffectClosedReason.effectCurrentlyUnloaded with Double = js.native
  /* 1 */ val unknownError: typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs.MediaEffectClosedReason.unknownError with Double = js.native
  /* 2 */ val unsupportedEncodingFormat: typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs.MediaEffectClosedReason.unsupportedEncodingFormat with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaEffectClosedReason with Double] = js.native
}

