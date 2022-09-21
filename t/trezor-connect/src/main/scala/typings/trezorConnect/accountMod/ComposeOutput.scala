package typings.trezorConnect.accountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.accountMod.RegularOutput
  - typings.trezorConnect.accountMod.InternalOutput
  - typings.trezorConnect.accountMod.SendMaxOutput
  - typings.trezorConnect.accountMod.OpReturnOutput
  - typings.trezorConnect.accountMod.NoAddressOutput
  - typings.trezorConnect.accountMod.NoAddressSendMaxOutput
*/
trait ComposeOutput extends StObject
object ComposeOutput {
  
  inline def InternalOutput(address_n: js.Array[Double], amount: String): typings.trezorConnect.accountMod.InternalOutput = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.accountMod.InternalOutput]
  }
  
  inline def NoAddressOutput(amount: String): typings.trezorConnect.accountMod.NoAddressOutput = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("noaddress")
    __obj.asInstanceOf[typings.trezorConnect.accountMod.NoAddressOutput]
  }
  
  inline def NoAddressSendMaxOutput(): typings.trezorConnect.accountMod.NoAddressSendMaxOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("send-max-noaddress")
    __obj.asInstanceOf[typings.trezorConnect.accountMod.NoAddressSendMaxOutput]
  }
  
  inline def OpReturnOutput(dataHex: String): typings.trezorConnect.accountMod.OpReturnOutput = {
    val __obj = js.Dynamic.literal(dataHex = dataHex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("opreturn")
    __obj.asInstanceOf[typings.trezorConnect.accountMod.OpReturnOutput]
  }
  
  inline def RegularOutput(address: String, amount: String): typings.trezorConnect.accountMod.RegularOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.accountMod.RegularOutput]
  }
  
  inline def SendMaxOutput(address: String): typings.trezorConnect.accountMod.SendMaxOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("send-max")
    __obj.asInstanceOf[typings.trezorConnect.accountMod.SendMaxOutput]
  }
}
