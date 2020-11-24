package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDevice
import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides basic properties for the input pointer associated with a single mouse, pen/stylus, or touch contact. */
@js.native
trait PointerPoint extends js.Object {
  
  /** Gets the ID of an input frame. */
  var frameId: Double = js.native
  
  /** Gets a value that indicates whether the physical entity (touch, pen/stylus, or mouse button) is pressed down. */
  var isInContact: Boolean = js.native
  
  /** Gets information about the device associated with the input pointer. */
  var pointerDevice: PointerDevice = js.native
  
  /** Gets a unique identifier for the input pointer. */
  var pointerId: Double = js.native
  
  /** Gets the location of the pointer input in client coordinates. */
  var position: Point = js.native
  
  /** Gets extended information about the input pointer. */
  var properties: PointerPointProperties = js.native
  
  /** Gets the raw location of the pointer input in client coordinates. */
  var rawPosition: Point = js.native
  
  /** Gets the time when the input occurred. */
  var timestamp: Double = js.native
}
object PointerPoint {
  
  @scala.inline
  def apply(
    frameId: Double,
    isInContact: Boolean,
    pointerDevice: PointerDevice,
    pointerId: Double,
    position: Point,
    properties: PointerPointProperties,
    rawPosition: Point,
    timestamp: Double
  ): PointerPoint = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], isInContact = isInContact.asInstanceOf[js.Any], pointerDevice = pointerDevice.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rawPosition = rawPosition.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerPoint]
  }
  
  @scala.inline
  implicit class PointerPointOps[Self <: PointerPoint] (val x: Self) extends AnyVal {
    
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
    def setFrameId(value: Double): Self = this.set("frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInContact(value: Boolean): Self = this.set("isInContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerDevice(value: PointerDevice): Self = this.set("pointerDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerId(value: Double): Self = this.set("pointerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: PointerPointProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawPosition(value: Point): Self = this.set("rawPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
