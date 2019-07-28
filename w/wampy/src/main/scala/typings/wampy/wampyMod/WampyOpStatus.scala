package typings.wampy.wampyMod

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
  def apply(code: Double, description: String, reqId: Int | Double = null): WampyOpStatus = {
    val __obj = js.Dynamic.literal(code = code, description = description)
    if (reqId != null) __obj.updateDynamic("reqId")(reqId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WampyOpStatus]
  }
}

