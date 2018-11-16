package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioEffectType extends js.Object

/** Defines values for audio effect types. */
@JSGlobal("Windows.Media.Effects.AudioEffectType")
@js.native
object AudioEffectType extends js.Object {
  /** An acoustic echo cancellation effect. */
  @js.native
  sealed trait acousticEchoCancellation
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** A automatic gain control effect. */
  @js.native
  sealed trait automaticGainControl
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** A bass boost effect. */
  @js.native
  sealed trait bassBoost
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** A bass management effect. */
  @js.native
  sealed trait bassManagement
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** A beam forming effect. */
  @js.native
  sealed trait beamForming
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** A constant tone removal effect. */
  @js.native
  sealed trait constantToneRemoval
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** A dynamic range compression effect. */
  @js.native
  sealed trait dynamicRangeCompression
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** An environmental effect. */
  @js.native
  sealed trait environmentalEffects
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** A equalizer effect. */
  @js.native
  sealed trait equalizer
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** A loudness equalizer effect. */
  @js.native
  sealed trait loudnessEqualizer
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** A noise suppression effect. */
  @js.native
  sealed trait noiseSuppression
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** Other. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** A room correction effect. */
  @js.native
  sealed trait roomCorrection
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** A speaker compensation effect. */
  @js.native
  sealed trait speakerCompensation
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** A speaker fill effect. */
  @js.native
  sealed trait speakerFill
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** A speaker protection effect. */
  @js.native
  sealed trait speakerProtection
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** A virtual headphones effect. */
  @js.native
  sealed trait virtualHeadphones
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  /** A virtual surround sound effect. */
  @js.native
  sealed trait virtualSurround
    extends winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType
  
  val acousticEchoCancellation: acousticEchoCancellation with java.lang.String = js.native
  val automaticGainControl: automaticGainControl with java.lang.String = js.native
  val bassBoost: bassBoost with java.lang.String = js.native
  val bassManagement: bassManagement with java.lang.String = js.native
  val beamForming: beamForming with java.lang.String = js.native
  val constantToneRemoval: constantToneRemoval with java.lang.String = js.native
  val dynamicRangeCompression: dynamicRangeCompression with java.lang.String = js.native
  val environmentalEffects: environmentalEffects with java.lang.String = js.native
  val equalizer: equalizer with java.lang.String = js.native
  val loudnessEqualizer: loudnessEqualizer with java.lang.String = js.native
  val noiseSuppression: noiseSuppression with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val roomCorrection: roomCorrection with java.lang.String = js.native
  val speakerCompensation: speakerCompensation with java.lang.String = js.native
  val speakerFill: speakerFill with java.lang.String = js.native
  val speakerProtection: speakerProtection with java.lang.String = js.native
  val virtualHeadphones: virtualHeadphones with java.lang.String = js.native
  val virtualSurround: virtualSurround with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType with java.lang.String
  ] = js.native
}

