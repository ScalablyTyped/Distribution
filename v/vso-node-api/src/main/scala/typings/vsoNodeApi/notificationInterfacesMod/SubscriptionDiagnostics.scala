package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionDiagnostics extends js.Object {
  /**
    * Optional. Contol the tracing
    */
  var notificationTracing: NotificationTracing = js.native
}

object SubscriptionDiagnostics {
  @scala.inline
  def apply(notificationTracing: NotificationTracing): SubscriptionDiagnostics = {
    val __obj = js.Dynamic.literal(notificationTracing = notificationTracing.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionDiagnostics]
  }
  @scala.inline
  implicit class SubscriptionDiagnosticsOps[Self <: SubscriptionDiagnostics] (val x: Self) extends AnyVal {
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
    def setNotificationTracing(value: NotificationTracing): Self = this.set("notificationTracing", value.asInstanceOf[js.Any])
  }
  
}

