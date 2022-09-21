package typings.trezorConnect.anon

import typings.trezorConnect.accountMod.AccountAddresses
import typings.trezorConnect.accountMod.AccountUtxo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addresses extends StObject {
  
  var addresses: AccountAddresses
  
  var path: String
  
  var utxo: js.Array[AccountUtxo]
}
object Addresses {
  
  inline def apply(addresses: AccountAddresses, path: String, utxo: js.Array[AccountUtxo]): Addresses = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], utxo = utxo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addresses]
  }
  
  extension [Self <: Addresses](x: Self) {
    
    inline def setAddresses(value: AccountAddresses): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setUtxo(value: js.Array[AccountUtxo]): Self = StObject.set(x, "utxo", value.asInstanceOf[js.Any])
    
    inline def setUtxoVarargs(value: AccountUtxo*): Self = StObject.set(x, "utxo", js.Array(value*))
  }
}
