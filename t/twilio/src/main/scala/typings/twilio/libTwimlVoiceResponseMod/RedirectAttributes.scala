package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectAttributes extends StObject {
  
  /** method - Redirect URL method */
  var method: js.UndefOr[String] = js.undefined
}
object RedirectAttributes {
  
  inline def apply(): RedirectAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedirectAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedirectAttributes] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
