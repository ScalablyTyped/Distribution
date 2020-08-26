package typings.winrt.Windows.UI.Input.Inking

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.UI.Input.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInkStrokeBuilder extends js.Object {
  def appendToStroke(pointerPoint: PointerPoint): PointerPoint = js.native
  def beginStroke(pointerPoint: PointerPoint): Unit = js.native
  def createStroke(points: IIterable[Point]): InkStroke = js.native
  def endStroke(pointerPoint: PointerPoint): InkStroke = js.native
  def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): Unit = js.native
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
  @scala.inline
  implicit class IInkStrokeBuilderOps[Self <: IInkStrokeBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppendToStroke(value: PointerPoint => PointerPoint): Self = this.set("appendToStroke", js.Any.fromFunction1(value))
    @scala.inline
    def setBeginStroke(value: PointerPoint => Unit): Self = this.set("beginStroke", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateStroke(value: IIterable[Point] => InkStroke): Self = this.set("createStroke", js.Any.fromFunction1(value))
    @scala.inline
    def setEndStroke(value: PointerPoint => InkStroke): Self = this.set("endStroke", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDefaultDrawingAttributes(value: InkDrawingAttributes => Unit): Self = this.set("setDefaultDrawingAttributes", js.Any.fromFunction1(value))
  }
  
}

