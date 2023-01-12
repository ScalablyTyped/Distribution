package typings.terminalKit.anon

import typings.terminalKit.terminalKitStrings.button
import typings.terminalKit.terminalKitStrings.drag
import typings.terminalKit.terminalKitStrings.motion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mouse extends StObject {
  
  var mouse: js.UndefOr[button | drag | motion] = js.undefined
  
  var safe: js.UndefOr[Boolean] = js.undefined
}
object Mouse {
  
  inline def apply(): Mouse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mouse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mouse] (val x: Self) extends AnyVal {
    
    inline def setMouse(value: button | drag | motion): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    inline def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
    
    inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
    
    inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
  }
}
