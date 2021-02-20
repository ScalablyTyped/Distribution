package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceFolderPickOptions extends StObject {
  
  /**
    * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
    */
  var ignoreFocusOut: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional string to show as placeholder in the input box to guide the user what to pick on.
    */
  var placeHolder: js.UndefOr[String] = js.native
}
object WorkspaceFolderPickOptions {
  
  @scala.inline
  def apply(): WorkspaceFolderPickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFolderPickOptions]
  }
  
  @scala.inline
  implicit class WorkspaceFolderPickOptionsMutableBuilder[Self <: WorkspaceFolderPickOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreFocusOut(value: Boolean): Self = StObject.set(x, "ignoreFocusOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreFocusOutUndefined: Self = StObject.set(x, "ignoreFocusOut", js.undefined)
    
    @scala.inline
    def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
  }
}
