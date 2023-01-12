package typings.trezorConnect.libTypescriptNetworksEthereumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumSignedTx extends StObject {
  
  var r: String
  
  var s: String
  
  var v: String
}
object EthereumSignedTx {
  
  inline def apply(r: String, s: String, v: String): EthereumSignedTx = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumSignedTx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EthereumSignedTx] (val x: Self) extends AnyVal {
    
    inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
