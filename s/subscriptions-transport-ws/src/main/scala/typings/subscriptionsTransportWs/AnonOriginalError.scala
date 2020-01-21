package typings.subscriptionsTransportWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalError extends js.Object {
  var originalError: js.UndefOr[js.Any] = js.undefined
}

object AnonOriginalError {
  @scala.inline
  def apply(originalError: js.Any = null): AnonOriginalError = {
    val __obj = js.Dynamic.literal()
    if (originalError != null) __obj.updateDynamic("originalError")(originalError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOriginalError]
  }
}

