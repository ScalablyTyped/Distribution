package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareNotificationContext extends js.Object {
  /**
    * Optional user note or message.
    */
  var message: String
  /**
    * Identities of users who will receive a share notification.
    */
  var receivers: js.Array[IdentityRef]
}

object ShareNotificationContext {
  @scala.inline
  def apply(message: String, receivers: js.Array[IdentityRef]): ShareNotificationContext = {
    val __obj = js.Dynamic.literal(message = message, receivers = receivers)
  
    __obj.asInstanceOf[ShareNotificationContext]
  }
}

