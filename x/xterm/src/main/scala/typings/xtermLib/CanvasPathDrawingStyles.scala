package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasPathDrawingStyles extends js.Object {
  var lineCap: CanvasLineCap
  var lineDashOffset: scala.Double
  var lineJoin: CanvasLineJoin
  var lineWidth: scala.Double
  var miterLimit: scala.Double
  def getLineDash(): js.Array[scala.Double]
  def setLineDash(segments: js.Array[scala.Double]): scala.Unit
}

object CanvasPathDrawingStyles {
  @scala.inline
  def apply(
    getLineDash: () => js.Array[scala.Double],
    lineCap: CanvasLineCap,
    lineDashOffset: scala.Double,
    lineJoin: CanvasLineJoin,
    lineWidth: scala.Double,
    miterLimit: scala.Double,
    setLineDash: js.Array[scala.Double] => scala.Unit
  ): CanvasPathDrawingStyles = {
    val __obj = js.Dynamic.literal(getLineDash = js.Any.fromFunction0(getLineDash), lineCap = lineCap, lineDashOffset = lineDashOffset, lineJoin = lineJoin, lineWidth = lineWidth, miterLimit = miterLimit, setLineDash = js.Any.fromFunction1(setLineDash))
  
    __obj.asInstanceOf[CanvasPathDrawingStyles]
  }
}

