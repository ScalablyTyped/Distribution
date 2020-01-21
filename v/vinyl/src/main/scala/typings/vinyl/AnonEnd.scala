package typings.vinyl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  /**
    * If false, the destination stream will not be ended (same as node core).
    */
  var end: js.UndefOr[Boolean] = js.undefined
}

object AnonEnd {
  @scala.inline
  def apply(end: js.UndefOr[Boolean] = js.undefined): AnonEnd = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
}

