package typings.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.anon.AddressParameters
  - typings.trezorConnect.anon.Amount
*/
trait CardanoOutput extends StObject
object CardanoOutput {
  
  inline def AddressParameters(addressParameters: CardanoAddressParameters, amount: String): typings.trezorConnect.anon.AddressParameters = {
    val __obj = js.Dynamic.literal(addressParameters = addressParameters.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.AddressParameters]
  }
  
  inline def Amount(address: String, amount: String): typings.trezorConnect.anon.Amount = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.Amount]
  }
}
