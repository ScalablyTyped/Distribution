package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import typings.watsonDeveloperCloud.discoveryV1GeneratedMod.QueryRelationsConstants.Sort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `queryRelations` operation. */
trait QueryRelationsParams extends StObject {
  
  /** The ID of the collection. */
  var collection_id: String
  
  /** Entity text to provide context for the queried entity and rank based on that association. For example, if you wanted to query the city of London in England your query would look for `London` with the context of `England`. */
  var context: js.UndefOr[QueryEntitiesContext] = js.undefined
  
  /** The number of results to return. The default is `10`. The maximum is `1000`. */
  var count: js.UndefOr[Double] = js.undefined
  
  /** An array of entities to find relationships for. */
  var entities: js.UndefOr[js.Array[QueryRelationsEntity]] = js.undefined
  
  /** The ID of the environment. */
  var environment_id: String
  
  /** The number of evidence items to return for each result. The default is `0`. The maximum number of evidence items per query is 10,000. */
  var evidence_count: js.UndefOr[Double] = js.undefined
  
  var filter: js.UndefOr[QueryRelationsFilter] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The sorting method for the relationships, can be `score` or `frequency`. `frequency` is the number of unique times each entity is identified. The default is `score`. This parameter cannot be used in the same query as the **bias** parameter. */
  var sort: js.UndefOr[Sort | String] = js.undefined
}
object QueryRelationsParams {
  
  inline def apply(collection_id: String, environment_id: String): QueryRelationsParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRelationsParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryRelationsParams] (val x: Self) extends AnyVal {
    
    inline def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    inline def setContext(value: QueryEntitiesContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setEntities(value: js.Array[QueryRelationsEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: QueryRelationsEntity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    inline def setEvidence_count(value: Double): Self = StObject.set(x, "evidence_count", value.asInstanceOf[js.Any])
    
    inline def setEvidence_countUndefined: Self = StObject.set(x, "evidence_count", js.undefined)
    
    inline def setFilter(value: QueryRelationsFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setSort(value: Sort | String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
