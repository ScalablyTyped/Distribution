package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorOptions extends StObject {
  
  var BaseIndentSize: js.UndefOr[Double] = js.undefined
  
  var ConvertTabsToSpaces: Boolean
  
  var IndentSize: Double
  
  var IndentStyle: typings.typescript.mod.IndentStyle
  
  var NewLineCharacter: java.lang.String
  
  var TabSize: Double
}
object EditorOptions {
  
  @scala.inline
  def apply(
    ConvertTabsToSpaces: Boolean,
    IndentSize: Double,
    IndentStyle: IndentStyle,
    NewLineCharacter: java.lang.String,
    TabSize: Double
  ): EditorOptions = {
    val __obj = js.Dynamic.literal(ConvertTabsToSpaces = ConvertTabsToSpaces.asInstanceOf[js.Any], IndentSize = IndentSize.asInstanceOf[js.Any], IndentStyle = IndentStyle.asInstanceOf[js.Any], NewLineCharacter = NewLineCharacter.asInstanceOf[js.Any], TabSize = TabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions]
  }
  
  @scala.inline
  implicit class EditorOptionsMutableBuilder[Self <: EditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseIndentSize(value: Double): Self = StObject.set(x, "BaseIndentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseIndentSizeUndefined: Self = StObject.set(x, "BaseIndentSize", js.undefined)
    
    @scala.inline
    def setConvertTabsToSpaces(value: Boolean): Self = StObject.set(x, "ConvertTabsToSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentSize(value: Double): Self = StObject.set(x, "IndentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentStyle(value: IndentStyle): Self = StObject.set(x, "IndentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineCharacter(value: java.lang.String): Self = StObject.set(x, "NewLineCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSize(value: Double): Self = StObject.set(x, "TabSize", value.asInstanceOf[js.Any])
  }
}
