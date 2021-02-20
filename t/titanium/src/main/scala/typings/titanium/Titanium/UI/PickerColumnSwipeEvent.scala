package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the device detects a swipe gesture against the view.
  */
@js.native
trait PickerColumnSwipeEvent extends PickerColumnBaseEvent {
  
  /**
    * Direction of the swipe--either 'left', 'right', 'up', or 'down'.
    */
  var direction: String = js.native
  
  /**
    * X coordinate of the event's endpoint from the `source` view's coordinate system.
    */
  var x: Double = js.native
  
  /**
    * Y coordinate of the event's endpoint from the `source` view's coordinate system.
    */
  var y: Double = js.native
}
object PickerColumnSwipeEvent {
  
  @scala.inline
  def apply(direction: String, source: PickerColumn, x: Double, y: Double): PickerColumnSwipeEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerColumnSwipeEvent]
  }
  
  @scala.inline
  implicit class PickerColumnSwipeEventMutableBuilder[Self <: PickerColumnSwipeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
