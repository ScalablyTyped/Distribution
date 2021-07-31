package typings.winrt.Windows.UI.Input.Inking

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.UI.Input.PointerPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInkStrokeBuilder extends StObject {
  
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
  
  @scala.inline
  implicit class IInkStrokeBuilderMutableBuilder[Self <: IInkStrokeBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendToStroke(value: PointerPoint => PointerPoint): Self = StObject.set(x, "appendToStroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginStroke(value: PointerPoint => Unit): Self = StObject.set(x, "beginStroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateStroke(value: IIterable[Point] => InkStroke): Self = StObject.set(x, "createStroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndStroke(value: PointerPoint => InkStroke): Self = StObject.set(x, "endStroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultDrawingAttributes(value: InkDrawingAttributes => Unit): Self = StObject.set(x, "setDefaultDrawingAttributes", js.Any.fromFunction1(value))
  }
}
