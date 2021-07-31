package typings.typescriptServices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattingOptions extends StObject {
  
  var indentSpaces: Double
  
  var newLineCharacter: String
  
  var spacesPerTab: Double
  
  var useTabs: Boolean
}
object FormattingOptions {
  
  @scala.inline
  def apply(indentSpaces: Double, newLineCharacter: String, spacesPerTab: Double, useTabs: Boolean): FormattingOptions = {
    val __obj = js.Dynamic.literal(indentSpaces = indentSpaces.asInstanceOf[js.Any], newLineCharacter = newLineCharacter.asInstanceOf[js.Any], spacesPerTab = spacesPerTab.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattingOptions]
  }
  
  @scala.inline
  implicit class FormattingOptionsMutableBuilder[Self <: FormattingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndentSpaces(value: Double): Self = StObject.set(x, "indentSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineCharacter(value: String): Self = StObject.set(x, "newLineCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacesPerTab(value: Double): Self = StObject.set(x, "spacesPerTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
  }
}
