package typings.terminalKit.anon

import typings.terminalKit.terminalKitStrings.button
import typings.terminalKit.terminalKitStrings.drag
import typings.terminalKit.terminalKitStrings.motion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mouse extends StObject {
  
  var mouse: js.UndefOr[button | drag | motion] = js.native
  
  var safe: js.UndefOr[Boolean] = js.native
}
object Mouse {
  
  @scala.inline
  def apply(): Mouse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mouse]
  }
  
  @scala.inline
  implicit class MouseMutableBuilder[Self <: Mouse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMouse(value: button | drag | motion): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
    
    @scala.inline
    def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
  }
}
