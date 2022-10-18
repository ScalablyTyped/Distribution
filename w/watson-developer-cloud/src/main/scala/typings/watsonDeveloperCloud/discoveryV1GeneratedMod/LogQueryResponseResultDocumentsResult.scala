package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Each object in the **results** array corresponds to an individual document returned by the original query. */
trait LogQueryResponseResultDocumentsResult extends StObject {
  
  /** The **collection_id** of the document represented by this result. */
  var collection_id: js.UndefOr[String] = js.undefined
  
  /** The confidence score of the result's analysis. A higher score indicating greater confidence. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** The **document_id** of the document that this result represents. */
  var document_id: js.UndefOr[String] = js.undefined
  
  /** The result rank of this document. A position of `1` indicates that it was the first returned result. */
  var position: js.UndefOr[Double] = js.undefined
  
  /** The raw score of this result. A higher score indicates a greater match to the query parameters. */
  var score: js.UndefOr[Double] = js.undefined
}
object LogQueryResponseResultDocumentsResult {
  
  inline def apply(): LogQueryResponseResultDocumentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogQueryResponseResultDocumentsResult]
  }
  
  extension [Self <: LogQueryResponseResultDocumentsResult](x: Self) {
    
    inline def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    inline def setCollection_idUndefined: Self = StObject.set(x, "collection_id", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setDocument_id(value: String): Self = StObject.set(x, "document_id", value.asInstanceOf[js.Any])
    
    inline def setDocument_idUndefined: Self = StObject.set(x, "document_id", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
