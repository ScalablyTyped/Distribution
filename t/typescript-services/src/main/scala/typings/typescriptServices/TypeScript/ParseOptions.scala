package typings.typescriptServices.TypeScript

import typings.typescriptServices.anon.AllowAutomaticSemicolonInsertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseOptions extends StObject {
  
  var _allowAutomaticSemicolonInsertion: js.Any
  
  var _languageVersion: js.Any
  
  def allowAutomaticSemicolonInsertion(): Boolean
  
  def languageVersion(): LanguageVersion
  
  def toJSON(key: js.Any): AllowAutomaticSemicolonInsertion
}
object ParseOptions {
  
  @scala.inline
  def apply(
    _allowAutomaticSemicolonInsertion: js.Any,
    _languageVersion: js.Any,
    allowAutomaticSemicolonInsertion: () => Boolean,
    languageVersion: () => LanguageVersion,
    toJSON: js.Any => AllowAutomaticSemicolonInsertion
  ): ParseOptions = {
    val __obj = js.Dynamic.literal(_allowAutomaticSemicolonInsertion = _allowAutomaticSemicolonInsertion.asInstanceOf[js.Any], _languageVersion = _languageVersion.asInstanceOf[js.Any], allowAutomaticSemicolonInsertion = js.Any.fromFunction0(allowAutomaticSemicolonInsertion), languageVersion = js.Any.fromFunction0(languageVersion), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowAutomaticSemicolonInsertion(value: () => Boolean): Self = StObject.set(x, "allowAutomaticSemicolonInsertion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLanguageVersion(value: () => LanguageVersion): Self = StObject.set(x, "languageVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJSON(value: js.Any => AllowAutomaticSemicolonInsertion): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_allowAutomaticSemicolonInsertion(value: js.Any): Self = StObject.set(x, "_allowAutomaticSemicolonInsertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_languageVersion(value: js.Any): Self = StObject.set(x, "_languageVersion", value.asInstanceOf[js.Any])
  }
}
