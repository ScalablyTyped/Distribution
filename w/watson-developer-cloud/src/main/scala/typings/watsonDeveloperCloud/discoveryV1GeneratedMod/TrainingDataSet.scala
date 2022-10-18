package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TrainingDataSet. */
trait TrainingDataSet extends StObject {
  
  /** The collection id associated with this training data set. */
  var collection_id: js.UndefOr[String] = js.undefined
  
  /** The environment id associated with this training data set. */
  var environment_id: js.UndefOr[String] = js.undefined
  
  /** Array of training queries. */
  var queries: js.UndefOr[js.Array[TrainingQuery]] = js.undefined
}
object TrainingDataSet {
  
  inline def apply(): TrainingDataSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingDataSet]
  }
  
  extension [Self <: TrainingDataSet](x: Self) {
    
    inline def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    inline def setCollection_idUndefined: Self = StObject.set(x, "collection_id", js.undefined)
    
    inline def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_idUndefined: Self = StObject.set(x, "environment_id", js.undefined)
    
    inline def setQueries(value: js.Array[TrainingQuery]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQueriesVarargs(value: TrainingQuery*): Self = StObject.set(x, "queries", js.Array(value*))
  }
}
