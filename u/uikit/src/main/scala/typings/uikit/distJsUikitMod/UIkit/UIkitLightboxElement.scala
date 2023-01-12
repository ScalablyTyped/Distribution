package typings.uikit.distJsUikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitLightboxElement extends StObject {
  
  def hide(): Unit
  
  def show(index: Double): Unit
}
object UIkitLightboxElement {
  
  inline def apply(hide: () => Unit, show: Double => Unit): UIkitLightboxElement = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[UIkitLightboxElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UIkitLightboxElement] (val x: Self) extends AnyVal {
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setShow(value: Double => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
