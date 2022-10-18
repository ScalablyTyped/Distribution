package typings.trezorConnect.libTypescriptAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.libTypescriptAccountMod.RegularOutput
  - typings.trezorConnect.libTypescriptAccountMod.InternalOutput
  - typings.trezorConnect.libTypescriptAccountMod.SendMaxOutput
  - typings.trezorConnect.libTypescriptAccountMod.OpReturnOutput
  - typings.trezorConnect.libTypescriptAccountMod.NoAddressOutput
  - typings.trezorConnect.libTypescriptAccountMod.NoAddressSendMaxOutput
*/
trait ComposeOutput extends StObject
object ComposeOutput {
  
  inline def InternalOutput(address_n: js.Array[Double], amount: String): typings.trezorConnect.libTypescriptAccountMod.InternalOutput = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptAccountMod.InternalOutput]
  }
  
  inline def NoAddressOutput(amount: String): typings.trezorConnect.libTypescriptAccountMod.NoAddressOutput = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("noaddress")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptAccountMod.NoAddressOutput]
  }
  
  inline def NoAddressSendMaxOutput(): typings.trezorConnect.libTypescriptAccountMod.NoAddressSendMaxOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("send-max-noaddress")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptAccountMod.NoAddressSendMaxOutput]
  }
  
  inline def OpReturnOutput(dataHex: String): typings.trezorConnect.libTypescriptAccountMod.OpReturnOutput = {
    val __obj = js.Dynamic.literal(dataHex = dataHex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("opreturn")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptAccountMod.OpReturnOutput]
  }
  
  inline def RegularOutput(address: String, amount: String): typings.trezorConnect.libTypescriptAccountMod.RegularOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptAccountMod.RegularOutput]
  }
  
  inline def SendMaxOutput(address: String): typings.trezorConnect.libTypescriptAccountMod.SendMaxOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("send-max")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptAccountMod.SendMaxOutput]
  }
}
