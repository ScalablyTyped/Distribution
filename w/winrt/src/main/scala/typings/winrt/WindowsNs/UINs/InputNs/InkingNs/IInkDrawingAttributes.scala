package typings.winrt.WindowsNs.UINs.InputNs.InkingNs

import typings.winrt.WindowsNs.FoundationNs.Size
import typings.winrt.WindowsNs.UINs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkDrawingAttributes extends js.Object {
  var color: Color
  var fitToCurve: Boolean
  var ignorePressure: Boolean
  var penTip: PenTipShape
  var size: Size
}

object IInkDrawingAttributes {
  @scala.inline
  def apply(color: Color, fitToCurve: Boolean, ignorePressure: Boolean, penTip: PenTipShape, size: Size): IInkDrawingAttributes = {
    val __obj = js.Dynamic.literal(color = color, fitToCurve = fitToCurve, ignorePressure = ignorePressure, penTip = penTip, size = size)
  
    __obj.asInstanceOf[IInkDrawingAttributes]
  }
}

