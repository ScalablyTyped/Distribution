package typings
package vscodeDashJsonrpcLib.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogTraceParams extends js.Object {
  var message: java.lang.String
  var verbose: js.UndefOr[java.lang.String] = js.undefined
}

object LogTraceParams {
  @scala.inline
  def apply(message: java.lang.String, verbose: java.lang.String = null): LogTraceParams = {
    val __obj = js.Dynamic.literal(message = message)
    if (verbose != null) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[LogTraceParams]
  }
}

