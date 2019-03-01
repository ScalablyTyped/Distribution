package typings
package vscodeDashJsonrpcLib.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTraceParams extends js.Object {
  var value: TraceValues
}

object SetTraceParams {
  @scala.inline
  def apply(value: TraceValues): SetTraceParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SetTraceParams]
  }
}

