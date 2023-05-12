package typings.swellJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gateway extends StObject {
  
  var gateway: String
  
  var intent: js.Object
}
object Gateway {
  
  inline def apply(gateway: String, intent: js.Object): Gateway = {
    val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gateway]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gateway] (val x: Self) extends AnyVal {
    
    inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    inline def setIntent(value: js.Object): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
  }
}
