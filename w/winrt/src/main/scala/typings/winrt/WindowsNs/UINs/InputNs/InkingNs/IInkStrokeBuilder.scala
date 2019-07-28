package typings.winrt.WindowsNs.UINs.InputNs.InkingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.FoundationNs.Point
import typings.winrt.WindowsNs.UINs.InputNs.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkStrokeBuilder extends js.Object {
  def appendToStroke(pointerPoint: PointerPoint): PointerPoint
  def beginStroke(pointerPoint: PointerPoint): Unit
  def createStroke(points: IIterable[Point]): InkStroke
  def endStroke(pointerPoint: PointerPoint): InkStroke
  def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): Unit
}

object IInkStrokeBuilder {
  @scala.inline
  def apply(
    appendToStroke: PointerPoint => PointerPoint,
    beginStroke: PointerPoint => Unit,
    createStroke: IIterable[Point] => InkStroke,
    endStroke: PointerPoint => InkStroke,
    setDefaultDrawingAttributes: InkDrawingAttributes => Unit
  ): IInkStrokeBuilder = {
    val __obj = js.Dynamic.literal(appendToStroke = js.Any.fromFunction1(appendToStroke), beginStroke = js.Any.fromFunction1(beginStroke), createStroke = js.Any.fromFunction1(createStroke), endStroke = js.Any.fromFunction1(endStroke), setDefaultDrawingAttributes = js.Any.fromFunction1(setDefaultDrawingAttributes))
  
    __obj.asInstanceOf[IInkStrokeBuilder]
  }
}

