package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitLightboxPanelElement extends StObject {
  
  def hide(): Unit = js.native
  
  def show(index: Double): Unit = js.native
  
  def startAutoplay(): Unit = js.native
  
  def stopAutoplay(): Unit = js.native
}
object UIkitLightboxPanelElement {
  
  @scala.inline
  def apply(hide: () => Unit, show: Double => Unit, startAutoplay: () => Unit, stopAutoplay: () => Unit): UIkitLightboxPanelElement = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show), startAutoplay = js.Any.fromFunction0(startAutoplay), stopAutoplay = js.Any.fromFunction0(stopAutoplay))
    __obj.asInstanceOf[UIkitLightboxPanelElement]
  }
  
  @scala.inline
  implicit class UIkitLightboxPanelElementMutableBuilder[Self <: UIkitLightboxPanelElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: Double => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartAutoplay(value: () => Unit): Self = StObject.set(x, "startAutoplay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopAutoplay(value: () => Unit): Self = StObject.set(x, "stopAutoplay", js.Any.fromFunction0(value))
  }
}
