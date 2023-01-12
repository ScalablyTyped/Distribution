package typings.trezorConnect.libTypescriptAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAddress extends StObject {
  
  var address: String
  
  var balance: js.UndefOr[String] = js.undefined
  
  var path: String
  
  var received: js.UndefOr[String] = js.undefined
  
  var sent: js.UndefOr[String] = js.undefined
  
  var transfers: js.UndefOr[Double] = js.undefined
}
object AccountAddress {
  
  inline def apply(address: String, path: String): AccountAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountAddress] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setBalance(value: String): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setReceived(value: String): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
    
    inline def setReceivedUndefined: Self = StObject.set(x, "received", js.undefined)
    
    inline def setSent(value: String): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
    
    inline def setSentUndefined: Self = StObject.set(x, "sent", js.undefined)
    
    inline def setTransfers(value: Double): Self = StObject.set(x, "transfers", value.asInstanceOf[js.Any])
    
    inline def setTransfersUndefined: Self = StObject.set(x, "transfers", js.undefined)
  }
}
