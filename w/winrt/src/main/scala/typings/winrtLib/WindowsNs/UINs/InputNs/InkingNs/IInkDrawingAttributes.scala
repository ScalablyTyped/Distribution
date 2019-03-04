package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkDrawingAttributes extends js.Object {
  var color: winrtLib.WindowsNs.UINs.Color
  var fitToCurve: scala.Boolean
  var ignorePressure: scala.Boolean
  var penTip: PenTipShape
  var size: winrtLib.WindowsNs.FoundationNs.Size
}

object IInkDrawingAttributes {
  @scala.inline
  def apply(
    color: winrtLib.WindowsNs.UINs.Color,
    fitToCurve: scala.Boolean,
    ignorePressure: scala.Boolean,
    penTip: PenTipShape,
    size: winrtLib.WindowsNs.FoundationNs.Size
  ): IInkDrawingAttributes = {
    val __obj = js.Dynamic.literal(color = color, fitToCurve = fitToCurve, ignorePressure = ignorePressure, penTip = penTip, size = size)
  
    __obj.asInstanceOf[IInkDrawingAttributes]
  }
}

