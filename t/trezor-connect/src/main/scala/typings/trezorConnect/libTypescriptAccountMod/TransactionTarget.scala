package typings.trezorConnect.libTypescriptAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionTarget extends StObject {
  
  var addresses: js.UndefOr[js.Array[String]] = js.undefined
  
  var amount: js.UndefOr[String] = js.undefined
  
  var coinbase: js.UndefOr[String] = js.undefined
  
  var isAccountTarget: js.UndefOr[Boolean] = js.undefined
  
  var isAddress: Boolean
  
  var n: Double
}
object TransactionTarget {
  
  inline def apply(isAddress: Boolean, n: Double): TransactionTarget = {
    val __obj = js.Dynamic.literal(isAddress = isAddress.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionTarget]
  }
  
  extension [Self <: TransactionTarget](x: Self) {
    
    inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCoinbase(value: String): Self = StObject.set(x, "coinbase", value.asInstanceOf[js.Any])
    
    inline def setCoinbaseUndefined: Self = StObject.set(x, "coinbase", js.undefined)
    
    inline def setIsAccountTarget(value: Boolean): Self = StObject.set(x, "isAccountTarget", value.asInstanceOf[js.Any])
    
    inline def setIsAccountTargetUndefined: Self = StObject.set(x, "isAccountTarget", js.undefined)
    
    inline def setIsAddress(value: Boolean): Self = StObject.set(x, "isAddress", value.asInstanceOf[js.Any])
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
