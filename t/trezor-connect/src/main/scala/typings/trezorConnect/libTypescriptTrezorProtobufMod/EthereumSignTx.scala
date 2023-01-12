package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumSignTx extends StObject {
  
  var address_n: js.Array[Double]
  
  var chain_id: Double
  
  var data_initial_chunk: js.UndefOr[String] = js.undefined
  
  var data_length: js.UndefOr[Double] = js.undefined
  
  var gas_limit: String
  
  var gas_price: String
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
  
  var tx_type: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object EthereumSignTx {
  
  inline def apply(address_n: js.Array[Double], chain_id: Double, gas_limit: String, gas_price: String): EthereumSignTx = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], chain_id = chain_id.asInstanceOf[js.Any], gas_limit = gas_limit.asInstanceOf[js.Any], gas_price = gas_price.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumSignTx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EthereumSignTx] (val x: Self) extends AnyVal {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setChain_id(value: Double): Self = StObject.set(x, "chain_id", value.asInstanceOf[js.Any])
    
    inline def setData_initial_chunk(value: String): Self = StObject.set(x, "data_initial_chunk", value.asInstanceOf[js.Any])
    
    inline def setData_initial_chunkUndefined: Self = StObject.set(x, "data_initial_chunk", js.undefined)
    
    inline def setData_length(value: Double): Self = StObject.set(x, "data_length", value.asInstanceOf[js.Any])
    
    inline def setData_lengthUndefined: Self = StObject.set(x, "data_length", js.undefined)
    
    inline def setGas_limit(value: String): Self = StObject.set(x, "gas_limit", value.asInstanceOf[js.Any])
    
    inline def setGas_price(value: String): Self = StObject.set(x, "gas_price", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setTx_type(value: Double): Self = StObject.set(x, "tx_type", value.asInstanceOf[js.Any])
    
    inline def setTx_typeUndefined: Self = StObject.set(x, "tx_type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
