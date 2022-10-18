package typings.trezorConnect.libTypescriptNetworksEthereumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumTransactionEIP1559 extends StObject {
  
  var accessList: js.UndefOr[js.Array[EthereumAccessList]] = js.undefined
  
  var chainId: Double
  
  var data: js.UndefOr[String] = js.undefined
  
  var gasLimit: String
  
  var gasPrice: scala.Unit
  
  var maxFeePerGas: String
  
  var maxPriorityFeePerGas: String
  
  var nonce: String
  
  var to: String
  
  var value: String
}
object EthereumTransactionEIP1559 {
  
  inline def apply(
    chainId: Double,
    gasLimit: String,
    gasPrice: scala.Unit,
    maxFeePerGas: String,
    maxPriorityFeePerGas: String,
    nonce: String,
    to: String,
    value: String
  ): EthereumTransactionEIP1559 = {
    val __obj = js.Dynamic.literal(chainId = chainId.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], maxFeePerGas = maxFeePerGas.asInstanceOf[js.Any], maxPriorityFeePerGas = maxPriorityFeePerGas.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumTransactionEIP1559]
  }
  
  extension [Self <: EthereumTransactionEIP1559](x: Self) {
    
    inline def setAccessList(value: js.Array[EthereumAccessList]): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
    
    inline def setAccessListUndefined: Self = StObject.set(x, "accessList", js.undefined)
    
    inline def setAccessListVarargs(value: EthereumAccessList*): Self = StObject.set(x, "accessList", js.Array(value*))
    
    inline def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setGasLimit(value: String): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
    
    inline def setGasPrice(value: scala.Unit): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
    
    inline def setMaxFeePerGas(value: String): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
    
    inline def setMaxPriorityFeePerGas(value: String): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
