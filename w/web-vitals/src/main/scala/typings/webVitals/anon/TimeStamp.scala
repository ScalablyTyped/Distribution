package typings.webVitals.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeStamp extends js.Object {
  val timeStamp: Double = js.native
}

object TimeStamp {
  @scala.inline
  def apply(timeStamp: Double): TimeStamp = {
    val __obj = js.Dynamic.literal(timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeStamp]
  }
  @scala.inline
  implicit class TimeStampOps[Self <: TimeStamp] (val x: Self) extends AnyVal {
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
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
  }
  
}

