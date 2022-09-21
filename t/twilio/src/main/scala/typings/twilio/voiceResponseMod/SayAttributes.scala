package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SayAttributes extends StObject {
  
  var language: js.UndefOr[SayLanguage] = js.undefined
  
  var loop: js.UndefOr[Double] = js.undefined
  
  var voice: js.UndefOr[SayVoice] = js.undefined
}
object SayAttributes {
  
  inline def apply(): SayAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SayAttributes]
  }
  
  extension [Self <: SayAttributes](x: Self) {
    
    inline def setLanguage(value: SayLanguage): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setVoice(value: SayVoice): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    inline def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
  }
}
