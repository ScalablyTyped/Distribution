package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorOptions extends StObject {
  
  var ConvertTabsToSpaces: Boolean
  
  var IndentSize: Double
  
  var NewLineCharacter: String
  
  var TabSize: Double
}
object EditorOptions {
  
  @scala.inline
  def apply(ConvertTabsToSpaces: Boolean, IndentSize: Double, NewLineCharacter: String, TabSize: Double): EditorOptions = {
    val __obj = js.Dynamic.literal(ConvertTabsToSpaces = ConvertTabsToSpaces.asInstanceOf[js.Any], IndentSize = IndentSize.asInstanceOf[js.Any], NewLineCharacter = NewLineCharacter.asInstanceOf[js.Any], TabSize = TabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions]
  }
  
  @scala.inline
  implicit class EditorOptionsMutableBuilder[Self <: EditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvertTabsToSpaces(value: Boolean): Self = StObject.set(x, "ConvertTabsToSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentSize(value: Double): Self = StObject.set(x, "IndentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineCharacter(value: String): Self = StObject.set(x, "NewLineCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSize(value: Double): Self = StObject.set(x, "TabSize", value.asInstanceOf[js.Any])
  }
}
