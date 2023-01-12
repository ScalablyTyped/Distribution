package typings.tpdirect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<tpdirect.BaseResult, 'client_ip'> */
trait PickBaseResultclientip extends StObject {
  
  var client_ip: String
}
object PickBaseResultclientip {
  
  inline def apply(client_ip: String): PickBaseResultclientip = {
    val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBaseResultclientip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickBaseResultclientip] (val x: Self) extends AnyVal {
    
    inline def setClient_ip(value: String): Self = StObject.set(x, "client_ip", value.asInstanceOf[js.Any])
  }
}
