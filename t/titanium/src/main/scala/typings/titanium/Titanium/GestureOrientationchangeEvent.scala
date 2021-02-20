package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the device orientation changes.
  */
@js.native
trait GestureOrientationchangeEvent extends GestureBaseEvent {
  
  /**
    * Orientation of the device.
    */
  var orientation: Double = js.native
}
object GestureOrientationchangeEvent {
  
  @scala.inline
  def apply(orientation: Double, source: Gesture): GestureOrientationchangeEvent = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureOrientationchangeEvent]
  }
  
  @scala.inline
  implicit class GestureOrientationchangeEventMutableBuilder[Self <: GestureOrientationchangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
  }
}
