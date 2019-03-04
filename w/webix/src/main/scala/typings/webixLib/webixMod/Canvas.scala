package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canvas extends js.Object {
  def clearCanvas(): scala.Unit
  def getCanvas(context: java.lang.String): js.Any
  def hideCanvas(): scala.Unit
  def renderText(x: scala.Double, y: scala.Double, text: java.lang.String, css: java.lang.String, w: scala.Double): scala.Unit
  def renderTextAt(
    valign: java.lang.String,
    align: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    t: java.lang.String,
    c: java.lang.String,
    w: scala.Double
  ): scala.Unit
  def showCanvas(): scala.Unit
  def toggleCanvas(): scala.Unit
}

object Canvas {
  @scala.inline
  def apply(
    clearCanvas: js.Function0[scala.Unit],
    getCanvas: js.Function1[java.lang.String, js.Any],
    hideCanvas: js.Function0[scala.Unit],
    renderText: js.Function5[scala.Double, scala.Double, java.lang.String, java.lang.String, scala.Double, scala.Unit],
    renderTextAt: js.Function7[
      java.lang.String, 
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      java.lang.String, 
      java.lang.String, 
      scala.Double, 
      scala.Unit
    ],
    showCanvas: js.Function0[scala.Unit],
    toggleCanvas: js.Function0[scala.Unit]
  ): Canvas = {
    val __obj = js.Dynamic.literal(clearCanvas = clearCanvas, getCanvas = getCanvas, hideCanvas = hideCanvas, renderText = renderText, renderTextAt = renderTextAt, showCanvas = showCanvas, toggleCanvas = toggleCanvas)
  
    __obj.asInstanceOf[Canvas]
  }
}

