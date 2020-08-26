package typings.winrt.global.Windows.UI.Input

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.UI.Input.IPointerPointTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
class PointerPoint ()
  extends typings.winrt.Windows.UI.Input.PointerPoint

/* static members */
@JSGlobal("Windows.UI.Input.PointerPoint")
@js.native
object PointerPoint extends js.Object {
  def getCurrentPoint(pointerId: Double): typings.winrt.Windows.UI.Input.PointerPoint = js.native
  def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): typings.winrt.Windows.UI.Input.PointerPoint = js.native
  def getIntermediatePoints(pointerId: Double): IVector[typings.winrt.Windows.UI.Input.PointerPoint] = js.native
  def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[typings.winrt.Windows.UI.Input.PointerPoint] = js.native
}

