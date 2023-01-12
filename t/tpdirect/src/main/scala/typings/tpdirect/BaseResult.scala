package typings.tpdirect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseResult extends StObject {
  
  var client_ip: String
  
  var msg: String
  
  var prime: String
  
  /**
    * 0 is successful.
    */
  var status: Double
}
object BaseResult {
  
  inline def apply(client_ip: String, msg: String, prime: String, status: Double): BaseResult = {
    val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseResult] (val x: Self) extends AnyVal {
    
    inline def setClient_ip(value: String): Self = StObject.set(x, "client_ip", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setPrime(value: String): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
