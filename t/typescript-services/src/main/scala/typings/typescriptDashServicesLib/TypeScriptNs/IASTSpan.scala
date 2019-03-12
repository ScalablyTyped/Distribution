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
  def apply(_end: scala.Double, _start: scala.Double, end: () => scala.Double, start: () => scala.Double): IASTSpan = {
    val __obj = js.Dynamic.literal(_end = _end, _start = _start, end = js.Any.fromFunction0(end), start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[IASTSpan]
  }
}

