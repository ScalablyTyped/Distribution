package typings.winrt.Windows.Security.Authentication.OnlineId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOnlineIdServiceTicket extends js.Object {
  var errorCode: Double = js.native
  var request: OnlineIdServiceTicketRequest = js.native
  var value: String = js.native
}

object IOnlineIdServiceTicket {
  @scala.inline
  def apply(errorCode: Double, request: OnlineIdServiceTicketRequest, value: String): IOnlineIdServiceTicket = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOnlineIdServiceTicket]
  }
  @scala.inline
  implicit class IOnlineIdServiceTicketOps[Self <: IOnlineIdServiceTicket] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OnlineIdServiceTicketRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

