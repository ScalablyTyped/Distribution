package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeysNavigation extends StObject {
  
  def moveSelection(direction: String): Unit = js.native
}
object KeysNavigation {
  
  @scala.inline
  def apply(moveSelection: String => Unit): KeysNavigation = {
    val __obj = js.Dynamic.literal(moveSelection = js.Any.fromFunction1(moveSelection))
    __obj.asInstanceOf[KeysNavigation]
  }
  
  @scala.inline
  implicit class KeysNavigationMutableBuilder[Self <: KeysNavigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMoveSelection(value: String => Unit): Self = StObject.set(x, "moveSelection", js.Any.fromFunction1(value))
  }
}
