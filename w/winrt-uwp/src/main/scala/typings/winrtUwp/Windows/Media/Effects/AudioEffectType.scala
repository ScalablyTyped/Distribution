package typings.winrtUwp.Windows.Media.Effects

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
  
}

