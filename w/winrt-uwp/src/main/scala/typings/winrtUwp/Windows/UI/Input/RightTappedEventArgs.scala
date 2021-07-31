package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the RightTapped event. */
trait RightTappedEventArgs extends StObject {
  
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType
  
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  var position: Point
}
object RightTappedEventArgs {
  
  @scala.inline
  def apply(pointerDeviceType: PointerDeviceType, position: Point): RightTappedEventArgs = {
    val __obj = js.Dynamic.literal(pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightTappedEventArgs]
  }
  
  @scala.inline
  implicit class RightTappedEventArgsMutableBuilder[Self <: RightTappedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
