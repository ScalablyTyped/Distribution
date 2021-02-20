package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the CrossSliding event. */
@js.native
trait CrossSlidingEventArgs extends StObject {
  
  /** Gets the state of the CrossSliding event. */
  var crossSlidingState: CrossSlidingState = js.native
  
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType = js.native
  
  /** Gets the location of the touch contact. */
  var position: Point = js.native
}
object CrossSlidingEventArgs {
  
  @scala.inline
  def apply(crossSlidingState: CrossSlidingState, pointerDeviceType: PointerDeviceType, position: Point): CrossSlidingEventArgs = {
    val __obj = js.Dynamic.literal(crossSlidingState = crossSlidingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossSlidingEventArgs]
  }
  
  @scala.inline
  implicit class CrossSlidingEventArgsMutableBuilder[Self <: CrossSlidingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossSlidingState(value: CrossSlidingState): Self = StObject.set(x, "crossSlidingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
