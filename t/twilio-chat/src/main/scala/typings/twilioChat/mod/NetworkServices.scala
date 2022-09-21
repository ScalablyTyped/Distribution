package typings.twilioChat.mod

import typings.twilsock.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkServices extends StObject {
  
  var transport: Transport
}
object NetworkServices {
  
  inline def apply(transport: Transport): NetworkServices = {
    val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkServices]
  }
  
  extension [Self <: NetworkServices](x: Self) {
    
    inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
  }
}
