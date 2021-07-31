package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowState extends StObject {
  
  /**
    * Whether the current window is focused.
    */
  val focused: Boolean
}
object WindowState {
  
  @scala.inline
  def apply(focused: Boolean): WindowState = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowState]
  }
  
  @scala.inline
  implicit class WindowStateMutableBuilder[Self <: WindowState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
  }
}
