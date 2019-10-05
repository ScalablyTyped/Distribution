package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerPointProperties extends js.Object {
  var contactRect: Rect
  var contactRectRaw: Rect
  var isBarrelButtonPressed: Boolean
  var isCanceled: Boolean
  var isEraser: Boolean
  var isHorizontalMouseWheel: Boolean
  var isInRange: Boolean
  var isInverted: Boolean
  var isLeftButtonPressed: Boolean
  var isMiddleButtonPressed: Boolean
  var isPrimary: Boolean
  var isRightButtonPressed: Boolean
  var isXButton1Pressed: Boolean
  var isXButton2Pressed: Boolean
  var mouseWheelDelta: Double
  var orientation: Double
  var pointerUpdateKind: PointerUpdateKind
  var pressure: Double
  var touchConfidence: Boolean
  var twist: Double
  var xTilt: Double
  var yTilt: Double
  def getUsageValue(usagePage: Double, usageId: Double): Double
  def hasUsage(usagePage: Double, usageId: Double): Boolean
}

object IPointerPointProperties {
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
    xTilt: Double,
    yTilt: Double
  ): IPointerPointProperties = {
    val __obj = js.Dynamic.literal(contactRect = contactRect, contactRectRaw = contactRectRaw, getUsageValue = js.Any.fromFunction2(getUsageValue), hasUsage = js.Any.fromFunction2(hasUsage), isBarrelButtonPressed = isBarrelButtonPressed, isCanceled = isCanceled, isEraser = isEraser, isHorizontalMouseWheel = isHorizontalMouseWheel, isInRange = isInRange, isInverted = isInverted, isLeftButtonPressed = isLeftButtonPressed, isMiddleButtonPressed = isMiddleButtonPressed, isPrimary = isPrimary, isRightButtonPressed = isRightButtonPressed, isXButton1Pressed = isXButton1Pressed, isXButton2Pressed = isXButton2Pressed, mouseWheelDelta = mouseWheelDelta, orientation = orientation, pointerUpdateKind = pointerUpdateKind, pressure = pressure, touchConfidence = touchConfidence, twist = twist, xTilt = xTilt, yTilt = yTilt)
  
    __obj.asInstanceOf[IPointerPointProperties]
  }
}

