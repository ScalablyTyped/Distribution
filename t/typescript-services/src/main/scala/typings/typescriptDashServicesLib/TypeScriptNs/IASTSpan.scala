package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IASTSpan extends js.Object {
  var _end: scala.Double
  var _start: scala.Double
  def end(): scala.Double
  def start(): scala.Double
}

object IASTSpan {
  @scala.inline
  def apply(
    _end: scala.Double,
    _start: scala.Double,
    end: js.Function0[scala.Double],
    start: js.Function0[scala.Double]
  ): IASTSpan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_end")(_end)
    __obj.updateDynamic("_start")(_start)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[IASTSpan]
  }
}

