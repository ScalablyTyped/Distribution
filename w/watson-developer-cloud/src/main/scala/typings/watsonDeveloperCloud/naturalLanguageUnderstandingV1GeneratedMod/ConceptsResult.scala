package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The general concepts referenced or alluded to in the analyzed text. */
@js.native
trait ConceptsResult extends StObject {
  
  /** Link to the corresponding DBpedia resource. */
  var dbpedia_resource: js.UndefOr[String] = js.native
  
  /** Relevance score between 0 and 1. Higher scores indicate greater relevance. */
  var relevance: js.UndefOr[Double] = js.native
  
  /** Name of the concept. */
  var text: js.UndefOr[String] = js.native
}
object ConceptsResult {
  
  @scala.inline
  def apply(): ConceptsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConceptsResult]
  }
  
  @scala.inline
  implicit class ConceptsResultMutableBuilder[Self <: ConceptsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbpedia_resource(value: String): Self = StObject.set(x, "dbpedia_resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbpedia_resourceUndefined: Self = StObject.set(x, "dbpedia_resource", js.undefined)
    
    @scala.inline
    def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
