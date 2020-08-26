package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IASTSpan extends js.Object {
  var _end: Double = js.native
  var _start: Double = js.native
  def end(): Double = js.native
  def start(): Double = js.native
}

object IASTSpan {
  @scala.inline
  def apply(_end: Double, _start: Double, end: () => Double, start: () => Double): IASTSpan = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[IASTSpan]
  }
  @scala.inline
  implicit class IASTSpanOps[Self <: IASTSpan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_end(value: Double): Self = this.set("_end", value.asInstanceOf[js.Any])
    @scala.inline
    def set_start(value: Double): Self = this.set("_start", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: () => Double): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def setStart(value: () => Double): Self = this.set("start", js.Any.fromFunction0(value))
  }
  
}

