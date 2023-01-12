package typings.trezorConnect.libTypescriptBackendBlockchainMod

import typings.trezorConnect.libTypescriptAccountMod.AccountAddresses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainSubscribeAccount extends StObject {
  
  var addresses: js.UndefOr[AccountAddresses] = js.undefined
  
  var descriptor: String
}
object BlockchainSubscribeAccount {
  
  inline def apply(descriptor: String): BlockchainSubscribeAccount = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainSubscribeAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockchainSubscribeAccount] (val x: Self) extends AnyVal {
    
    inline def setAddresses(value: AccountAddresses): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setDescriptor(value: String): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
  }
}
