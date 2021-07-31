package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides extended properties for a PointerPoint object. */
trait PointerPointProperties extends StObject {
  
  /** Gets the bounding rectangle of the contact area (typically from touch input). */
  var contactRect: Rect
  
  /** Gets the bounding rectangle of the raw input (typically from touch input). */
  var contactRectRaw: Rect
  
  /**
    * Gets the Human Interface Device (HID) usage value of the raw input.
    * @param usagePage The HID usage page of the pointer device.
    * @param usageId Indicates a usage in a usage page.
    * @return The extended usage of the raw input pointer.
    */
  def getUsageValue(usagePage: Double, usageId: Double): Double
  
  /**
    * Gets a value that indicates whether the input data from the pointer device contains the specified Human Interface Device (HID) usage information.
    * @param usagePage The HID usage page of the pointer device.
    * @param usageId Indicates a usage in a usage page.
    * @return True if the input data includes usage information; otherwise false.
    */
  def hasUsage(usagePage: Double, usageId: Double): Boolean
  
  /** Gets a value that indicates whether the barrel button of the pen/stylus device is pressed. */
  var isBarrelButtonPressed: Boolean
  
  /** Gets a value that indicates whether the input was canceled by the pointer device. */
  var isCanceled: Boolean
  
  /** Gets a value that indicates whether the input is from a digitizer eraser. */
  var isEraser: Boolean
  
  /** Gets a value that indicates whether the input is from a mouse tilt wheel. */
  var isHorizontalMouseWheel: Boolean
  
  /** Gets a value that indicates whether the pointer device is within detection range of a sensor or digitizer. */
  var isInRange: Boolean
  
  /** Gets a value that indicates whether the digitizer pen is inverted. */
  var isInverted: Boolean
  
  /** Gets a value that indicates whether the input is from the left button of a mouse or other input method. */
  var isLeftButtonPressed: Boolean
  
  /** Gets a value that indicates whether the input is from the middle button of a mouse or other input method. */
  var isMiddleButtonPressed: Boolean
  
  /** Gets a value that indicates whether the input is from the primary pointer when multiple pointers are registered. */
  var isPrimary: Boolean
  
  /** Gets a value that indicates whether the input is from the right button of a mouse or other input method. */
  var isRightButtonPressed: Boolean
  
  /** Gets the pressed state of the first extended mouse button. */
  var isXButton1Pressed: Boolean
  
  /** Gets the pressed state of the second extended mouse button. */
  var isXButton2Pressed: Boolean
  
  /** Gets a value (the raw value reported by the device) that indicates the change in wheel button input from the last pointer event. */
  var mouseWheelDelta: Double
  
  /** Gets the counter-clockwise angle of rotation around the major axis of the pointer device (the z-axis, perpendicular to the surface of the digitizer). A value of 0.0 degrees indicates the device is oriented towards the top of the digitizer. */
  var orientation: Double
  
  /** Gets the kind of pointer state change. */
  var pointerUpdateKind: PointerUpdateKind
  
  /** Gets a value that indicates the force that the pointer device (typically a pen/stylus) exerts on the surface of the digitizer. */
  var pressure: Double
  
  /** Gets a value that indicates whether the pointer device rejected the touch contact. */
  var touchConfidence: Boolean
  
  /** Gets the clockwise rotation in degrees of a pen device around its own major axis (such as when the user spins the pen in their fingers). */
  var twist: Double
  
  /** Gets the plane angle between the Y-Z plane and the plane that contains the Y axis and the axis of the input device (typically a pen/stylus). */
  var xtilt: Double
  
  /** Gets the plane angle between the X-Z plane and the plane that contains the X axis and the axis of the input device (typically a pen/stylus). */
  var ytilt: Double
  
  var zdistance: js.Any
}
object PointerPointProperties {
  
