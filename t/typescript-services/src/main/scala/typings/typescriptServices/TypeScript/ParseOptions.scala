package typings.typescriptServices.TypeScript

import typings.typescriptServices.anon.AllowAutomaticSemicolonInsertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseOptions extends StObject {
  
  /* private */ var _allowAutomaticSemicolonInsertion: js.Any
  
  /* private */ var _languageVersion: js.Any
  
  def allowAutomaticSemicolonInsertion(): Boolean
  
  def languageVersion(): LanguageVersion
  
  def toJSON(key: js.Any): AllowAutomaticSemicolonInsertion
}
object ParseOptions {
  
  inline def apply(
    _allowAutomaticSemicolonInsertion: js.Any,
    _languageVersion: js.Any,
    allowAutomaticSemicolonInsertion: () => Boolean,
    languageVersion: () => LanguageVersion,
    toJSON: js.Any => AllowAutomaticSemicolonInsertion
  ): ParseOptions = {
    val __obj = js.Dynamic.literal(_allowAutomaticSemicolonInsertion = _allowAutomaticSemicolonInsertion.asInstanceOf[js.Any], _languageVersion = _languageVersion.asInstanceOf[js.Any], allowAutomaticSemicolonInsertion = js.Any.fromFunction0(allowAutomaticSemicolonInsertion), languageVersion = js.Any.fromFunction0(languageVersion), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[ParseOptions]
  }
  
  extension [Self <: ParseOptions](x: Self) {
    
    inline def setAllowAutomaticSemicolonInsertion(value: () => Boolean): Self = StObject.set(x, "allowAutomaticSemicolonInsertion", js.Any.fromFunction0(value))
    
    inline def setLanguageVersion(value: () => LanguageVersion): Self = StObject.set(x, "languageVersion", js.Any.fromFunction0(value))
    
    inline def setToJSON(value: js.Any => AllowAutomaticSemicolonInsertion): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    
    inline def set_allowAutomaticSemicolonInsertion(value: js.Any): Self = StObject.set(x, "_allowAutomaticSemicolonInsertion", value.asInstanceOf[js.Any])
    
    inline def set_languageVersion(value: js.Any): Self = StObject.set(x, "_languageVersion", value.asInstanceOf[js.Any])
  }
}
