package typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery

import typings.ts3NodejsLibrary.commandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueItem extends js.Object {
  var cmd: Command = js.native
  var priority: Boolean = js.native
  def fulfill(data: js.Any): Unit = js.native
  def reject(data: js.Any): Unit = js.native
}

object QueueItem {
  @scala.inline
  def apply(cmd: Command, fulfill: js.Any => Unit, priority: Boolean, reject: js.Any => Unit): QueueItem = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], fulfill = js.Any.fromFunction1(fulfill), priority = priority.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject))
    __obj.asInstanceOf[QueueItem]
  }
  @scala.inline
  implicit class QueueItemOps[Self <: QueueItem] (val x: Self) extends AnyVal {
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
    def setCmd(value: Command): Self = this.set("cmd", value.asInstanceOf[js.Any])
    @scala.inline
    def setFulfill(value: js.Any => Unit): Self = this.set("fulfill", js.Any.fromFunction1(value))
    @scala.inline
    def setPriority(value: Boolean): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setReject(value: js.Any => Unit): Self = this.set("reject", js.Any.fromFunction1(value))
  }
  
}

