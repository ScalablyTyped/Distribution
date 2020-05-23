package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canvas extends js.Object {
  def clearCanvas(): Unit
  def getCanvas(context: String): js.Any
  def hideCanvas(): Unit
  def renderText(x: Double, y: Double, text: String, css: String, w: Double): Unit
  def renderTextAt(valign: String, align: String, x: Double, y: Double, t: String, c: String, w: Double): Unit
  def showCanvas(): Unit
  def toggleCanvas(): Unit
}

object Canvas {
  @scala.inline
  def apply(
    clearCanvas: () => Unit,
    getCanvas: String => js.Any,
    hideCanvas: () => Unit,
    renderText: (Double, Double, String, String, Double) => Unit,
    renderTextAt: (String, String, Double, Double, String, String, Double) => Unit,
    showCanvas: () => Unit,
    toggleCanvas: () => Unit
  ): Canvas = {
    val __obj = js.Dynamic.literal(clearCanvas = js.Any.fromFunction0(clearCanvas), getCanvas = js.Any.fromFunction1(getCanvas), hideCanvas = js.Any.fromFunction0(hideCanvas), renderText = js.Any.fromFunction5(renderText), renderTextAt = js.Any.fromFunction7(renderTextAt), showCanvas = js.Any.fromFunction0(showCanvas), toggleCanvas = js.Any.fromFunction0(toggleCanvas))
    __obj.asInstanceOf[Canvas]
  }
}

