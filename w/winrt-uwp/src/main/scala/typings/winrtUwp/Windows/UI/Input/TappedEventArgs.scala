package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the Tapped event. */
trait TappedEventArgs extends StObject {
  
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType
  
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  var position: Point
  
  /** Gets the number of times the tap interaction was detected. */
  var tapCount: Double
}
object TappedEventArgs {
  
  inline def apply(pointerDeviceType: PointerDeviceType, position: Point, tapCount: Double): TappedEventArgs = {
    val __obj = js.Dynamic.literal(pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tapCount = tapCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TappedEventArgs]
  }
  
  extension [Self <: TappedEventArgs](x: Self) {
    
    inline def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTapCount(value: Double): Self = StObject.set(x, "tapCount", value.asInstanceOf[js.Any])
  }
}
