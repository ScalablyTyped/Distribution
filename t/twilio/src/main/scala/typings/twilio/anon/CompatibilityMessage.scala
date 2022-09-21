package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompatibilityMessage extends StObject {
  
  var compatibilityMessage: js.UndefOr[String] = js.undefined
}
object CompatibilityMessage {
  
  inline def apply(): CompatibilityMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibilityMessage]
  }
  
  extension [Self <: CompatibilityMessage](x: Self) {
    
    inline def setCompatibilityMessage(value: String): Self = StObject.set(x, "compatibilityMessage", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityMessageUndefined: Self = StObject.set(x, "compatibilityMessage", js.undefined)
  }
}
