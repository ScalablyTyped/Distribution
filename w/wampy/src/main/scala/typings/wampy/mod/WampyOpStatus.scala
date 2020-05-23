package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WampyOpStatus extends js.Object {
  var code: Double
  var description: String
  var reqId: js.UndefOr[Double] = js.undefined
}

object WampyOpStatus {
  @scala.inline
  def apply(code: Double, description: String, reqId: js.UndefOr[Double] = js.undefined): WampyOpStatus = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    if (!js.isUndefined(reqId)) __obj.updateDynamic("reqId")(reqId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WampyOpStatus]
  }
}

