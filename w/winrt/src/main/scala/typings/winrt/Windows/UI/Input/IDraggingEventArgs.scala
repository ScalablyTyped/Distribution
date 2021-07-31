package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDraggingEventArgs extends StObject {
  
  var draggingState: DraggingState
  
  var pointerDeviceType: PointerDeviceType
  
  var position: Point
}
object IDraggingEventArgs {
  
  @scala.inline
  def apply(draggingState: DraggingState, pointerDeviceType: PointerDeviceType, position: Point): IDraggingEventArgs = {
    val __obj = js.Dynamic.literal(draggingState = draggingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDraggingEventArgs]
  }
  
  @scala.inline
  implicit class IDraggingEventArgsMutableBuilder[Self <: IDraggingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggingState(value: DraggingState): Self = StObject.set(x, "draggingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
