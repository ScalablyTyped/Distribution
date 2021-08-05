package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returns high-level concepts in the content. For example, a research paper about deep learning might return the concept, "Artificial Intelligence" although the term is not mentioned. Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Spanish. */
trait ConceptsOptions extends StObject {
  
  /** Maximum number of concepts to return. */
  var limit: js.UndefOr[Double] = js.undefined
}
object ConceptsOptions {
  
  inline def apply(): ConceptsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConceptsOptions]
  }
  
  extension [Self <: ConceptsOptions](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
