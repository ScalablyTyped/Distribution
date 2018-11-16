package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs

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
  sealed trait done
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.MediaEffectClosedReason
  
  /** The effect has been unloaded. */
  @js.native
  sealed trait effectCurrentlyUnloaded
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.MediaEffectClosedReason
  
  /** An unknown error has occurred. */
  @js.native
  sealed trait unknownError
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.MediaEffectClosedReason
  
  /** The media effect does not support the required encoding format. */
  @js.native
  sealed trait unsupportedEncodingFormat
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.MediaEffectClosedReason
  
  val done: done with java.lang.String = js.native
  val effectCurrentlyUnloaded: effectCurrentlyUnloaded with java.lang.String = js.native
  val unknownError: unknownError with java.lang.String = js.native
  val unsupportedEncodingFormat: unsupportedEncodingFormat with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.MediaEffectClosedReason with java.lang.String
  ] = js.native
}

