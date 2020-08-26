package typings.vexdb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollTime extends js.Object {
  var pollTime: Double = js.native
}

object PollTime {
  @scala.inline
  def apply(pollTime: Double): PollTime = {
    val __obj = js.Dynamic.literal(pollTime = pollTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollTime]
  }
  @scala.inline
  implicit class PollTimeOps[Self <: PollTime] (val x: Self) extends AnyVal {
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
    def setPollTime(value: Double): Self = this.set("pollTime", value.asInstanceOf[js.Any])
  }
  
}

