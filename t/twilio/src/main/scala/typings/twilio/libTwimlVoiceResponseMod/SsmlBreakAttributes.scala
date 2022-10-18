package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmlBreakAttributes extends StObject {
  
  var strength: js.UndefOr[SsmlBreakStrength] = js.undefined
  
  var time: js.UndefOr[String] = js.undefined
}
object SsmlBreakAttributes {
  
  inline def apply(): SsmlBreakAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmlBreakAttributes]
  }
  
  extension [Self <: SsmlBreakAttributes](x: Self) {
    
    inline def setStrength(value: SsmlBreakStrength): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
