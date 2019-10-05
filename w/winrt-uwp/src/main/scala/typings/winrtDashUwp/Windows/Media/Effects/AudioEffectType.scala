package typings.winrtDashUwp.Windows.Media.Effects

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
  sealed trait acousticEchoCancellation extends AudioEffectType
  
  /** A automatic gain control effect. */
  @js.native
  sealed trait automaticGainControl extends AudioEffectType
  
  /** A bass boost effect. */
  @js.native
  sealed trait bassBoost extends AudioEffectType
  
  /** A bass management effect. */
  @js.native
  sealed trait bassManagement extends AudioEffectType
  
  /** A beam forming effect. */
  @js.native
  sealed trait beamForming extends AudioEffectType
  
  /** A constant tone removal effect. */
  @js.native
  sealed trait constantToneRemoval extends AudioEffectType
  
  /** A dynamic range compression effect. */
  @js.native
  sealed trait dynamicRangeCompression extends AudioEffectType
  
  /** An environmental effect. */
  @js.native
  sealed trait environmentalEffects extends AudioEffectType
  
  /** A equalizer effect. */
  @js.native
  sealed trait equalizer extends AudioEffectType
  
  /** A loudness equalizer effect. */
  @js.native
  sealed trait loudnessEqualizer extends AudioEffectType
  
  /** A noise suppression effect. */
  @js.native
  sealed trait noiseSuppression extends AudioEffectType
  
  /** Other. */
  @js.native
  sealed trait other extends AudioEffectType
  
  /** A room correction effect. */
  @js.native
  sealed trait roomCorrection extends AudioEffectType
  
  /** A speaker compensation effect. */
  @js.native
  sealed trait speakerCompensation extends AudioEffectType
  
  /** A speaker fill effect. */
  @js.native
  sealed trait speakerFill extends AudioEffectType
  
  /** A speaker protection effect. */
  @js.native
  sealed trait speakerProtection extends AudioEffectType
  
  /** A virtual headphones effect. */
  @js.native
  sealed trait virtualHeadphones extends AudioEffectType
  
  /** A virtual surround sound effect. */
  @js.native
  sealed trait virtualSurround extends AudioEffectType
  
  /* 1 */ val acousticEchoCancellation: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.acousticEchoCancellation with Double = js.native
  /* 3 */ val automaticGainControl: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.automaticGainControl with Double = js.native
  /* 8 */ val bassBoost: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.bassBoost with Double = js.native
  /* 13 */ val bassManagement: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.bassManagement with Double = js.native
  /* 4 */ val beamForming: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.beamForming with Double = js.native
  /* 5 */ val constantToneRemoval: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.constantToneRemoval with Double = js.native
  /* 17 */ val dynamicRangeCompression: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.dynamicRangeCompression with Double = js.native
  /* 14 */ val environmentalEffects: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.environmentalEffects with Double = js.native
  /* 6 */ val equalizer: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.equalizer with Double = js.native
  /* 7 */ val loudnessEqualizer: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.loudnessEqualizer with Double = js.native
  /* 2 */ val noiseSuppression: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.noiseSuppression with Double = js.native
  /* 0 */ val other: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.other with Double = js.native
  /* 12 */ val roomCorrection: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.roomCorrection with Double = js.native
  /* 16 */ val speakerCompensation: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.speakerCompensation with Double = js.native
  /* 11 */ val speakerFill: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.speakerFill with Double = js.native
  /* 15 */ val speakerProtection: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.speakerProtection with Double = js.native
  /* 10 */ val virtualHeadphones: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.virtualHeadphones with Double = js.native
  /* 9 */ val virtualSurround: typings.winrtDashUwp.Windows.Media.Effects.AudioEffectType.virtualSurround with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioEffectType with Double] = js.native
}

