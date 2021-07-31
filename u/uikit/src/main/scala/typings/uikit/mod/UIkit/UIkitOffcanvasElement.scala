package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitOffcanvasElement extends StObject {
  
  def hide(): Unit
  
  def show(): Unit
}
object UIkitOffcanvasElement {
  
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): UIkitOffcanvasElement = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[UIkitOffcanvasElement]
  }
  
  @scala.inline
  implicit class UIkitOffcanvasElementMutableBuilder[Self <: UIkitOffcanvasElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
