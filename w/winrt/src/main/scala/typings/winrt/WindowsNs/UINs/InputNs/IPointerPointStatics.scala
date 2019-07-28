package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPointerPointStatics extends js.Object {
  def getCurrentPoint(pointerId: Double): PointerPoint = js.native
  def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): PointerPoint = js.native
  def getIntermediatePoints(pointerId: Double): IVector[PointerPoint] = js.native
  def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[PointerPoint] = js.native
}

