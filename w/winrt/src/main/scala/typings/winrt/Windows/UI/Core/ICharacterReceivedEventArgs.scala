package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICharacterReceivedEventArgs extends ICoreWindowEventArgs {
  
  var keyCode: Double = js.native
  
  var keyStatus: CorePhysicalKeyStatus = js.native
}
object ICharacterReceivedEventArgs {
  
  @scala.inline
  def apply(handled: Boolean, keyCode: Double, keyStatus: CorePhysicalKeyStatus): ICharacterReceivedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICharacterReceivedEventArgs]
  }
  
  @scala.inline
  implicit class ICharacterReceivedEventArgsMutableBuilder[Self <: ICharacterReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyStatus(value: CorePhysicalKeyStatus): Self = StObject.set(x, "keyStatus", value.asInstanceOf[js.Any])
  }
}
