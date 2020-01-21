package typings.vsoNodeApi.notificationInterfacesMod

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
    val __obj = js.Dynamic.literal(notificationTracing = notificationTracing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscriptionDiagnostics]
  }
}

