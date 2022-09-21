package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectAttributes extends StObject {
  
  var method: js.UndefOr[String] = js.undefined
}
object RedirectAttributes {
  
  inline def apply(): RedirectAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedirectAttributes]
  }
  
  extension [Self <: RedirectAttributes](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