  @scala.inline
  def apply(
    contactRect: Rect,
    contactRectRaw: Rect,
    getUsageValue: (Double, Double) => Double,
    hasUsage: (Double, Double) => Boolean,
    isBarrelButtonPressed: Boolean,
    isCanceled: Boolean,
    isEraser: Boolean,
    isHorizontalMouseWheel: Boolean,
    isInRange: Boolean,
    isInverted: Boolean,
    isLeftButtonPressed: Boolean,
    isMiddleButtonPressed: Boolean,
    isPrimary: Boolean,
    isRightButtonPressed: Boolean,
    isXButton1Pressed: Boolean,
    isXButton2Pressed: Boolean,
    mouseWheelDelta: Double,
    orientation: Double,
    pointerUpdateKind: PointerUpdateKind,
    pressure: Double,
    touchConfidence: Boolean,
    twist: Double,
    xtilt: Double,
    ytilt: Double,
    zdistance: js.Any
  ): PointerPointProperties = {
    val __obj = js.Dynamic.literal(contactRect = contactRect.asInstanceOf[js.Any], contactRectRaw = contactRectRaw.asInstanceOf[js.Any], getUsageValue = js.Any.fromFunction2(getUsageValue), hasUsage = js.Any.fromFunction2(hasUsage), isBarrelButtonPressed = isBarrelButtonPressed.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any], isEraser = isEraser.asInstanceOf[js.Any], isHorizontalMouseWheel = isHorizontalMouseWheel.asInstanceOf[js.Any], isInRange = isInRange.asInstanceOf[js.Any], isInverted = isInverted.asInstanceOf[js.Any], isLeftButtonPressed = isLeftButtonPressed.asInstanceOf[js.Any], isMiddleButtonPressed = isMiddleButtonPressed.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], isRightButtonPressed = isRightButtonPressed.asInstanceOf[js.Any], isXButton1Pressed = isXButton1Pressed.asInstanceOf[js.Any], isXButton2Pressed = isXButton2Pressed.asInstanceOf[js.Any], mouseWheelDelta = mouseWheelDelta.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pointerUpdateKind = pointerUpdateKind.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], touchConfidence = touchConfidence.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any], xtilt = xtilt.asInstanceOf[js.Any], ytilt = ytilt.asInstanceOf[js.Any], zdistance = zdistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerPointProperties]
  }
  
  @scala.inline
  implicit class PointerPointPropertiesMutableBuilder[Self <: PointerPointProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactRect(value: Rect): Self = StObject.set(x, "contactRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactRectRaw(value: Rect): Self = StObject.set(x, "contactRectRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUsageValue(value: (Double, Double) => Double): Self = StObject.set(x, "getUsageValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasUsage(value: (Double, Double) => Boolean): Self = StObject.set(x, "hasUsage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsBarrelButtonPressed(value: Boolean): Self = StObject.set(x, "isBarrelButtonPressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEraser(value: Boolean): Self = StObject.set(x, "isEraser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHorizontalMouseWheel(value: Boolean): Self = StObject.set(x, "isHorizontalMouseWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInRange(value: Boolean): Self = StObject.set(x, "isInRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInverted(value: Boolean): Self = StObject.set(x, "isInverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLeftButtonPressed(value: Boolean): Self = StObject.set(x, "isLeftButtonPressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMiddleButtonPressed(value: Boolean): Self = StObject.set(x, "isMiddleButtonPressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRightButtonPressed(value: Boolean): Self = StObject.set(x, "isRightButtonPressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsXButton1Pressed(value: Boolean): Self = StObject.set(x, "isXButton1Pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsXButton2Pressed(value: Boolean): Self = StObject.set(x, "isXButton2Pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseWheelDelta(value: Double): Self = StObject.set(x, "mouseWheelDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerUpdateKind(value: PointerUpdateKind): Self = StObject.set(x, "pointerUpdateKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressure(value: Double): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchConfidence(value: Boolean): Self = StObject.set(x, "touchConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwist(value: Double): Self = StObject.set(x, "twist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXtilt(value: Double): Self = StObject.set(x, "xtilt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYtilt(value: Double): Self = StObject.set(x, "ytilt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZdistance(value: js.Any): Self = StObject.set(x, "zdistance", value.asInstanceOf[js.Any])
  }
}
