package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegularOutput extends Output {
  var address: java.lang.String
  var amount: java.lang.String
  var script_type: js.UndefOr[java.lang.String] = js.undefined
}

object RegularOutput {
  @scala.inline
  def apply(address: java.lang.String, amount: java.lang.String, script_type: java.lang.String = null): RegularOutput = {
    val __obj = js.Dynamic.literal(address = address, amount = amount)
    if (script_type != null) __obj.updateDynamic("script_type")(script_type)
    __obj.asInstanceOf[RegularOutput]
  }
}

