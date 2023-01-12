package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuickPickItemButtonEvent[T /* <: QuickPickItem */] extends StObject {
  
  /**
    * The button that was clicked.
    */
  val button: QuickInputButton
  
  /**
    * The item that the button belongs to.
    */
  val item: T
}
object QuickPickItemButtonEvent {
  
  inline def apply[T /* <: QuickPickItem */](button: QuickInputButton, item: T): QuickPickItemButtonEvent[T] = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickPickItemButtonEvent[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuickPickItemButtonEvent[?], T /* <: QuickPickItem */] (val x: Self & QuickPickItemButtonEvent[T]) extends AnyVal {
    
    inline def setButton(value: QuickInputButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
