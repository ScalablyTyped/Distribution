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
  
  /* 1 */ val acousticEchoCancellation: acousticEchoCancellation with scala.Double = js.native
  /* 3 */ val automaticGainControl: automaticGainControl with scala.Double = js.native
  /* 8 */ val bassBoost: bassBoost with scala.Double = js.native
  /* 13 */ val bassManagement: bassManagement with scala.Double = js.native
  /* 4 */ val beamForming: beamForming with scala.Double = js.native
  /* 5 */ val constantToneRemoval: constantToneRemoval with scala.Double = js.native
  /* 17 */ val dynamicRangeCompression: dynamicRangeCompression with scala.Double = js.native
  /* 14 */ val environmentalEffects: environmentalEffects with scala.Double = js.native
  /* 6 */ val equalizer: equalizer with scala.Double = js.native
  /* 7 */ val loudnessEqualizer: loudnessEqualizer with scala.Double = js.native
  /* 2 */ val noiseSuppression: noiseSuppression with scala.Double = js.native
  /* 0 */ val other: other with scala.Double = js.native
  /* 12 */ val roomCorrection: roomCorrection with scala.Double = js.native
  /* 16 */ val speakerCompensation: speakerCompensation with scala.Double = js.native
  /* 11 */ val speakerFill: speakerFill with scala.Double = js.native
  /* 15 */ val speakerProtection: speakerProtection with scala.Double = js.native
  /* 10 */ val virtualHeadphones: virtualHeadphones with scala.Double = js.native
  /* 9 */ val virtualSurround: virtualSurround with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.AudioEffectType with scala.Double] = js.native
}

