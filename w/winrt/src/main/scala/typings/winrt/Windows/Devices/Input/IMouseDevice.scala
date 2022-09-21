package typings.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseDevice extends StObject {
  
  var onmousemoved: Any
}
object IMouseDevice {
  
  inline def apply(onmousemoved: Any): IMouseDevice = {
    val __obj = js.Dynamic.literal(onmousemoved = onmousemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseDevice]
  }
  
  extension [Self <: IMouseDevice](x: Self) {
    
    inline def setOnmousemoved(value: Any): Self = StObject.set(x, "onmousemoved", value.asInstanceOf[js.Any])
  }
}
