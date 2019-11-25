package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogTraceParams extends js.Object {
  var message: String
  var verbose: js.UndefOr[String] = js.undefined
}

object LogTraceParams {
  @scala.inline
  def apply(message: String, verbose: String = null): LogTraceParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogTraceParams]
  }
}

