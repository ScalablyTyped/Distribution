package typings.winrt.Windows.Security.Authentication.OnlineId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnlineIdServiceTicketRequest extends IOnlineIdServiceTicketRequest

object OnlineIdServiceTicketRequest {
  @scala.inline
  def apply(policy: String, service: String): OnlineIdServiceTicketRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlineIdServiceTicketRequest]
  }
}

