package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerPointProperties extends js.Object {
  var contactRect: winrtLib.WindowsNs.FoundationNs.Rect
  var contactRectRaw: winrtLib.WindowsNs.FoundationNs.Rect
  var isBarrelButtonPressed: scala.Boolean
  var isCanceled: scala.Boolean
  var isEraser: scala.Boolean
  var isHorizontalMouseWheel: scala.Boolean
  var isInRange: scala.Boolean
  var isInverted: scala.Boolean
  var isLeftButtonPressed: scala.Boolean
  var isMiddleButtonPressed: scala.Boolean
  var isPrimary: scala.Boolean
  var isRightButtonPressed: scala.Boolean
  var isXButton1Pressed: scala.Boolean
  var isXButton2Pressed: scala.Boolean
  var mouseWheelDelta: scala.Double
  var orientation: scala.Double
  var pointerUpdateKind: PointerUpdateKind
  var pressure: scala.Double
  var touchConfidence: scala.Boolean
  var twist: scala.Double
  var xTilt: scala.Double
  var yTilt: scala.Double
  def getUsageValue(usagePage: scala.Double, usageId: scala.Double): scala.Double
  def hasUsage(usagePage: scala.Double, usageId: scala.Double): scala.Boolean
}

object IPointerPointProperties {
  @scala.inline
  def apply(
    contactRect: winrtLib.WindowsNs.FoundationNs.Rect,
    contactRectRaw: winrtLib.WindowsNs.FoundationNs.Rect,
    getUsageValue: (scala.Double, scala.Double) => scala.Double,
    hasUsage: (scala.Double, scala.Double) => scala.Boolean,
    isBarrelButtonPressed: scala.Boolean,
    isCanceled: scala.Boolean,
    isEraser: scala.Boolean,
    isHorizontalMouseWheel: scala.Boolean,
    isInRange: scala.Boolean,
    isInverted: scala.Boolean,
    isLeftButtonPressed: scala.Boolean,
    isMiddleButtonPressed: scala.Boolean,
    isPrimary: scala.Boolean,
    isRightButtonPressed: scala.Boolean,
    isXButton1Pressed: scala.Boolean,
    isXButton2Pressed: scala.Boolean,
    mouseWheelDelta: scala.Double,
    orientation: scala.Double,
    pointerUpdateKind: PointerUpdateKind,
    pressure: scala.Double,
    touchConfidence: scala.Boolean,
    twist: scala.Double,
    xTilt: scala.Double,
    yTilt: scala.Double
  ): IPointerPointProperties = {
    val __obj = js.Dynamic.literal(contactRect = contactRect, contactRectRaw = contactRectRaw, getUsageValue = js.Any.fromFunction2(getUsageValue), hasUsage = js.Any.fromFunction2(hasUsage), isBarrelButtonPressed = isBarrelButtonPressed, isCanceled = isCanceled, isEraser = isEraser, isHorizontalMouseWheel = isHorizontalMouseWheel, isInRange = isInRange, isInverted = isInverted, isLeftButtonPressed = isLeftButtonPressed, isMiddleButtonPressed = isMiddleButtonPressed, isPrimary = isPrimary, isRightButtonPressed = isRightButtonPressed, isXButton1Pressed = isXButton1Pressed, isXButton2Pressed = isXButton2Pressed, mouseWheelDelta = mouseWheelDelta, orientation = orientation, pointerUpdateKind = pointerUpdateKind, pressure = pressure, touchConfidence = touchConfidence, twist = twist, xTilt = xTilt, yTilt = yTilt)
  
    __obj.asInstanceOf[IPointerPointProperties]
  }
}

