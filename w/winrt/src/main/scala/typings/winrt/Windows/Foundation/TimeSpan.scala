package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeSpan extends js.Object {
  var duration: Double = js.native
}

object TimeSpan {
  @scala.inline
  def apply(duration: Double): TimeSpan = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSpan]
  }
  @scala.inline
  implicit class TimeSpanOps[Self <: TimeSpan] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
  }
  
}

