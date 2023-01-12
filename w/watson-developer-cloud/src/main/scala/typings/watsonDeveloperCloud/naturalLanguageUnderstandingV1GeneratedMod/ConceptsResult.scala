package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The general concepts referenced or alluded to in the analyzed text. */
trait ConceptsResult extends StObject {
  
  /** Link to the corresponding DBpedia resource. */
  var dbpedia_resource: js.UndefOr[String] = js.undefined
  
  /** Relevance score between 0 and 1. Higher scores indicate greater relevance. */
  var relevance: js.UndefOr[Double] = js.undefined
  
  /** Name of the concept. */
  var text: js.UndefOr[String] = js.undefined
}
object ConceptsResult {
  
  inline def apply(): ConceptsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConceptsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConceptsResult] (val x: Self) extends AnyVal {
    
    inline def setDbpedia_resource(value: String): Self = StObject.set(x, "dbpedia_resource", value.asInstanceOf[js.Any])
    
    inline def setDbpedia_resourceUndefined: Self = StObject.set(x, "dbpedia_resource", js.undefined)
    
    inline def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    inline def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
