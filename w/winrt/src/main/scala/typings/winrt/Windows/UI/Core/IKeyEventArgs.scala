package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.System.VirtualKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeyEventArgs extends ICoreWindowEventArgs {
  
  var keyStatus: CorePhysicalKeyStatus = js.native
  
  var virtualKey: VirtualKey = js.native
}
object IKeyEventArgs {
  
  @scala.inline
  def apply(handled: Boolean, keyStatus: CorePhysicalKeyStatus, virtualKey: VirtualKey): IKeyEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any], virtualKey = virtualKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyEventArgs]
  }
  
  @scala.inline
  implicit class IKeyEventArgsMutableBuilder[Self <: IKeyEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyStatus(value: CorePhysicalKeyStatus): Self = StObject.set(x, "keyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualKey(value: VirtualKey): Self = StObject.set(x, "virtualKey", value.asInstanceOf[js.Any])
  }
}
