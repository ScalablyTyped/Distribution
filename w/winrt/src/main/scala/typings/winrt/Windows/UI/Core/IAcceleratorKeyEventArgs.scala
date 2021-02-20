package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.System.VirtualKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAcceleratorKeyEventArgs extends ICoreWindowEventArgs {
  
  var eventType: CoreAcceleratorKeyEventType = js.native
  
  var keyStatus: CorePhysicalKeyStatus = js.native
  
  var virtualKey: VirtualKey = js.native
}
object IAcceleratorKeyEventArgs {
  
  @scala.inline
  def apply(
    eventType: CoreAcceleratorKeyEventType,
    handled: Boolean,
    keyStatus: CorePhysicalKeyStatus,
    virtualKey: VirtualKey
  ): IAcceleratorKeyEventArgs = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any], virtualKey = virtualKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAcceleratorKeyEventArgs]
  }
  
  @scala.inline
  implicit class IAcceleratorKeyEventArgsMutableBuilder[Self <: IAcceleratorKeyEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventType(value: CoreAcceleratorKeyEventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyStatus(value: CorePhysicalKeyStatus): Self = StObject.set(x, "keyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualKey(value: VirtualKey): Self = StObject.set(x, "virtualKey", value.asInstanceOf[js.Any])
  }
}
