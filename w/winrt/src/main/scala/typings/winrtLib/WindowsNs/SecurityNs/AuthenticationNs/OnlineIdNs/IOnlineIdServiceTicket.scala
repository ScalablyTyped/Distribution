package typings
package winrtLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOnlineIdServiceTicket extends js.Object {
  var errorCode: scala.Double
  var request: OnlineIdServiceTicketRequest
  var value: java.lang.String
}

object IOnlineIdServiceTicket {
  @scala.inline
  def apply(errorCode: scala.Double, request: OnlineIdServiceTicketRequest, value: java.lang.String): IOnlineIdServiceTicket = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, request = request, value = value)
  
    __obj.asInstanceOf[IOnlineIdServiceTicket]
  }
}

