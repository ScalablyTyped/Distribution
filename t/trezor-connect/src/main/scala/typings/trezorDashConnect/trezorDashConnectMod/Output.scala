package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.trezorDashConnectStrings.`send-max`
import typings.trezorDashConnect.trezorDashConnectStrings.opreturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.trezorDashConnect.trezorDashConnectMod.RegularOutput
  - typings.trezorDashConnect.trezorDashConnectMod.InternalOutput
  - typings.trezorDashConnect.trezorDashConnectMod.SendMaxOutput
  - typings.trezorDashConnect.trezorDashConnectMod.OpReturnOutput
*/
trait Output extends js.Object

object Output {
  @scala.inline
  def RegularOutput(address: String, amount: String, script_type: String = null): Output = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    if (script_type != null) __obj.updateDynamic("script_type")(script_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  @scala.inline
  def InternalOutput(address_n: js.Array[Double], amount: String, script_type: String = null): Output = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    if (script_type != null) __obj.updateDynamic("script_type")(script_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  @scala.inline
  def SendMaxOutput(address: String, `type`: `send-max`): Output = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  @scala.inline
  def OpReturnOutput(dataHex: String, `type`: opreturn): Output = {
    val __obj = js.Dynamic.literal(dataHex = dataHex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
}

