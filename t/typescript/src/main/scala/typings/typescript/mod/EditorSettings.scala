package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorSettings extends StObject {
  
  var baseIndentSize: js.UndefOr[Double] = js.undefined
  
  var convertTabsToSpaces: js.UndefOr[Boolean] = js.undefined
  
  var indentSize: js.UndefOr[Double] = js.undefined
  
  var indentStyle: js.UndefOr[IndentStyle] = js.undefined
  
  var newLineCharacter: js.UndefOr[java.lang.String] = js.undefined
  
  var tabSize: js.UndefOr[Double] = js.undefined
  
  var trimTrailingWhitespace: js.UndefOr[Boolean] = js.undefined
}
object EditorSettings {
  
  @scala.inline
  def apply(): EditorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorSettings]
  }
  
  @scala.inline
  implicit class EditorSettingsMutableBuilder[Self <: EditorSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseIndentSize(value: Double): Self = StObject.set(x, "baseIndentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseIndentSizeUndefined: Self = StObject.set(x, "baseIndentSize", js.undefined)
    
    @scala.inline
    def setConvertTabsToSpaces(value: Boolean): Self = StObject.set(x, "convertTabsToSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertTabsToSpacesUndefined: Self = StObject.set(x, "convertTabsToSpaces", js.undefined)
    
    @scala.inline
    def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentSizeUndefined: Self = StObject.set(x, "indentSize", js.undefined)
    
    @scala.inline
    def setIndentStyle(value: IndentStyle): Self = StObject.set(x, "indentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentStyleUndefined: Self = StObject.set(x, "indentStyle", js.undefined)
    
    @scala.inline
    def setNewLineCharacter(value: java.lang.String): Self = StObject.set(x, "newLineCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineCharacterUndefined: Self = StObject.set(x, "newLineCharacter", js.undefined)
    
    @scala.inline
    def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
    
    @scala.inline
    def setTrimTrailingWhitespace(value: Boolean): Self = StObject.set(x, "trimTrailingWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimTrailingWhitespaceUndefined: Self = StObject.set(x, "trimTrailingWhitespace", js.undefined)
  }
}
