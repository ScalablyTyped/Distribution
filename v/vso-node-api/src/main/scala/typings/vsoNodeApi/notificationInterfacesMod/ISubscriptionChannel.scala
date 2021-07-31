package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISubscriptionChannel extends StObject {
  
  var `type`: String
}
object ISubscriptionChannel {
  
  @scala.inline
  def apply(`type`: String): ISubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionChannel]
  }
  
  @scala.inline
  implicit class ISubscriptionChannelMutableBuilder[Self <: ISubscriptionChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
