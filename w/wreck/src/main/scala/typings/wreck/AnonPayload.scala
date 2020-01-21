package typings.wreck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayload extends js.Object {
  var payload: js.UndefOr[js.Any] = js.undefined
}

object AnonPayload {
  @scala.inline
  def apply(payload: js.Any = null): AnonPayload = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayload]
  }
}

