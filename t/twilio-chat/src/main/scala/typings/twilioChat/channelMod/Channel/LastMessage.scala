package typings.twilioChat.channelMod.Channel

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastMessage extends js.Object {
  var dateCreated: js.UndefOr[Date] = js.native
  var index: js.UndefOr[Double] = js.native
}

object LastMessage {
  @scala.inline
  def apply(): LastMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastMessage]
  }
  @scala.inline
  implicit class LastMessageOps[Self <: LastMessage] (val x: Self) extends AnyVal {
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
    def setDateCreated(value: Date): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateCreated: Self = this.set("dateCreated", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}

