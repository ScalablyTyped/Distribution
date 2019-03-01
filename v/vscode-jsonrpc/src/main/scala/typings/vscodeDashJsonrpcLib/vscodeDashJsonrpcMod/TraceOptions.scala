package typings
package vscodeDashJsonrpcLib.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceOptions extends js.Object {
  var sendNotification: js.UndefOr[scala.Boolean] = js.undefined
  var traceFormat: js.UndefOr[TraceFormat] = js.undefined
}

object TraceOptions {
  @scala.inline
  def apply(sendNotification: js.UndefOr[scala.Boolean] = js.undefined, traceFormat: TraceFormat = null): TraceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sendNotification)) __obj.updateDynamic("sendNotification")(sendNotification)
    if (traceFormat != null) __obj.updateDynamic("traceFormat")(traceFormat)
    __obj.asInstanceOf[TraceOptions]
  }
}

