package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmlPhonemeAttributes extends StObject {
  
  var alphabet: js.UndefOr[SsmlPhonemeAlphabet] = js.undefined
  
  var ph: js.UndefOr[String] = js.undefined
}
object SsmlPhonemeAttributes {
  
  inline def apply(): SsmlPhonemeAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmlPhonemeAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SsmlPhonemeAttributes] (val x: Self) extends AnyVal {
    
    inline def setAlphabet(value: SsmlPhonemeAlphabet): Self = StObject.set(x, "alphabet", value.asInstanceOf[js.Any])
    
    inline def setAlphabetUndefined: Self = StObject.set(x, "alphabet", js.undefined)
    
    inline def setPh(value: String): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    inline def setPhUndefined: Self = StObject.set(x, "ph", js.undefined)
  }
}
