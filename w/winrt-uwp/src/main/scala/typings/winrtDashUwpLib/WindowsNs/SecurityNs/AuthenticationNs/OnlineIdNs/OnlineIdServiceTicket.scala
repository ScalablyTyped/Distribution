package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the ticket that is obtained after the user authenticates to this app or has provided consent to access user data stored in Live. */
@JSGlobal("Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket")
@js.native
abstract class OnlineIdServiceTicket () extends js.Object {
  /** If there was an error in obtaining the ticket, then the error code is captured here. */
  var errorCode: scala.Double = js.native
  /** Represents the OnlineIdServiceTicketRequest for which the ticket was obtained. */
  var request: OnlineIdServiceTicketRequest = js.native
  /** The ticket. */
  var value: java.lang.String = js.native
}

