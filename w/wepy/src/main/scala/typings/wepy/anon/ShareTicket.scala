package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareTicket extends js.Object {
  var shareTicket: String = js.native
  var timeout: Double = js.native
}

object ShareTicket {
  @scala.inline
  def apply(shareTicket: String, timeout: Double): ShareTicket = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareTicket]
  }
  @scala.inline
  implicit class ShareTicketOps[Self <: ShareTicket] (val x: Self) extends AnyVal {
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
    def setShareTicket(value: String): Self = this.set("shareTicket", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
  
}

