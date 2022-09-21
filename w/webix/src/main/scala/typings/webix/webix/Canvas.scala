package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canvas extends StObject {
  
  def clearCanvas(): Unit
  
  def getCanvas(context: String): Any
  
  def hideCanvas(): Unit
  
  def renderText(x: Double, y: Double, text: String, css: String, w: Double): Unit
  
  def renderTextAt(valign: String, align: String, x: Double, y: Double, t: String, c: String, w: Double): Unit
  
  def showCanvas(): Unit
  
  def toggleCanvas(): Unit
}
object Canvas {
  
  inline def apply(
    clearCanvas: () => Unit,
    getCanvas: String => Any,
    hideCanvas: () => Unit,
    renderText: (Double, Double, String, String, Double) => Unit,
    renderTextAt: (String, String, Double, Double, String, String, Double) => Unit,
    showCanvas: () => Unit,
    toggleCanvas: () => Unit
  ): Canvas = {
    val __obj = js.Dynamic.literal(clearCanvas = js.Any.fromFunction0(clearCanvas), getCanvas = js.Any.fromFunction1(getCanvas), hideCanvas = js.Any.fromFunction0(hideCanvas), renderText = js.Any.fromFunction5(renderText), renderTextAt = js.Any.fromFunction7(renderTextAt), showCanvas = js.Any.fromFunction0(showCanvas), toggleCanvas = js.Any.fromFunction0(toggleCanvas))
    __obj.asInstanceOf[Canvas]
  }
  
  extension [Self <: Canvas](x: Self) {
    
    inline def setClearCanvas(value: () => Unit): Self = StObject.set(x, "clearCanvas", js.Any.fromFunction0(value))
    
    inline def setGetCanvas(value: String => Any): Self = StObject.set(x, "getCanvas", js.Any.fromFunction1(value))
    
    inline def setHideCanvas(value: () => Unit): Self = StObject.set(x, "hideCanvas", js.Any.fromFunction0(value))
    
    inline def setRenderText(value: (Double, Double, String, String, Double) => Unit): Self = StObject.set(x, "renderText", js.Any.fromFunction5(value))
    
    inline def setRenderTextAt(value: (String, String, Double, Double, String, String, Double) => Unit): Self = StObject.set(x, "renderTextAt", js.Any.fromFunction7(value))
    
    inline def setShowCanvas(value: () => Unit): Self = StObject.set(x, "showCanvas", js.Any.fromFunction0(value))
    
    inline def setToggleCanvas(value: () => Unit): Self = StObject.set(x, "toggleCanvas", js.Any.fromFunction0(value))
  }
}
