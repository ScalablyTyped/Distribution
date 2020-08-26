package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTime extends js.Object {
  var universalTime: Double = js.native
}

object DateTime {
  @scala.inline
  def apply(universalTime: Double): DateTime = {
    val __obj = js.Dynamic.literal(universalTime = universalTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTime]
  }
  @scala.inline
  implicit class DateTimeOps[Self <: DateTime] (val x: Self) extends AnyVal {
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
    def setUniversalTime(value: Double): Self = this.set("universalTime", value.asInstanceOf[js.Any])
  }
  
}

