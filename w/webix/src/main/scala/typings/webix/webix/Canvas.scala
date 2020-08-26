package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canvas extends js.Object {
  def clearCanvas(): Unit = js.native
  def getCanvas(context: String): js.Any = js.native
  def hideCanvas(): Unit = js.native
  def renderText(x: Double, y: Double, text: String, css: String, w: Double): Unit = js.native
  def renderTextAt(valign: String, align: String, x: Double, y: Double, t: String, c: String, w: Double): Unit = js.native
  def showCanvas(): Unit = js.native
  def toggleCanvas(): Unit = js.native
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
  @scala.inline
  implicit class CanvasOps[Self <: Canvas] (val x: Self) extends AnyVal {
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
    def setClearCanvas(value: () => Unit): Self = this.set("clearCanvas", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCanvas(value: String => js.Any): Self = this.set("getCanvas", js.Any.fromFunction1(value))
    @scala.inline
    def setHideCanvas(value: () => Unit): Self = this.set("hideCanvas", js.Any.fromFunction0(value))
    @scala.inline
    def setRenderText(value: (Double, Double, String, String, Double) => Unit): Self = this.set("renderText", js.Any.fromFunction5(value))
    @scala.inline
    def setRenderTextAt(value: (String, String, Double, Double, String, String, Double) => Unit): Self = this.set("renderTextAt", js.Any.fromFunction7(value))
    @scala.inline
    def setShowCanvas(value: () => Unit): Self = this.set("showCanvas", js.Any.fromFunction0(value))
    @scala.inline
    def setToggleCanvas(value: () => Unit): Self = this.set("toggleCanvas", js.Any.fromFunction0(value))
  }
  
}

