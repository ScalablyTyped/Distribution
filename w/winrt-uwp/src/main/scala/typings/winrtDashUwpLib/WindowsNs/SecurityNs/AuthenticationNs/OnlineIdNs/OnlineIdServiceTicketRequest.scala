package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the ability for an app to specify the service and policy that is used to authenticate a Live user to obtain identity properties and tickets. */
@JSGlobal("Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest")
@js.native
class OnlineIdServiceTicketRequest protected () extends js.Object {
  /**
    * Creates an instance of the OnlineIdServiceTicketRequest class.
    * @param service The service for the request.
    */
  def this(service: java.lang.String) = this()
  /**
    * Creates an instance of the OnlineIdServiceTicketRequest class.
    * @param service The service for the request.
    * @param policy The policy for the request.
    */
  def this(service: java.lang.String, policy: java.lang.String) = this()
  /** The policy used to authenticate users. Supported values are JWT, which returns data using the JSON format. For apps that are requesting user consent to access stored in Live, app developer must pass a policy of DELEGATION. */
  var policy: java.lang.String = js.native
  /** Identifies the service your app uses. The service name must match the DNS name you supplied when registering your app on http://go.microsoft.com/fwlink/p/?linkid=241860. Tickets are issued only for this service. For apps that are requesting user consent to access stored in Live, you must pass the offers to which your app needs access. The available list of offers can be found at our Scopes and Permissions page. The ticket can then be used with the Live Connect REST apis to access data that a user has consented to give to the app. Check out our REST APIs topic to learn more. Alternatively, the app can use the Live Connect SDK which will make these calls itself. */
  var service: java.lang.String = js.native
}

