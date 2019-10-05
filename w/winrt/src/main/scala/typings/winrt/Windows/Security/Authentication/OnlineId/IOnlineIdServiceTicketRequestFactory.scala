package typings.winrt.Windows.Security.Authentication.OnlineId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOnlineIdServiceTicketRequestFactory extends js.Object {
  def createOnlineIdServiceTicketRequest(service: String): OnlineIdServiceTicketRequest = js.native
  def createOnlineIdServiceTicketRequest(service: String, policy: String): OnlineIdServiceTicketRequest = js.native
}

