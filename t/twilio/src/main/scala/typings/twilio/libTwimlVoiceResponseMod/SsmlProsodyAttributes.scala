package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmlProsodyAttributes extends StObject {
  
  var pitch: js.UndefOr[String] = js.undefined
  
  var rate: js.UndefOr[String] = js.undefined
  
  var volume: js.UndefOr[String] = js.undefined
}
object SsmlProsodyAttributes {
  
  inline def apply(): SsmlProsodyAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmlProsodyAttributes]
  }
  
  extension [Self <: SsmlProsodyAttributes](x: Self) {
    
    inline def setPitch(value: String): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setVolume(value: String): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
