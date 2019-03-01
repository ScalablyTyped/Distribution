package typings
package winrtLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOnlineIdServiceTicketRequest extends js.Object {
  var policy: java.lang.String
  var service: java.lang.String
}

object IOnlineIdServiceTicketRequest {
  @scala.inline
  def apply(policy: java.lang.String, service: java.lang.String): IOnlineIdServiceTicketRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("policy")(policy)
    __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[IOnlineIdServiceTicketRequest]
  }
}

