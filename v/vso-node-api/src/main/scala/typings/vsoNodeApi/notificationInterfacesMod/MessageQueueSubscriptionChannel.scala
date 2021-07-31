package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageQueueSubscriptionChannel extends StObject {
  
  var `type`: String
}
object MessageQueueSubscriptionChannel {
  
  @scala.inline
  def apply(`type`: String): MessageQueueSubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageQueueSubscriptionChannel]
  }
  
  @scala.inline
  implicit class MessageQueueSubscriptionChannelMutableBuilder[Self <: MessageQueueSubscriptionChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
