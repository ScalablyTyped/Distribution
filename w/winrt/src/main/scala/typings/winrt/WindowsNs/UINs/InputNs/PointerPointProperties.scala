package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.WindowsNs.FoundationNs.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.PointerPointProperties")
@js.native
class PointerPointProperties () extends IPointerPointProperties {
  /* CompleteClass */
  override var contactRect: Rect = js.native
  /* CompleteClass */
  override var contactRectRaw: Rect = js.native
  /* CompleteClass */
  override var isBarrelButtonPressed: Boolean = js.native
  /* CompleteClass */
  override var isCanceled: Boolean = js.native
  /* CompleteClass */
  override var isEraser: Boolean = js.native
  /* CompleteClass */
  override var isHorizontalMouseWheel: Boolean = js.native
  /* CompleteClass */
  override var isInRange: Boolean = js.native
  /* CompleteClass */
  override var isInverted: Boolean = js.native
  /* CompleteClass */
  override var isLeftButtonPressed: Boolean = js.native
  /* CompleteClass */
  override var isMiddleButtonPressed: Boolean = js.native
  /* CompleteClass */
  override var isPrimary: Boolean = js.native
  /* CompleteClass */
  override var isRightButtonPressed: Boolean = js.native
  /* CompleteClass */
  override var isXButton1Pressed: Boolean = js.native
  /* CompleteClass */
  override var isXButton2Pressed: Boolean = js.native
  /* CompleteClass */
  override var mouseWheelDelta: Double = js.native
  /* CompleteClass */
  override var orientation: Double = js.native
  /* CompleteClass */
  override var pointerUpdateKind: PointerUpdateKind = js.native
  /* CompleteClass */
  override var pressure: Double = js.native
  /* CompleteClass */
  override var touchConfidence: Boolean = js.native
  /* CompleteClass */
  override var twist: Double = js.native
  /* CompleteClass */
  override var xTilt: Double = js.native
  /* CompleteClass */
  override var yTilt: Double = js.native
  /* CompleteClass */
  override def getUsageValue(usagePage: Double, usageId: Double): Double = js.native
  /* CompleteClass */
  override def hasUsage(usagePage: Double, usageId: Double): Boolean = js.native
}

