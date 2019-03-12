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
    clearCanvas: () => scala.Unit,
    getCanvas: java.lang.String => js.Any,
    hideCanvas: () => scala.Unit,
    renderText: (scala.Double, scala.Double, java.lang.String, java.lang.String, scala.Double) => scala.Unit,
    renderTextAt: (java.lang.String, java.lang.String, scala.Double, scala.Double, java.lang.String, java.lang.String, scala.Double) => scala.Unit,
    showCanvas: () => scala.Unit,
    toggleCanvas: () => scala.Unit
  ): Canvas = {
    val __obj = js.Dynamic.literal(clearCanvas = js.Any.fromFunction0(clearCanvas), getCanvas = js.Any.fromFunction1(getCanvas), hideCanvas = js.Any.fromFunction0(hideCanvas), renderText = js.Any.fromFunction5(renderText), renderTextAt = js.Any.fromFunction7(renderTextAt), showCanvas = js.Any.fromFunction0(showCanvas), toggleCanvas = js.Any.fromFunction0(toggleCanvas))
  
    __obj.asInstanceOf[Canvas]
  }
}

