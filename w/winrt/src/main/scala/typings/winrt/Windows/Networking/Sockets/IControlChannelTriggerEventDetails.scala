package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IControlChannelTriggerEventDetails extends StObject {
  
  var controlChannelTrigger: ControlChannelTrigger
}
object IControlChannelTriggerEventDetails {
  
  inline def apply(controlChannelTrigger: ControlChannelTrigger): IControlChannelTriggerEventDetails = {
    val __obj = js.Dynamic.literal(controlChannelTrigger = controlChannelTrigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[IControlChannelTriggerEventDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IControlChannelTriggerEventDetails] (val x: Self) extends AnyVal {
    
    inline def setControlChannelTrigger(value: ControlChannelTrigger): Self = StObject.set(x, "controlChannelTrigger", value.asInstanceOf[js.Any])
  }
}
