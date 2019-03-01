package typings
package tcpDashPingLib.tcpDashPingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var seq: js.UndefOr[scala.Double]
  var time: js.UndefOr[scala.Double]
}

object Results {
  @scala.inline
  def apply(
    error: stdLib.Error = null,
    seq: scala.Int | scala.Double = null,
    time: scala.Int | scala.Double = null
  ): Results = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (seq != null) __obj.updateDynamic("seq")(seq.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
}

