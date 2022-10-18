package typings.uikit.distJsUikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitSlidershowElement extends StObject {
  
  def show(index: Double): Unit
  
  def startAutoplay(): Unit
  
  def stopAutoplay(): Unit
}
object UIkitSlidershowElement {
  
  inline def apply(show: Double => Unit, startAutoplay: () => Unit, stopAutoplay: () => Unit): UIkitSlidershowElement = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction1(show), startAutoplay = js.Any.fromFunction0(startAutoplay), stopAutoplay = js.Any.fromFunction0(stopAutoplay))
    __obj.asInstanceOf[UIkitSlidershowElement]
  }
  
  extension [Self <: UIkitSlidershowElement](x: Self) {
    
    inline def setShow(value: Double => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    inline def setStartAutoplay(value: () => Unit): Self = StObject.set(x, "startAutoplay", js.Any.fromFunction0(value))
    
    inline def setStopAutoplay(value: () => Unit): Self = StObject.set(x, "stopAutoplay", js.Any.fromFunction0(value))
  }
}
