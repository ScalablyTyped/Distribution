package typings.winrt.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanguage extends StObject {
  
  var displayName: String
  
  var languageTag: String
  
  var nativeName: String
  
  var script: String
}
object ILanguage {
  
  @scala.inline
  def apply(displayName: String, languageTag: String, nativeName: String, script: String): ILanguage = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], languageTag = languageTag.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguage]
  }
  
  @scala.inline
  implicit class ILanguageMutableBuilder[Self <: ILanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageTag(value: String): Self = StObject.set(x, "languageTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeName(value: String): Self = StObject.set(x, "nativeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
