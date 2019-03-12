package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkStrokeBuilder extends js.Object {
  def appendToStroke(pointerPoint: winrtLib.WindowsNs.UINs.InputNs.PointerPoint): winrtLib.WindowsNs.UINs.InputNs.PointerPoint
  def beginStroke(pointerPoint: winrtLib.WindowsNs.UINs.InputNs.PointerPoint): scala.Unit
  def createStroke(
    points: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.FoundationNs.Point]
  ): InkStroke
  def endStroke(pointerPoint: winrtLib.WindowsNs.UINs.InputNs.PointerPoint): InkStroke
  def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): scala.Unit
}

object IInkStrokeBuilder {
  @scala.inline
  def apply(
    appendToStroke: winrtLib.WindowsNs.UINs.InputNs.PointerPoint => winrtLib.WindowsNs.UINs.InputNs.PointerPoint,
    beginStroke: winrtLib.WindowsNs.UINs.InputNs.PointerPoint => scala.Unit,
    createStroke: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.FoundationNs.Point] => InkStroke,
    endStroke: winrtLib.WindowsNs.UINs.InputNs.PointerPoint => InkStroke,
    setDefaultDrawingAttributes: InkDrawingAttributes => scala.Unit
  ): IInkStrokeBuilder = {
    val __obj = js.Dynamic.literal(appendToStroke = js.Any.fromFunction1(appendToStroke), beginStroke = js.Any.fromFunction1(beginStroke), createStroke = js.Any.fromFunction1(createStroke), endStroke = js.Any.fromFunction1(endStroke), setDefaultDrawingAttributes = js.Any.fromFunction1(setDefaultDrawingAttributes))
  
    __obj.asInstanceOf[IInkStrokeBuilder]
  }
}

