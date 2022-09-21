package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEditorOptions extends StObject {
  
  /**
    * The rendering style of the cursor in this editor.
    * When getting a text editor's options, this property will always be present.
    * When setting a text editor's options, this property is optional.
    */
  var cursorStyle: js.UndefOr[TextEditorCursorStyle] = js.undefined
  
  /**
    * When pressing Tab insert {@link TextEditorOptions.tabSize n} spaces.
    * When getting a text editor's options, this property will always be a boolean (resolved).
    * When setting a text editor's options, this property is optional and it can be a boolean or `"auto"`.
    */
  var insertSpaces: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * Render relative line numbers w.r.t. the current line number.
    * When getting a text editor's options, this property will always be present.
    * When setting a text editor's options, this property is optional.
    */
  var lineNumbers: js.UndefOr[TextEditorLineNumbersStyle] = js.undefined
  
  /**
    * The size in spaces a tab takes. This is used for two purposes:
    *  - the rendering width of a tab character;
    *  - the number of spaces to insert when {@link TextEditorOptions.insertSpaces insertSpaces} is true.
    *
    * When getting a text editor's options, this property will always be a number (resolved).
    * When setting a text editor's options, this property is optional and it can be a number or `"auto"`.
    */
  var tabSize: js.UndefOr[Double | String] = js.undefined
}
object TextEditorOptions {
  
  inline def apply(): TextEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEditorOptions]
  }
  
  extension [Self <: TextEditorOptions](x: Self) {
    
    inline def setCursorStyle(value: TextEditorCursorStyle): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
    
    inline def setCursorStyleUndefined: Self = StObject.set(x, "cursorStyle", js.undefined)
    
    inline def setInsertSpaces(value: Boolean | String): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
    
    inline def setInsertSpacesUndefined: Self = StObject.set(x, "insertSpaces", js.undefined)
    
    inline def setLineNumbers(value: TextEditorLineNumbersStyle): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
    
    inline def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
    
    inline def setTabSize(value: Double | String): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
  }
}
