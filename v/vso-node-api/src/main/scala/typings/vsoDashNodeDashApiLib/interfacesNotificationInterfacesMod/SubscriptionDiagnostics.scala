package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionDiagnostics extends js.Object {
  /**
    * Optional. Contol the tracing
    */
  var notificationTracing: NotificationTracing
}

object SubscriptionDiagnostics {
  @scala.inline
  def apply(notificationTracing: NotificationTracing): SubscriptionDiagnostics = {
    val __obj = js.Dynamic.literal(notificationTracing = notificationTracing)
  
    __obj.asInstanceOf[SubscriptionDiagnostics]
  }
}

