package typings.wol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WakeOptions extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object WakeOptions {
  @scala.inline
  def apply(address: String = null, port: js.UndefOr[Double] = js.undefined): WakeOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WakeOptions]
  }
}

