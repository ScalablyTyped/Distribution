package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITappedEventArgs extends StObject {
  
  var pointerDeviceType: PointerDeviceType
  
  var position: Point
  
  var tapCount: Double
}
object ITappedEventArgs {
  
  inline def apply(pointerDeviceType: PointerDeviceType, position: Point, tapCount: Double): ITappedEventArgs = {
    val __obj = js.Dynamic.literal(pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tapCount = tapCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITappedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITappedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTapCount(value: Double): Self = StObject.set(x, "tapCount", value.asInstanceOf[js.Any])
  }
}
