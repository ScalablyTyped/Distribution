package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitSlidershowElement extends StObject {
  
  def show(index: Double): Unit = js.native
  
  def startAutoplay(): Unit = js.native
  
  def stopAutoplay(): Unit = js.native
}
object UIkitSlidershowElement {
  
  @scala.inline
  def apply(show: Double => Unit, startAutoplay: () => Unit, stopAutoplay: () => Unit): UIkitSlidershowElement = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction1(show), startAutoplay = js.Any.fromFunction0(startAutoplay), stopAutoplay = js.Any.fromFunction0(stopAutoplay))
    __obj.asInstanceOf[UIkitSlidershowElement]
  }
  
  @scala.inline
  implicit class UIkitSlidershowElementMutableBuilder[Self <: UIkitSlidershowElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow(value: Double => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartAutoplay(value: () => Unit): Self = StObject.set(x, "startAutoplay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopAutoplay(value: () => Unit): Self = StObject.set(x, "stopAutoplay", js.Any.fromFunction0(value))
  }
}
