package typings.winrtUwp.Windows.Security.Authentication.OnlineId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the ticket that is obtained after the user authenticates to this app or has provided consent to access user data stored in Live. */
@js.native
trait OnlineIdServiceTicket extends js.Object {
  /** If there was an error in obtaining the ticket, then the error code is captured here. */
  var errorCode: Double = js.native
  /** Represents the OnlineIdServiceTicketRequest for which the ticket was obtained. */
  var request: OnlineIdServiceTicketRequest = js.native
  /** The ticket. */
  var value: String = js.native
}

object OnlineIdServiceTicket {
  @scala.inline
  def apply(errorCode: Double, request: OnlineIdServiceTicketRequest, value: String): OnlineIdServiceTicket = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlineIdServiceTicket]
  }
  @scala.inline
  implicit class OnlineIdServiceTicketOps[Self <: OnlineIdServiceTicket] (val x: Self) extends AnyVal {
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

