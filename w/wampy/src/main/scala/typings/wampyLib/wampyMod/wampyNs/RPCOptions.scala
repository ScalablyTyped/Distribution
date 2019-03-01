package typings
package wampyLib.wampyMod.wampyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCOptions extends js.Object {
  var process: js.UndefOr[scala.Boolean] = js.undefined
}

object RPCOptions {
  @scala.inline
  def apply(process: js.UndefOr[scala.Boolean] = js.undefined): RPCOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(process)) __obj.updateDynamic("process")(process)
    __obj.asInstanceOf[RPCOptions]
  }
}

