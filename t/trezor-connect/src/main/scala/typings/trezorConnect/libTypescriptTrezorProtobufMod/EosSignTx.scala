package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosSignTx extends StObject {
  
  var address_n: js.Array[Double]
  
  var chain_id: String
  
  var header: EosTxHeader
  
  var num_actions: Double
}
object EosSignTx {
  
  inline def apply(address_n: js.Array[Double], chain_id: String, header: EosTxHeader, num_actions: Double): EosSignTx = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], chain_id = chain_id.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], num_actions = num_actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosSignTx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EosSignTx] (val x: Self) extends AnyVal {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setChain_id(value: String): Self = StObject.set(x, "chain_id", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: EosTxHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setNum_actions(value: Double): Self = StObject.set(x, "num_actions", value.asInstanceOf[js.Any])
  }
}
