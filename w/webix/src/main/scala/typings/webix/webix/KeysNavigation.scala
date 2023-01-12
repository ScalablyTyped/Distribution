package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeysNavigation extends StObject {
  
  def moveSelection(direction: String): Unit
}
object KeysNavigation {
  
  inline def apply(moveSelection: String => Unit): KeysNavigation = {
    val __obj = js.Dynamic.literal(moveSelection = js.Any.fromFunction1(moveSelection))
    __obj.asInstanceOf[KeysNavigation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeysNavigation] (val x: Self) extends AnyVal {
    
    inline def setMoveSelection(value: String => Unit): Self = StObject.set(x, "moveSelection", js.Any.fromFunction1(value))
  }
}
