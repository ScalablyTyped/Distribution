package typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOnlineIdServiceTicket extends js.Object {
  var errorCode: Double
  var request: OnlineIdServiceTicketRequest
  var value: String
}

object IOnlineIdServiceTicket {
  @scala.inline
  def apply(errorCode: Double, request: OnlineIdServiceTicketRequest, value: String): IOnlineIdServiceTicket = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, request = request, value = value)
  
    __obj.asInstanceOf[IOnlineIdServiceTicket]
  }
}

