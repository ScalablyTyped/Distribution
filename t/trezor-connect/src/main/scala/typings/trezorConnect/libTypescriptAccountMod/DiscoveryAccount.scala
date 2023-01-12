package typings.trezorConnect.libTypescriptAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoveryAccount extends StObject {
  
  var address_n: js.Array[Double]
  
  var addresses: js.UndefOr[AccountAddresses] = js.undefined
  
  var balance: js.UndefOr[String] = js.undefined
  
  var descriptor: String
  
  var empty: js.UndefOr[Boolean] = js.undefined
  
  var label: String
  
  var `type`: DiscoveryAccountType
}
object DiscoveryAccount {
  
  inline def apply(address_n: js.Array[Double], descriptor: String, label: String, `type`: DiscoveryAccountType): DiscoveryAccount = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoveryAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscoveryAccount] (val x: Self) extends AnyVal {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setAddresses(value: AccountAddresses): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setBalance(value: String): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
    
    inline def setDescriptor(value: String): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setType(value: DiscoveryAccountType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
