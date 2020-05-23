package typings.winrtUwp.Windows.Security.Authentication.OnlineId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the ticket that is obtained after the user authenticates to this app or has provided consent to access user data stored in Live. */
trait OnlineIdServiceTicket extends js.Object {
  /** If there was an error in obtaining the ticket, then the error code is captured here. */
  var errorCode: Double
  /** Represents the OnlineIdServiceTicketRequest for which the ticket was obtained. */
  var request: OnlineIdServiceTicketRequest
  /** The ticket. */
  var value: String
}

object OnlineIdServiceTicket {
  @scala.inline
  def apply(errorCode: Double, request: OnlineIdServiceTicketRequest, value: String): OnlineIdServiceTicket = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlineIdServiceTicket]
  }
}

