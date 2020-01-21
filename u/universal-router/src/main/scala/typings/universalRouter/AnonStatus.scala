package typings.universalRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStatus extends js.Object {
  var status: js.UndefOr[Double] = js.undefined
}

object AnonStatus {
  @scala.inline
  def apply(status: Int | Double = null): AnonStatus = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStatus]
  }
}

