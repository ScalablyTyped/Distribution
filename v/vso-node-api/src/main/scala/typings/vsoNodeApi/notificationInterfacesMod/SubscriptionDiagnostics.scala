package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionDiagnostics extends StObject {
  
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
  
  @scala.inline
  implicit class SubscriptionDiagnosticsMutableBuilder[Self <: SubscriptionDiagnostics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotificationTracing(value: NotificationTracing): Self = StObject.set(x, "notificationTracing", value.asInstanceOf[js.Any])
  }
}
