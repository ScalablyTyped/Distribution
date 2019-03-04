package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareNotificationContext extends js.Object {
  /**
    * Optional user note or message.
    */
  var message: java.lang.String
  /**
    * Identities of users who will receive a share notification.
    */
  var receivers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef]
}

object ShareNotificationContext {
  @scala.inline
  def apply(
    message: java.lang.String,
    receivers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef]
  ): ShareNotificationContext = {
    val __obj = js.Dynamic.literal(message = message, receivers = receivers)
  
    __obj.asInstanceOf[ShareNotificationContext]
  }
}

