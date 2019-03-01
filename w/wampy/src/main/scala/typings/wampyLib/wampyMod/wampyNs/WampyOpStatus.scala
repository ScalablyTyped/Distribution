package typings
package wampyLib.wampyMod.wampyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WampyOpStatus extends js.Object {
  var code: scala.Double
  var description: java.lang.String
  var reqId: js.UndefOr[scala.Double] = js.undefined
}

object WampyOpStatus {
  @scala.inline
  def apply(code: scala.Double, description: java.lang.String, reqId: scala.Int | scala.Double = null): WampyOpStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("description")(description)
    if (reqId != null) __obj.updateDynamic("reqId")(reqId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WampyOpStatus]
  }
}

