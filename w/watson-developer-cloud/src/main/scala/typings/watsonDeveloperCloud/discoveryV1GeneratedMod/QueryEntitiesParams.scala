package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `queryEntities` operation. */
trait QueryEntitiesParams extends StObject {
  
  /** The ID of the collection. */
  var collection_id: String
  
  /** Entity text to provide context for the queried entity and rank based on that association. For example, if you wanted to query the city of London in England your query would look for `London` with the context of `England`. */
  var context: js.UndefOr[QueryEntitiesContext] = js.undefined
  
  /** The number of results to return. The default is `10`. The maximum is `1000`. */
  var count: js.UndefOr[Double] = js.undefined
  
  /** A text string that appears within the entity text field. */
  var entity: js.UndefOr[QueryEntitiesEntity] = js.undefined
  
  /** The ID of the environment. */
  var environment_id: String
  
  /** The number of evidence items to return for each result. The default is `0`. The maximum number of evidence items per query is 10,000. */
  var evidence_count: js.UndefOr[Double] = js.undefined
  
  /** The entity query feature to perform. Supported features are `disambiguate` and `similar_entities`. */
  var feature: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object QueryEntitiesParams {
  
  inline def apply(collection_id: String, environment_id: String): QueryEntitiesParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryEntitiesParams]
  }
  
  extension [Self <: QueryEntitiesParams](x: Self) {
    
    inline def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    inline def setContext(value: QueryEntitiesContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setEntity(value: QueryEntitiesEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    inline def setEvidence_count(value: Double): Self = StObject.set(x, "evidence_count", value.asInstanceOf[js.Any])
    
    inline def setEvidence_countUndefined: Self = StObject.set(x, "evidence_count", js.undefined)
    
    inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
