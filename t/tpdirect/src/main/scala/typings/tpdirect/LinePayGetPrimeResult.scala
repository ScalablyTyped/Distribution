package typings.tpdirect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinePayGetPrimeResult
  extends StObject
     with BaseResult {
  
  var cs_key: String
}
object LinePayGetPrimeResult {
  
  inline def apply(client_ip: String, cs_key: String, msg: String, prime: String, status: Double): LinePayGetPrimeResult = {
    val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], cs_key = cs_key.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinePayGetPrimeResult]
  }
  
  extension [Self <: LinePayGetPrimeResult](x: Self) {
    
    inline def setCs_key(value: String): Self = StObject.set(x, "cs_key", value.asInstanceOf[js.Any])
  }
}
