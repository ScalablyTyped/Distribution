package typings.vscodeJsonrpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceOptions extends js.Object {
  var sendNotification: js.UndefOr[Boolean] = js.undefined
  var traceFormat: js.UndefOr[TraceFormat] = js.undefined
}

object TraceOptions {
  @scala.inline
  def apply(sendNotification: js.UndefOr[Boolean] = js.undefined, traceFormat: TraceFormat = null): TraceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sendNotification)) __obj.updateDynamic("sendNotification")(sendNotification.get.asInstanceOf[js.Any])
    if (traceFormat != null) __obj.updateDynamic("traceFormat")(traceFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceOptions]
  }
}

