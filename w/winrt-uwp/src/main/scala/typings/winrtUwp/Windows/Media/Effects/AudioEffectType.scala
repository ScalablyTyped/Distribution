package typings.winrtUwp.Windows.Media.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioEffectType extends StObject
/** Defines values for audio effect types. */
@JSGlobal("Windows.Media.Effects.AudioEffectType")
@js.native
object AudioEffectType extends StObject {
  
  /** An acoustic echo cancellation effect. */
  @js.native
  sealed trait acousticEchoCancellation
    extends StObject
       with AudioEffectType
  
  /** A automatic gain control effect. */
  @js.native
  sealed trait automaticGainControl
    extends StObject
       with AudioEffectType
  
  /** A bass boost effect. */
  @js.native
  sealed trait bassBoost
    extends StObject
       with AudioEffectType
  
  /** A bass management effect. */
  @js.native
  sealed trait bassManagement
    extends StObject
       with AudioEffectType
  
  /** A beam forming effect. */
  @js.native
  sealed trait beamForming
    extends StObject
       with AudioEffectType
  
  /** A constant tone removal effect. */
  @js.native
  sealed trait constantToneRemoval
    extends StObject
       with AudioEffectType
  
  /** A dynamic range compression effect. */
  @js.native
  sealed trait dynamicRangeCompression
    extends StObject
       with AudioEffectType
  
  /** An environmental effect. */
  @js.native
  sealed trait environmentalEffects
    extends StObject
       with AudioEffectType
  
  /** A equalizer effect. */
  @js.native
  sealed trait equalizer
    extends StObject
       with AudioEffectType
  
  /** A loudness equalizer effect. */
  @js.native
  sealed trait loudnessEqualizer
    extends StObject
       with AudioEffectType
  
  /** A noise suppression effect. */
  @js.native
  sealed trait noiseSuppression
    extends StObject
       with AudioEffectType
  
  /** Other. */
  @js.native
  sealed trait other
    extends StObject
       with AudioEffectType
  
  /** A room correction effect. */
  @js.native
  sealed trait roomCorrection
    extends StObject
       with AudioEffectType
  
  /** A speaker compensation effect. */
  @js.native
  sealed trait speakerCompensation
    extends StObject
       with AudioEffectType
  
  /** A speaker fill effect. */
  @js.native
  sealed trait speakerFill
    extends StObject
       with AudioEffectType
  
  /** A speaker protection effect. */
  @js.native
  sealed trait speakerProtection
    extends StObject
       with AudioEffectType
  
  /** A virtual headphones effect. */
  @js.native
  sealed trait virtualHeadphones
    extends StObject
       with AudioEffectType
  
  /** A virtual surround sound effect. */
  @js.native
  sealed trait virtualSurround
    extends StObject
       with AudioEffectType
}
