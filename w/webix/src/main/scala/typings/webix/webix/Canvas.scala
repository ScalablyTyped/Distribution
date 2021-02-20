package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Canvas extends StObject {
  
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
  implicit class CanvasMutableBuilder[Self <: Canvas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearCanvas(value: () => Unit): Self = StObject.set(x, "clearCanvas", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCanvas(value: String => js.Any): Self = StObject.set(x, "getCanvas", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideCanvas(value: () => Unit): Self = StObject.set(x, "hideCanvas", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderText(value: (Double, Double, String, String, Double) => Unit): Self = StObject.set(x, "renderText", js.Any.fromFunction5(value))
    
    @scala.inline
    def setRenderTextAt(value: (String, String, Double, Double, String, String, Double) => Unit): Self = StObject.set(x, "renderTextAt", js.Any.fromFunction7(value))
    
    @scala.inline
    def setShowCanvas(value: () => Unit): Self = StObject.set(x, "showCanvas", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleCanvas(value: () => Unit): Self = StObject.set(x, "toggleCanvas", js.Any.fromFunction0(value))
  }
}
