package typings.wampy.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCOptions extends js.Object {
  var process: js.UndefOr[Boolean] = js.undefined
}

object RPCOptions {
  @scala.inline
  def apply(process: js.UndefOr[Boolean] = js.undefined): RPCOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(process)) __obj.updateDynamic("process")(process)
    __obj.asInstanceOf[RPCOptions]
  }
}

