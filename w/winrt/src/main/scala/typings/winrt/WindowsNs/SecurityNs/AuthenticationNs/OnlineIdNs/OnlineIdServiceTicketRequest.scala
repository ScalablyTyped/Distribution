package typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest")
@js.native
class OnlineIdServiceTicketRequest protected () extends IOnlineIdServiceTicketRequest {
  def this(service: String) = this()
  def this(service: String, policy: String) = this()
  /* CompleteClass */
  override var policy: String = js.native
  /* CompleteClass */
  override var service: String = js.native
}

