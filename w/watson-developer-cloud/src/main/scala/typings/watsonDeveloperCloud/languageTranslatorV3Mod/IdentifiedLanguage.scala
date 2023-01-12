package typings.watsonDeveloperCloud.languageTranslatorV3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IdentifiedLanguage. */
trait IdentifiedLanguage extends StObject {
  
  /** The confidence score for the identified language. */
  var confidence: Double
  
  /** The language code for an identified language. */
  var language: String
}
object IdentifiedLanguage {
  
  inline def apply(confidence: Double, language: String): IdentifiedLanguage = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifiedLanguage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentifiedLanguage] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}
