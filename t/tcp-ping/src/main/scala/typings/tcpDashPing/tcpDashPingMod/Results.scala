package typings.tcpDashPing.tcpDashPingMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var seq: js.UndefOr[Double] = js.undefined
  var time: js.UndefOr[Double] = js.undefined
}

object Results {
  @scala.inline
  def apply(error: Error = null, seq: Int | Double = null, time: Int | Double = null): Results = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (seq != null) __obj.updateDynamic("seq")(seq.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
}

