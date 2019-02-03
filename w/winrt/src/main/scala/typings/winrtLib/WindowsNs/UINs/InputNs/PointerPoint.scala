package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
class PointerPoint () extends IPointerPoint {
  /* CompleteClass */
  override var frameId: scala.Double = js.native
  /* CompleteClass */
  override var isInContact: scala.Boolean = js.native
  /* CompleteClass */
  override var pointerDevice: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDevice = js.native
  /* CompleteClass */
  override var pointerId: scala.Double = js.native
  /* CompleteClass */
  override var position: winrtLib.WindowsNs.FoundationNs.Point = js.native
  /* CompleteClass */
  override var properties: PointerPointProperties = js.native
  /* CompleteClass */
  override var rawPosition: winrtLib.WindowsNs.FoundationNs.Point = js.native
  /* CompleteClass */
  override var timestamp: scala.Double = js.native
}

/* static members */
@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
object PointerPoint extends js.Object {
  def getCurrentPoint(pointerId: scala.Double): winrtLib.WindowsNs.UINs.InputNs.PointerPoint = js.native
  def getCurrentPoint(pointerId: scala.Double, transform: winrtLib.WindowsNs.UINs.InputNs.IPointerPointTransform): winrtLib.WindowsNs.UINs.InputNs.PointerPoint = js.native
  def getIntermediatePoints(pointerId: scala.Double): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.UINs.InputNs.PointerPoint] = js.native
  def getIntermediatePoints(pointerId: scala.Double, transform: winrtLib.WindowsNs.UINs.InputNs.IPointerPointTransform): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.UINs.InputNs.PointerPoint] = js.native
}

