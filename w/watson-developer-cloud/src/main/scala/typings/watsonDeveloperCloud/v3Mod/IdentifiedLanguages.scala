package typings.watsonDeveloperCloud.v3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IdentifiedLanguages. */
trait IdentifiedLanguages extends StObject {
  
  /** A ranking of identified languages with confidence scores. */
  var languages: js.Array[IdentifiedLanguage]
}
object IdentifiedLanguages {
  
  @scala.inline
  def apply(languages: js.Array[IdentifiedLanguage]): IdentifiedLanguages = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifiedLanguages]
  }
  
  @scala.inline
  implicit class IdentifiedLanguagesMutableBuilder[Self <: IdentifiedLanguages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguages(value: js.Array[IdentifiedLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesVarargs(value: IdentifiedLanguage*): Self = StObject.set(x, "languages", js.Array(value :_*))
  }
}
