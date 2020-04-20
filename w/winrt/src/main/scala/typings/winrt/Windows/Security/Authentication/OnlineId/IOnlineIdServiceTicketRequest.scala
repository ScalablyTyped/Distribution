package typings.winrt.Windows.Security.Authentication.OnlineId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOnlineIdServiceTicketRequest extends js.Object {
  var policy: String
  var service: String
}

object IOnlineIdServiceTicketRequest {
  @scala.inline
  def apply(policy: String, service: String): IOnlineIdServiceTicketRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOnlineIdServiceTicketRequest]
  }
}

