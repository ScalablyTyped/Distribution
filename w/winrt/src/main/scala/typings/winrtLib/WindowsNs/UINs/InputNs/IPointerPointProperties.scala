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

