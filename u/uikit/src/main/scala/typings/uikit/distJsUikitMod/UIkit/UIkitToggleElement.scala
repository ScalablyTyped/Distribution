package typings.uikit.distJsUikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitToggleElement extends StObject {
  
  def toggle(): Unit
}
object UIkitToggleElement {
  
  inline def apply(toggle: () => Unit): UIkitToggleElement = {
    val __obj = js.Dynamic.literal(toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[UIkitToggleElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UIkitToggleElement] (val x: Self) extends AnyVal {
    
    inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
