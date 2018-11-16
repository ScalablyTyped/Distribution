package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.Inking.InkStrokeBuilder")
@js.native
class InkStrokeBuilder () extends IInkStrokeBuilder {
  /* CompleteClass */
  override def appendToStroke(pointerPoint: winrtLib.WindowsNs.UINs.InputNs.PointerPoint): winrtLib.WindowsNs.UINs.InputNs.PointerPoint = js.native
  /* CompleteClass */
  override def beginStroke(pointerPoint: winrtLib.WindowsNs.UINs.InputNs.PointerPoint): scala.Unit = js.native
  /* CompleteClass */
  override def createStroke(
    points: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.FoundationNs.Point]
  ): InkStroke = js.native
  /* CompleteClass */
  override def endStroke(pointerPoint: winrtLib.WindowsNs.UINs.InputNs.PointerPoint): InkStroke = js.native
  /* CompleteClass */
  override def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): scala.Unit = js.native
}

