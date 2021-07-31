package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canvas extends StObject {
  
  def clearCanvas(): Unit
  
  def getCanvas(context: String): js.Any
  
  def hideCanvas(): Unit
  
  def renderText(x: Double, y: Double, text: String, css: String, w: Double): Unit
  
  def renderTextAt(valign: String, align: String, x: Double, y: Double, t: String, c: String, w: Double): Unit
  
  def showCanvas(): Unit
  
  def toggleCanvas(): Unit
}
object Canvas {
  
  @JSImport("webix", "Canvas")
  @js.native
  val ^ : Canvas = js.native
  
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
