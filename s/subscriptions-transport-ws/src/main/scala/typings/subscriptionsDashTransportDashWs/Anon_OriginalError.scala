package typings.subscriptionsDashTransportDashWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OriginalError extends js.Object {
  var originalError: js.UndefOr[js.Any] = js.undefined
}

object Anon_OriginalError {
  @scala.inline
  def apply(originalError: js.Any = null): Anon_OriginalError = {
    val __obj = js.Dynamic.literal()
    if (originalError != null) __obj.updateDynamic("originalError")(originalError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OriginalError]
  }
}

