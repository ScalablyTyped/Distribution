package typings.watsonDeveloperCloud.v3Mod

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
  
  @scala.inline
  def apply(confidence: Double, language: String): IdentifiedLanguage = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifiedLanguage]
  }
  
  @scala.inline
  implicit class IdentifiedLanguageMutableBuilder[Self <: IdentifiedLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}
