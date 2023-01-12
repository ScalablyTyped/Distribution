package typings.typescriptServices.TypeScript

import typings.typescriptServices.anon.AllowAutomaticSemicolonInsertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseOptions extends StObject {
  
  /* private */ var _allowAutomaticSemicolonInsertion: Any
  
  /* private */ var _languageVersion: Any
  
  def allowAutomaticSemicolonInsertion(): Boolean
  
  def languageVersion(): LanguageVersion
  
  def toJSON(key: Any): AllowAutomaticSemicolonInsertion
}
object ParseOptions {
  
  inline def apply(
    _allowAutomaticSemicolonInsertion: Any,
    _languageVersion: Any,
    allowAutomaticSemicolonInsertion: () => Boolean,
    languageVersion: () => LanguageVersion,
    toJSON: Any => AllowAutomaticSemicolonInsertion
  ): ParseOptions = {
    val __obj = js.Dynamic.literal(_allowAutomaticSemicolonInsertion = _allowAutomaticSemicolonInsertion.asInstanceOf[js.Any], _languageVersion = _languageVersion.asInstanceOf[js.Any], allowAutomaticSemicolonInsertion = js.Any.fromFunction0(allowAutomaticSemicolonInsertion), languageVersion = js.Any.fromFunction0(languageVersion), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowAutomaticSemicolonInsertion(value: () => Boolean): Self = StObject.set(x, "allowAutomaticSemicolonInsertion", js.Any.fromFunction0(value))
    
    inline def setLanguageVersion(value: () => LanguageVersion): Self = StObject.set(x, "languageVersion", js.Any.fromFunction0(value))
    
    inline def setToJSON(value: Any => AllowAutomaticSemicolonInsertion): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    
    inline def set_allowAutomaticSemicolonInsertion(value: Any): Self = StObject.set(x, "_allowAutomaticSemicolonInsertion", value.asInstanceOf[js.Any])
    
    inline def set_languageVersion(value: Any): Self = StObject.set(x, "_languageVersion", value.asInstanceOf[js.Any])
  }
}
