package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmlProsodyAttributes extends StObject {
  
  /** pitch - Specify the pitch, available values: default, x-low, low, medium, high, x-high, +n%, -n% */
  var pitch: js.UndefOr[String] = js.undefined
  
  /** rate - Specify the rate, available values: x-slow, slow, medium, fast, x-fast, n% */
  var rate: js.UndefOr[String] = js.undefined
  
  /** volume - Specify the volume, available values: default, silent, x-soft, soft, medium, loud, x-loud, +ndB, -ndB */
  var volume: js.UndefOr[String] = js.undefined
}
object SsmlProsodyAttributes {
  
  inline def apply(): SsmlProsodyAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmlProsodyAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SsmlProsodyAttributes] (val x: Self) extends AnyVal {
    
    inline def setPitch(value: String): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setVolume(value: String): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
