package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceControlInputBox extends StObject {
  
  /**
    * A string to show as placeholder in the input box to guide the user.
    */
  var placeholder: String
  
  /**
    * Setter and getter for the contents of the input box.
    */
  var value: String
  
  /**
    * Controls whether the input box is visible (default is `true`).
    */
  var visible: Boolean
}
object SourceControlInputBox {
  
  @scala.inline
  def apply(placeholder: String, value: String, visible: Boolean): SourceControlInputBox = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControlInputBox]
  }
  
  @scala.inline
  implicit class SourceControlInputBoxMutableBuilder[Self <: SourceControlInputBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
