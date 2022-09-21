package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceFolderPickOptions extends StObject {
  
  /**
    * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
    * This setting is ignored on iPad and is always false.
    */
  var ignoreFocusOut: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional string to show as placeholder in the input box to guide the user what to pick on.
    */
  var placeHolder: js.UndefOr[String] = js.undefined
}
object WorkspaceFolderPickOptions {
  
  inline def apply(): WorkspaceFolderPickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFolderPickOptions]
  }
  
  extension [Self <: WorkspaceFolderPickOptions](x: Self) {
    
    inline def setIgnoreFocusOut(value: Boolean): Self = StObject.set(x, "ignoreFocusOut", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFocusOutUndefined: Self = StObject.set(x, "ignoreFocusOut", js.undefined)
    
    inline def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    inline def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
  }
}
