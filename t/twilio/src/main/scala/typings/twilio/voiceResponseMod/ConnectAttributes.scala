package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectAttributes extends StObject {
  
  var action: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
}
object ConnectAttributes {
  
  inline def apply(): ConnectAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectAttributes]
  }
  
  extension [Self <: ConnectAttributes](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
