package typings.vsoNodeApi.interfacesNotificationInterfacesMod

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
  
  inline def apply(notificationTracing: NotificationTracing): SubscriptionDiagnostics = {
    val __obj = js.Dynamic.literal(notificationTracing = notificationTracing.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionDiagnostics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionDiagnostics] (val x: Self) extends AnyVal {
    
    inline def setNotificationTracing(value: NotificationTracing): Self = StObject.set(x, "notificationTracing", value.asInstanceOf[js.Any])
  }
}
