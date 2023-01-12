package typings.watsonDeveloperCloud.languageTranslatorV3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IdentifiableLanguages. */
trait IdentifiableLanguages extends StObject {
  
  /** A list of all languages that the service can identify. */
  var languages: js.Array[IdentifiableLanguage]
}
object IdentifiableLanguages {
  
  inline def apply(languages: js.Array[IdentifiableLanguage]): IdentifiableLanguages = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifiableLanguages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentifiableLanguages] (val x: Self) extends AnyVal {
    
    inline def setLanguages(value: js.Array[IdentifiableLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesVarargs(value: IdentifiableLanguage*): Self = StObject.set(x, "languages", js.Array(value*))
  }
}
