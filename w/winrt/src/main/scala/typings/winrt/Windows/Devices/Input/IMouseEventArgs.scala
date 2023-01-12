package typings.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseEventArgs extends StObject {
  
  var mouseDelta: MouseDelta
}
object IMouseEventArgs {
  
  inline def apply(mouseDelta: MouseDelta): IMouseEventArgs = {
    val __obj = js.Dynamic.literal(mouseDelta = mouseDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMouseEventArgs] (val x: Self) extends AnyVal {
    
    inline def setMouseDelta(value: MouseDelta): Self = StObject.set(x, "mouseDelta", value.asInstanceOf[js.Any])
  }
}
