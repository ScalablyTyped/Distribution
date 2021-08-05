package typings.winrtUwp.Windows.Media.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an audio effect. */
trait AudioEffect extends StObject {
  
  /** Gets the type of the audio effect. */
  var audioEffectType: AudioEffectType
}
object AudioEffect {
  
  inline def apply(audioEffectType: AudioEffectType): AudioEffect = {
    val __obj = js.Dynamic.literal(audioEffectType = audioEffectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioEffect]
  }
  
  extension [Self <: AudioEffect](x: Self) {
    
    inline def setAudioEffectType(value: AudioEffectType): Self = StObject.set(x, "audioEffectType", value.asInstanceOf[js.Any])
  }
}
