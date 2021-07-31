package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitLightboxElement extends StObject {
  
  def hide(): Unit
  
  def show(index: Double): Unit
}
object UIkitLightboxElement {
  
  @scala.inline
  def apply(hide: () => Unit, show: Double => Unit): UIkitLightboxElement = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[UIkitLightboxElement]
  }
  
  @scala.inline
  implicit class UIkitLightboxElementMutableBuilder[Self <: UIkitLightboxElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: Double => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
