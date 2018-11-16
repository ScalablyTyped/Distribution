package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPointerPointStatics extends js.Object {
  def getCurrentPoint(pointerId: scala.Double): PointerPoint = js.native
  def getCurrentPoint(pointerId: scala.Double, transform: IPointerPointTransform): PointerPoint = js.native
  def getIntermediatePoints(pointerId: scala.Double): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[PointerPoint] = js.native
  def getIntermediatePoints(pointerId: scala.Double, transform: IPointerPointTransform): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[PointerPoint] = js.native
}

