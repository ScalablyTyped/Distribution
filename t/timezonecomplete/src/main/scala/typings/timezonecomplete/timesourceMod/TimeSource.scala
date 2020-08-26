package typings.timezonecomplete.timesourceMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeSource extends js.Object {
  /**
    * Return the current date+time as a javascript Date object
    * @throws nothing
    */
  def now(): Date = js.native
}

object TimeSource {
  @scala.inline
  def apply(now: () => Date): TimeSource = {
    val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
    __obj.asInstanceOf[TimeSource]
  }
  @scala.inline
  implicit class TimeSourceOps[Self <: TimeSource] (val x: Self) extends AnyVal {
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
    def setNow(value: () => Date): Self = this.set("now", js.Any.fromFunction0(value))
  }
  
}

