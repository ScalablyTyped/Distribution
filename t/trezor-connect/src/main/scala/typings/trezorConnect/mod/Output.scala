package typings.trezorConnect.mod

import typings.trezorConnect.trezorConnectStrings.`send-max`
import typings.trezorConnect.trezorConnectStrings.opreturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.mod.RegularOutput
  - typings.trezorConnect.mod.InternalOutput
  - typings.trezorConnect.mod.SendMaxOutput
  - typings.trezorConnect.mod.OpReturnOutput
*/
trait Output extends StObject
object Output {
  
  @scala.inline
  def InternalOutput(address_n: js.Array[Double], amount: String): typings.trezorConnect.mod.InternalOutput = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.mod.InternalOutput]
  }
  
  @scala.inline
  def OpReturnOutput(dataHex: String, `type`: opreturn): typings.trezorConnect.mod.OpReturnOutput = {
    val __obj = js.Dynamic.literal(dataHex = dataHex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.mod.OpReturnOutput]
  }
  
  @scala.inline
  def RegularOutput(address: String, amount: String): typings.trezorConnect.mod.RegularOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.mod.RegularOutput]
  }
  
  @scala.inline
  def SendMaxOutput(address: String, `type`: `send-max`): typings.trezorConnect.mod.SendMaxOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.mod.SendMaxOutput]
  }
}
