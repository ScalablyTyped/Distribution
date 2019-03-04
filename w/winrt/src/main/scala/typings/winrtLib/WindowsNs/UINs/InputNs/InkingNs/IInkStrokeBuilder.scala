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
    appendToStroke: js.Function1[
      winrtLib.WindowsNs.UINs.InputNs.PointerPoint, 
      winrtLib.WindowsNs.UINs.InputNs.PointerPoint
    ],
    beginStroke: js.Function1[winrtLib.WindowsNs.UINs.InputNs.PointerPoint, scala.Unit],
    createStroke: js.Function1[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.FoundationNs.Point], 
      InkStroke
    ],
    endStroke: js.Function1[winrtLib.WindowsNs.UINs.InputNs.PointerPoint, InkStroke],
    setDefaultDrawingAttributes: js.Function1[InkDrawingAttributes, scala.Unit]
  ): IInkStrokeBuilder = {
    val __obj = js.Dynamic.literal(appendToStroke = appendToStroke, beginStroke = beginStroke, createStroke = createStroke, endStroke = endStroke, setDefaultDrawingAttributes = setDefaultDrawingAttributes)
  
    __obj.asInstanceOf[IInkStrokeBuilder]
  }
}

