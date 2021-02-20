package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Metadata of a query result. */
@js.native
trait QueryResultMetadata extends StObject {
  
  /** The confidence score for the given result. Calculated based on how relevant the result is estimated to be. confidence can range from `0.0` to `1.0`. The higher the number, the more relevant the document. The `confidence` value for a result was calculated using the model specified in the `document_retrieval_strategy` field of the result set. */
  var confidence: js.UndefOr[Double] = js.native
  
  /** An unbounded measure of the relevance of a particular result, dependent on the query and matching document. A higher score indicates a greater match to the query parameters. */
  var score: Double = js.native
}
object QueryResultMetadata {
  
  @scala.inline
  def apply(score: Double): QueryResultMetadata = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultMetadata]
  }
  
  @scala.inline
  implicit class QueryResultMetadataMutableBuilder[Self <: QueryResultMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
