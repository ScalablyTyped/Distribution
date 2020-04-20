package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IASTSpan extends js.Object {
  var _end: Double
  var _start: Double
  def end(): Double
  def start(): Double
}

object IASTSpan {
  @scala.inline
  def apply(_end: Double, _start: Double, end: () => Double, start: () => Double): IASTSpan = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[IASTSpan]
  }
}

