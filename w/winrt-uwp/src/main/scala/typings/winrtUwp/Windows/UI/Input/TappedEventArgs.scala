package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the Tapped event. */
@js.native
trait TappedEventArgs extends StObject {
  
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType = js.native
  
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  var position: Point = js.native
  
  /** Gets the number of times the tap interaction was detected. */
  var tapCount: Double = js.native
}
object TappedEventArgs {
  
  @scala.inline
  def apply(pointerDeviceType: PointerDeviceType, position: Point, tapCount: Double): TappedEventArgs = {
    val __obj = js.Dynamic.literal(pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tapCount = tapCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TappedEventArgs]
  }
  
  @scala.inline
  implicit class TappedEventArgsMutableBuilder[Self <: TappedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapCount(value: Double): Self = StObject.set(x, "tapCount", value.asInstanceOf[js.Any])
  }
}
