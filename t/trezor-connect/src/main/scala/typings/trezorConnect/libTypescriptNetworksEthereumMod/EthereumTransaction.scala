package typings.trezorConnect.libTypescriptNetworksEthereumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumTransaction extends StObject {
  
  var chainId: Double
  
  var data: js.UndefOr[String] = js.undefined
  
  var gasLimit: String
  
  var gasPrice: String
  
  var maxFeePerGas: scala.Unit
  
  var maxPriorityFeePerGas: scala.Unit
  
  var nonce: String
  
  var to: String
  
  var txType: js.UndefOr[Double] = js.undefined
  
  var value: String
}
object EthereumTransaction {
  
  inline def apply(
    chainId: Double,
    gasLimit: String,
    gasPrice: String,
    maxFeePerGas: scala.Unit,
    maxPriorityFeePerGas: scala.Unit,
    nonce: String,
    to: String,
    value: String
  ): EthereumTransaction = {
    val __obj = js.Dynamic.literal(chainId = chainId.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], maxFeePerGas = maxFeePerGas.asInstanceOf[js.Any], maxPriorityFeePerGas = maxPriorityFeePerGas.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EthereumTransaction] (val x: Self) extends AnyVal {
    
    inline def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setGasLimit(value: String): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
    
    inline def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
    
    inline def setMaxFeePerGas(value: scala.Unit): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
    
    inline def setMaxPriorityFeePerGas(value: scala.Unit): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setTxType(value: Double): Self = StObject.set(x, "txType", value.asInstanceOf[js.Any])
    
    inline def setTxTypeUndefined: Self = StObject.set(x, "txType", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
