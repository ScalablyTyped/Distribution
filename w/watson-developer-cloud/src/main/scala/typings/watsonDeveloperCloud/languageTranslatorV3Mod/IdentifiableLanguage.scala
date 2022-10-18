package typings.watsonDeveloperCloud.languageTranslatorV3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IdentifiableLanguage. */
trait IdentifiableLanguage extends StObject {
  
  /** The language code for an identifiable language. */
  var language: String
  
  /** The name of the identifiable language. */
  var name: String
}
object IdentifiableLanguage {
  
  inline def apply(language: String, name: String): IdentifiableLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifiableLanguage]
  }
  
  extension [Self <: IdentifiableLanguage](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
