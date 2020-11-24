package typings.titanium.Titanium

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
  implicit class GestureOrientationchangeEventOps[Self <: GestureOrientationchangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOrientation(value: Double): Self = this.set("orientation", value.asInstanceOf[js.Any])
  }
}
