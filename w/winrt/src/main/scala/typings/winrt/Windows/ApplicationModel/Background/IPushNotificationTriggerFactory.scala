package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPushNotificationTriggerFactory extends StObject {
  
  def create(applicationId: String): PushNotificationTrigger = js.native
}
object IPushNotificationTriggerFactory {
  
  @scala.inline
  def apply(create: String => PushNotificationTrigger): IPushNotificationTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[IPushNotificationTriggerFactory]
  }
  
  @scala.inline
  implicit class IPushNotificationTriggerFactoryMutableBuilder[Self <: IPushNotificationTriggerFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: String => PushNotificationTrigger): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
