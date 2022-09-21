package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumSignTxEIP1559 extends StObject {
  
  var access_list: js.Array[EthereumAccessList]
  
  var address_n: js.Array[Double]
  
  var chain_id: Double
  
  var data_initial_chunk: js.UndefOr[String] = js.undefined
  
  var data_length: Double
  
  var gas_limit: String
  
  var max_gas_fee: String
  
  var max_priority_fee: String
  
  var nonce: String
  
  var to: js.UndefOr[String] = js.undefined
  
  var value: String
}
object EthereumSignTxEIP1559 {
  
  inline def apply(
    access_list: js.Array[EthereumAccessList],
    address_n: js.Array[Double],
    chain_id: Double,
    data_length: Double,
    gas_limit: String,
    max_gas_fee: String,
    max_priority_fee: String,
    nonce: String,
    value: String
  ): EthereumSignTxEIP1559 = {
    val __obj = js.Dynamic.literal(access_list = access_list.asInstanceOf[js.Any], address_n = address_n.asInstanceOf[js.Any], chain_id = chain_id.asInstanceOf[js.Any], data_length = data_length.asInstanceOf[js.Any], gas_limit = gas_limit.asInstanceOf[js.Any], max_gas_fee = max_gas_fee.asInstanceOf[js.Any], max_priority_fee = max_priority_fee.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumSignTxEIP1559]
  }
  
  extension [Self <: EthereumSignTxEIP1559](x: Self) {
    
    inline def setAccess_list(value: js.Array[EthereumAccessList]): Self = StObject.set(x, "access_list", value.asInstanceOf[js.Any])
    
    inline def setAccess_listVarargs(value: EthereumAccessList*): Self = StObject.set(x, "access_list", js.Array(value*))
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setChain_id(value: Double): Self = StObject.set(x, "chain_id", value.asInstanceOf[js.Any])
    
    inline def setData_initial_chunk(value: String): Self = StObject.set(x, "data_initial_chunk", value.asInstanceOf[js.Any])
    
    inline def setData_initial_chunkUndefined: Self = StObject.set(x, "data_initial_chunk", js.undefined)
    
    inline def setData_length(value: Double): Self = StObject.set(x, "data_length", value.asInstanceOf[js.Any])
    
    inline def setGas_limit(value: String): Self = StObject.set(x, "gas_limit", value.asInstanceOf[js.Any])
    
    inline def setMax_gas_fee(value: String): Self = StObject.set(x, "max_gas_fee", value.asInstanceOf[js.Any])
    
    inline def setMax_priority_fee(value: String): Self = StObject.set(x, "max_priority_fee", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
