package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.mod.RegularOutput
  - typings.trezorConnect.mod.InternalOutput
  - typings.trezorConnect.mod.SendMaxOutput
  - typings.trezorConnect.mod.OpReturnOutput
*/
trait Output extends StObject
object Output {
  
  inline def InternalOutput(address_n: js.Array[Double], amount: String): typings.trezorConnect.mod.InternalOutput = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.mod.InternalOutput]
  }
  
  inline def OpReturnOutput(dataHex: String): typings.trezorConnect.mod.OpReturnOutput = {
    val __obj = js.Dynamic.literal(dataHex = dataHex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("opreturn")
    __obj.asInstanceOf[typings.trezorConnect.mod.OpReturnOutput]
  }
  
  inline def RegularOutput(address: String, amount: String): typings.trezorConnect.mod.RegularOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.mod.RegularOutput]
  }
  
  inline def SendMaxOutput(address: String): typings.trezorConnect.mod.SendMaxOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("send-max")
    __obj.asInstanceOf[typings.trezorConnect.mod.SendMaxOutput]
  }
}
