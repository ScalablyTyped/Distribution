package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the Dragging event. */
trait DraggingEventArgs extends StObject {
  
  /** Gets the state of the Dragging event. */
  var draggingState: DraggingState
  
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType
  
  /** Gets the location of the mouse or pen/stylus contact. */
  var position: Point
}
object DraggingEventArgs {
  
  inline def apply(draggingState: DraggingState, pointerDeviceType: PointerDeviceType, position: Point): DraggingEventArgs = {
    val __obj = js.Dynamic.literal(draggingState = draggingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggingEventArgs]
  }
  
  extension [Self <: DraggingEventArgs](x: Self) {
    
    inline def setDraggingState(value: DraggingState): Self = StObject.set(x, "draggingState", value.asInstanceOf[js.Any])
    
    inline def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
