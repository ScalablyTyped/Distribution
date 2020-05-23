package typings.tcpPing.mod

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
  def apply(
    error: Error = null,
    seq: js.UndefOr[Double] = js.undefined,
    time: js.UndefOr[Double] = js.undefined
  ): Results = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(seq)) __obj.updateDynamic("seq")(seq.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
}

