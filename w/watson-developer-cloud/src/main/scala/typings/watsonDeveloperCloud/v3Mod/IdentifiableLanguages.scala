package typings.watsonDeveloperCloud.v3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IdentifiableLanguages. */
@js.native
trait IdentifiableLanguages extends StObject {
  
  /** A list of all languages that the service can identify. */
  var languages: js.Array[IdentifiableLanguage] = js.native
}
object IdentifiableLanguages {
  
  @scala.inline
  def apply(languages: js.Array[IdentifiableLanguage]): IdentifiableLanguages = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifiableLanguages]
  }
  
  @scala.inline
  implicit class IdentifiableLanguagesMutableBuilder[Self <: IdentifiableLanguages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguages(value: js.Array[IdentifiableLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesVarargs(value: IdentifiableLanguage*): Self = StObject.set(x, "languages", js.Array(value :_*))
  }
}
