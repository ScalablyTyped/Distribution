package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.System.VirtualKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAcceleratorKeyEventArgs
  extends StObject
     with ICoreWindowEventArgs {
  
  var eventType: CoreAcceleratorKeyEventType
  
  var keyStatus: CorePhysicalKeyStatus
  
  var virtualKey: VirtualKey
}
object IAcceleratorKeyEventArgs {
  
  inline def apply(
    eventType: CoreAcceleratorKeyEventType,
    handled: Boolean,
    keyStatus: CorePhysicalKeyStatus,
    virtualKey: VirtualKey
  ): IAcceleratorKeyEventArgs = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any], virtualKey = virtualKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAcceleratorKeyEventArgs]
  }
  
  extension [Self <: IAcceleratorKeyEventArgs](x: Self) {
    
    inline def setEventType(value: CoreAcceleratorKeyEventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setKeyStatus(value: CorePhysicalKeyStatus): Self = StObject.set(x, "keyStatus", value.asInstanceOf[js.Any])
    
    inline def setVirtualKey(value: VirtualKey): Self = StObject.set(x, "virtualKey", value.asInstanceOf[js.Any])
  }
}
