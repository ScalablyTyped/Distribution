package typings.watsonDeveloperCloud.languageTranslatorV3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IdentifiedLanguages. */
trait IdentifiedLanguages extends StObject {
  
  /** A ranking of identified languages with confidence scores. */
  var languages: js.Array[IdentifiedLanguage]
}
object IdentifiedLanguages {
  
  inline def apply(languages: js.Array[IdentifiedLanguage]): IdentifiedLanguages = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifiedLanguages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentifiedLanguages] (val x: Self) extends AnyVal {
    
    inline def setLanguages(value: js.Array[IdentifiedLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesVarargs(value: IdentifiedLanguage*): Self = StObject.set(x, "languages", js.Array(value*))
  }
}
