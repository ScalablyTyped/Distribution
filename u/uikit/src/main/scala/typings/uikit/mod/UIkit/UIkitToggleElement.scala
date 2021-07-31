package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitToggleElement extends StObject {
  
  def toggle(): Unit
}
object UIkitToggleElement {
  
  @scala.inline
  def apply(toggle: () => Unit): UIkitToggleElement = {
    val __obj = js.Dynamic.literal(toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[UIkitToggleElement]
  }
  
  @scala.inline
  implicit class UIkitToggleElementMutableBuilder[Self <: UIkitToggleElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
