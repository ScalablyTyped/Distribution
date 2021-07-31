package typings.winrtUwp.global.Windows.UI.Input

import typings.winrtUwp.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides extended properties for a PointerPoint object. */
@JSGlobal("Windows.UI.Input.PointerPointProperties")
@js.native
abstract class PointerPointProperties ()
  extends StObject
     with typings.winrtUwp.Windows.UI.Input.PointerPointProperties {
  
  /** Gets the bounding rectangle of the contact area (typically from touch input). */
  /* CompleteClass */
  var contactRect: Rect = js.native
  
  /** Gets the bounding rectangle of the raw input (typically from touch input). */
  /* CompleteClass */
  var contactRectRaw: Rect = js.native
  
  /**
    * Gets the Human Interface Device (HID) usage value of the raw input.
    * @param usagePage The HID usage page of the pointer device.
    * @param usageId Indicates a usage in a usage page.
    * @return The extended usage of the raw input pointer.
    */
  /* CompleteClass */
  override def getUsageValue(usagePage: Double, usageId: Double): Double = js.native
  
  /**
    * Gets a value that indicates whether the input data from the pointer device contains the specified Human Interface Device (HID) usage information.
    * @param usagePage The HID usage page of the pointer device.
    * @param usageId Indicates a usage in a usage page.
    * @return True if the input data includes usage information; otherwise false.
    */
  /* CompleteClass */
  override def hasUsage(usagePage: Double, usageId: Double): Boolean = js.native
  
  /** Gets a value that indicates whether the barrel button of the pen/stylus device is pressed. */
  /* CompleteClass */
  var isBarrelButtonPressed: Boolean = js.native
  
  /** Gets a value that indicates whether the input was canceled by the pointer device. */
  /* CompleteClass */
  var isCanceled: Boolean = js.native
  
  /** Gets a value that indicates whether the input is from a digitizer eraser. */
  /* CompleteClass */
  var isEraser: Boolean = js.native
  
  /** Gets a value that indicates whether the input is from a mouse tilt wheel. */
  /* CompleteClass */
  var isHorizontalMouseWheel: Boolean = js.native
  
  /** Gets a value that indicates whether the pointer device is within detection range of a sensor or digitizer. */
  /* CompleteClass */
  var isInRange: Boolean = js.native
  
  /** Gets a value that indicates whether the digitizer pen is inverted. */
  /* CompleteClass */
  var isInverted: Boolean = js.native
  
  /** Gets a value that indicates whether the input is from the left button of a mouse or other input method. */
  /* CompleteClass */
  var isLeftButtonPressed: Boolean = js.native
  
  /** Gets a value that indicates whether the input is from the middle button of a mouse or other input method. */
  /* CompleteClass */
  var isMiddleButtonPressed: Boolean = js.native
  
  /** Gets a value that indicates whether the input is from the primary pointer when multiple pointers are registered. */
  /* CompleteClass */
  var isPrimary: Boolean = js.native
  
  /** Gets a value that indicates whether the input is from the right button of a mouse or other input method. */
  /* CompleteClass */
  var isRightButtonPressed: Boolean = js.native
  
  /** Gets the pressed state of the first extended mouse button. */
  /* CompleteClass */
  var isXButton1Pressed: Boolean = js.native
  
  /** Gets the pressed state of the second extended mouse button. */
  /* CompleteClass */
  var isXButton2Pressed: Boolean = js.native
  
  /** Gets a value (the raw value reported by the device) that indicates the change in wheel button input from the last pointer event. */
  /* CompleteClass */
  var mouseWheelDelta: Double = js.native
  
  /** Gets the counter-clockwise angle of rotation around the major axis of the pointer device (the z-axis, perpendicular to the surface of the digitizer). A value of 0.0 degrees indicates the device is oriented towards the top of the digitizer. */
  /* CompleteClass */
  var orientation: Double = js.native
  
  /** Gets the kind of pointer state change. */
  /* CompleteClass */
  var pointerUpdateKind: typings.winrtUwp.Windows.UI.Input.PointerUpdateKind = js.native
  
  /** Gets a value that indicates the force that the pointer device (typically a pen/stylus) exerts on the surface of the digitizer. */
  /* CompleteClass */
  var pressure: Double = js.native
  
  /** Gets a value that indicates whether the pointer device rejected the touch contact. */
  /* CompleteClass */
  var touchConfidence: Boolean = js.native
  
  /** Gets the clockwise rotation in degrees of a pen device around its own major axis (such as when the user spins the pen in their fingers). */
  /* CompleteClass */
  var twist: Double = js.native
  
  /** Gets the plane angle between the Y-Z plane and the plane that contains the Y axis and the axis of the input device (typically a pen/stylus). */
  /* CompleteClass */
  var xtilt: Double = js.native
  
  /** Gets the plane angle between the X-Z plane and the plane that contains the X axis and the axis of the input device (typically a pen/stylus). */
  /* CompleteClass */
  var ytilt: Double = js.native
  
  /* CompleteClass */
  var zdistance: js.Any = js.native
}
