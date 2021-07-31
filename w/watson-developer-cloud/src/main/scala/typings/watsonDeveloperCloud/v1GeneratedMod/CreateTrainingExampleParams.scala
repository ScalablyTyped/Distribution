package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createTrainingExample` operation. */
trait CreateTrainingExampleParams extends StObject {
  
  /** The ID of the collection. */
  var collection_id: String
  
  /** The cross reference associated with this training example. */
  var cross_reference: js.UndefOr[String] = js.undefined
  
  /** The document ID associated with this training example. */
  var document_id: js.UndefOr[String] = js.undefined
  
  /** The ID of the environment. */
  var environment_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The ID of the query used for training. */
  var query_id: String
  
  /** The relevance of the training example. */
  var relevance: js.UndefOr[Double] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object CreateTrainingExampleParams {
  
  @scala.inline
  def apply(collection_id: String, environment_id: String, query_id: String): CreateTrainingExampleParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], query_id = query_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrainingExampleParams]
  }
  
  @scala.inline
  implicit class CreateTrainingExampleParamsMutableBuilder[Self <: CreateTrainingExampleParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCross_reference(value: String): Self = StObject.set(x, "cross_reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCross_referenceUndefined: Self = StObject.set(x, "cross_reference", js.undefined)
    
    @scala.inline
    def setDocument_id(value: String): Self = StObject.set(x, "document_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument_idUndefined: Self = StObject.set(x, "document_id", js.undefined)
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setQuery_id(value: String): Self = StObject.set(x, "query_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
