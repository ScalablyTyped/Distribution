package typings.winrtUwp.Windows.Security.Authentication.OnlineId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the ability for an app to specify the service and policy that is used to authenticate a Live user to obtain identity properties and tickets. */
@js.native
trait OnlineIdServiceTicketRequest extends js.Object {
  /** The policy used to authenticate users. Supported values are JWT, which returns data using the JSON format. For apps that are requesting user consent to access stored in Live, app developer must pass a policy of DELEGATION. */
  var policy: String = js.native
  /** Identifies the service your app uses. The service name must match the DNS name you supplied when registering your app on http://go.microsoft.com/fwlink/p/?linkid=241860. Tickets are issued only for this service. For apps that are requesting user consent to access stored in Live, you must pass the offers to which your app needs access. The available list of offers can be found at our Scopes and Permissions page. The ticket can then be used with the Live Connect REST apis to access data that a user has consented to give to the app. Check out our REST APIs topic to learn more. Alternatively, the app can use the Live Connect SDK which will make these calls itself. */
  var service: String = js.native
}

object OnlineIdServiceTicketRequest {
  @scala.inline
  def apply(policy: String, service: String): OnlineIdServiceTicketRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlineIdServiceTicketRequest]
  }
  @scala.inline
  implicit class OnlineIdServiceTicketRequestOps[Self <: OnlineIdServiceTicketRequest] (val x: Self) extends AnyVal {
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
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
  }
  
}

