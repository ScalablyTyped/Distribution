package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TrainingQuery. */
trait TrainingQuery extends StObject {
  
  /** Array of training examples. */
  var examples: js.UndefOr[js.Array[TrainingExample]] = js.undefined
  
  /** The filter used on the collection before the **natural_language_query** is applied. */
  var filter: js.UndefOr[String] = js.undefined
  
  /** The natural text query for the training query. */
  var natural_language_query: js.UndefOr[String] = js.undefined
  
  /** The query ID associated with the training query. */
  var query_id: js.UndefOr[String] = js.undefined
}
object TrainingQuery {
  
  inline def apply(): TrainingQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrainingQuery] (val x: Self) extends AnyVal {
    
    inline def setExamples(value: js.Array[TrainingExample]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setExamplesVarargs(value: TrainingExample*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setNatural_language_query(value: String): Self = StObject.set(x, "natural_language_query", value.asInstanceOf[js.Any])
    
    inline def setNatural_language_queryUndefined: Self = StObject.set(x, "natural_language_query", js.undefined)
    
    inline def setQuery_id(value: String): Self = StObject.set(x, "query_id", value.asInstanceOf[js.Any])
    
    inline def setQuery_idUndefined: Self = StObject.set(x, "query_id", js.undefined)
  }
}
