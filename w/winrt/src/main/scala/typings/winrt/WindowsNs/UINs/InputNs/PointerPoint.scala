package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.WindowsNs.DevicesNs.InputNs.PointerDevice
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
class PointerPoint () extends IPointerPoint {
  /* CompleteClass */
  override var frameId: Double = js.native
  /* CompleteClass */
  override var isInContact: Boolean = js.native
  /* CompleteClass */
  override var pointerDevice: PointerDevice = js.native
  /* CompleteClass */
  override var pointerId: Double = js.native
  /* CompleteClass */
  override var position: Point = js.native
  /* CompleteClass */
  override var properties: PointerPointProperties = js.native
  /* CompleteClass */
  override var rawPosition: Point = js.native
  /* CompleteClass */
  override var timestamp: Double = js.native
}

/* static members */
@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
object PointerPoint extends js.Object {
  def getCurrentPoint(pointerId: Double): PointerPoint = js.native
  def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): PointerPoint = js.native
  def getIntermediatePoints(pointerId: Double): IVector[PointerPoint] = js.native
  def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[PointerPoint] = js.native
}

