package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEditorOptions extends StObject {
  
  /**
    * The rendering style of the cursor in this editor.
    * When getting a text editor's options, this property will always be present.
    * When setting a text editor's options, this property is optional.
    */
  var cursorStyle: js.UndefOr[TextEditorCursorStyle] = js.native
  
  /**
    * When pressing Tab insert [n](#TextEditorOptions.tabSize) spaces.
    * When getting a text editor's options, this property will always be a boolean (resolved).
    * When setting a text editor's options, this property is optional and it can be a boolean or `"auto"`.
    */
  var insertSpaces: js.UndefOr[Boolean | String] = js.native
  
  /**
    * Render relative line numbers w.r.t. the current line number.
    * When getting a text editor's options, this property will always be present.
    * When setting a text editor's options, this property is optional.
    */
  var lineNumbers: js.UndefOr[TextEditorLineNumbersStyle] = js.native
  
  /**
    * The size in spaces a tab takes. This is used for two purposes:
    *  - the rendering width of a tab character;
    *  - the number of spaces to insert when [insertSpaces](#TextEditorOptions.insertSpaces) is true.
    *
    * When getting a text editor's options, this property will always be a number (resolved).
    * When setting a text editor's options, this property is optional and it can be a number or `"auto"`.
    */
  var tabSize: js.UndefOr[Double | String] = js.native
}
object TextEditorOptions {
  
  @scala.inline
  def apply(): TextEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEditorOptions]
  }
  
  @scala.inline
  implicit class TextEditorOptionsMutableBuilder[Self <: TextEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursorStyle(value: TextEditorCursorStyle): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorStyleUndefined: Self = StObject.set(x, "cursorStyle", js.undefined)
    
    @scala.inline
    def setInsertSpaces(value: Boolean | String): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpacesUndefined: Self = StObject.set(x, "insertSpaces", js.undefined)
    
    @scala.inline
    def setLineNumbers(value: TextEditorLineNumbersStyle): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
    
    @scala.inline
    def setTabSize(value: Double | String): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
  }
}
