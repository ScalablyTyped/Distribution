package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeysNavigation extends StObject {
  
  def moveSelection(direction: String): Unit
}
object KeysNavigation {
  
  @JSImport("webix", "KeysNavigation")
  @js.native
  val ^ : KeysNavigation = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeysNavigation] (val x: Self) extends AnyVal {
    
    inline def setMoveSelection(value: String => Unit): Self = StObject.set(x, "moveSelection", js.Any.fromFunction1(value))
  }
}
