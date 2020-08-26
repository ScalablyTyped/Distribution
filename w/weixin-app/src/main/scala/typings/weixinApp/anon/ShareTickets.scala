package typings.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareTickets extends js.Object {
  /** 每一项是一个 shareTicket ，对应一个转发对象 */
  var shareTickets: js.Array[String] = js.native
}

object ShareTickets {
  @scala.inline
  def apply(shareTickets: js.Array[String]): ShareTickets = {
    val __obj = js.Dynamic.literal(shareTickets = shareTickets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareTickets]
  }
  @scala.inline
  implicit class ShareTicketsOps[Self <: ShareTickets] (val x: Self) extends AnyVal {
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
    def setShareTicketsVarargs(value: String*): Self = this.set("shareTickets", js.Array(value :_*))
    @scala.inline
    def setShareTickets(value: js.Array[String]): Self = this.set("shareTickets", value.asInstanceOf[js.Any])
  }
  
}

