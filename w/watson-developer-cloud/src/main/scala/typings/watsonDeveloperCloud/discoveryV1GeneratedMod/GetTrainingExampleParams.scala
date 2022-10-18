package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getTrainingExample` operation. */
trait GetTrainingExampleParams extends StObject {
  
  /** The ID of the collection. */
  var collection_id: String
  
  /** The ID of the environment. */
  var environment_id: String
  
  /** The ID of the document as it is indexed. */
  var example_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The ID of the query used for training. */
  var query_id: String
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object GetTrainingExampleParams {
  
  inline def apply(collection_id: String, environment_id: String, example_id: String, query_id: String): GetTrainingExampleParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], example_id = example_id.asInstanceOf[js.Any], query_id = query_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrainingExampleParams]
  }
  
  extension [Self <: GetTrainingExampleParams](x: Self) {
    
    inline def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    inline def setExample_id(value: String): Self = StObject.set(x, "example_id", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setQuery_id(value: String): Self = StObject.set(x, "query_id", value.asInstanceOf[js.Any])
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
