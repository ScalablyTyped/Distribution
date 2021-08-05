package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignMessageParams
  extends StObject
     with CommonParams {
  
  var coin: js.UndefOr[String] = js.undefined
  
  var message: String
  
  var path: String | js.Array[Double]
}
object SignMessageParams {
  
  inline def apply(message: String, path: String | js.Array[Double]): SignMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignMessageParams]
  }
  
  extension [Self <: SignMessageParams](x: Self) {
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setCoinUndefined: Self = StObject.set(x, "coin", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value :_*))
  }
}
