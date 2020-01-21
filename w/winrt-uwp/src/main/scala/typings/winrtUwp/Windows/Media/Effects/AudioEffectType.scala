package typings.winrtUwp.Windows.Media.Effects

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioEffectType with Double] = js.native
  /* 1 */ @js.native
  object acousticEchoCancellation extends TopLevel[acousticEchoCancellation with Double]
  
  /* 3 */ @js.native
  object automaticGainControl extends TopLevel[automaticGainControl with Double]
  
  /* 8 */ @js.native
  object bassBoost extends TopLevel[bassBoost with Double]
  
  /* 13 */ @js.native
  object bassManagement extends TopLevel[bassManagement with Double]
  
  /* 4 */ @js.native
  object beamForming extends TopLevel[beamForming with Double]
  
  /* 5 */ @js.native
  object constantToneRemoval extends TopLevel[constantToneRemoval with Double]
  
  /* 17 */ @js.native
  object dynamicRangeCompression extends TopLevel[dynamicRangeCompression with Double]
  
  /* 14 */ @js.native
  object environmentalEffects extends TopLevel[environmentalEffects with Double]
  
  /* 6 */ @js.native
  object equalizer extends TopLevel[equalizer with Double]
  
  /* 7 */ @js.native
  object loudnessEqualizer extends TopLevel[loudnessEqualizer with Double]
  
  /* 2 */ @js.native
  object noiseSuppression extends TopLevel[noiseSuppression with Double]
  
  /* 0 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 12 */ @js.native
  object roomCorrection extends TopLevel[roomCorrection with Double]
  
  /* 16 */ @js.native
  object speakerCompensation extends TopLevel[speakerCompensation with Double]
  
  /* 11 */ @js.native
  object speakerFill extends TopLevel[speakerFill with Double]
  
  /* 15 */ @js.native
  object speakerProtection extends TopLevel[speakerProtection with Double]
  
  /* 10 */ @js.native
  object virtualHeadphones extends TopLevel[virtualHeadphones with Double]
  
  /* 9 */ @js.native
  object virtualSurround extends TopLevel[virtualSurround with Double]
  
}

