package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDevice
import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides basic properties for the input pointer associated with a single mouse, pen/stylus, or touch contact. */
trait PointerPoint extends StObject {
  
  /** Gets the ID of an input frame. */
  var frameId: Double
  
  /** Gets a value that indicates whether the physical entity (touch, pen/stylus, or mouse button) is pressed down. */
  var isInContact: Boolean
  
  /** Gets information about the device associated with the input pointer. */
  var pointerDevice: PointerDevice
  
  /** Gets a unique identifier for the input pointer. */
  var pointerId: Double
  
  /** Gets the location of the pointer input in client coordinates. */
  var position: Point
  
  /** Gets extended information about the input pointer. */
  var properties: PointerPointProperties
  
  /** Gets the raw location of the pointer input in client coordinates. */
  var rawPosition: Point
  
  /** Gets the time when the input occurred. */
  var timestamp: Double
}
object PointerPoint {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: PointerPoint] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setIsInContact(value: Boolean): Self = StObject.set(x, "isInContact", value.asInstanceOf[js.Any])
    
    inline def setPointerDevice(value: PointerDevice): Self = StObject.set(x, "pointerDevice", value.asInstanceOf[js.Any])
    
    inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: PointerPointProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRawPosition(value: Point): Self = StObject.set(x, "rawPosition", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
