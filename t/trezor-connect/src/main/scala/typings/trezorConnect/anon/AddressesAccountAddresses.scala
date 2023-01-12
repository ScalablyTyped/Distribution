package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptAccountMod.AccountAddresses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressesAccountAddresses extends StObject {
  
  var addresses: AccountAddresses
}
object AddressesAccountAddresses {
  
  inline def apply(addresses: AccountAddresses): AddressesAccountAddresses = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressesAccountAddresses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressesAccountAddresses] (val x: Self) extends AnyVal {
    
    inline def setAddresses(value: AccountAddresses): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
  }
}
