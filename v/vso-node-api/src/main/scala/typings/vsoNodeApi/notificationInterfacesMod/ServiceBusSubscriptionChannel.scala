package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceBusSubscriptionChannel extends StObject {
  
  var `type`: String = js.native
}
object ServiceBusSubscriptionChannel {
  
  @scala.inline
  def apply(`type`: String): ServiceBusSubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceBusSubscriptionChannel]
  }
  
  @scala.inline
  implicit class ServiceBusSubscriptionChannelMutableBuilder[Self <: ServiceBusSubscriptionChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
