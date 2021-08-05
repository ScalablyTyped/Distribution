package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPushNotificationTriggerFactory extends StObject {
  
  def create(applicationId: String): PushNotificationTrigger
}
object IPushNotificationTriggerFactory {
  
  inline def apply(create: String => PushNotificationTrigger): IPushNotificationTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[IPushNotificationTriggerFactory]
  }
  
  extension [Self <: IPushNotificationTriggerFactory](x: Self) {
    
    inline def setCreate(value: String => PushNotificationTrigger): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
