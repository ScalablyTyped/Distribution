package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TrainingDataSet. */
@js.native
trait TrainingDataSet extends StObject {
  
  /** The collection id associated with this training data set. */
  var collection_id: js.UndefOr[String] = js.native
  
  /** The environment id associated with this training data set. */
  var environment_id: js.UndefOr[String] = js.native
  
  /** Array of training queries. */
  var queries: js.UndefOr[js.Array[TrainingQuery]] = js.native
}
object TrainingDataSet {
  
  @scala.inline
  def apply(): TrainingDataSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingDataSet]
  }
  
  @scala.inline
  implicit class TrainingDataSetMutableBuilder[Self <: TrainingDataSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection_idUndefined: Self = StObject.set(x, "collection_id", js.undefined)
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment_idUndefined: Self = StObject.set(x, "environment_id", js.undefined)
    
    @scala.inline
    def setQueries(value: js.Array[TrainingQuery]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    @scala.inline
    def setQueriesVarargs(value: TrainingQuery*): Self = StObject.set(x, "queries", js.Array(value :_*))
  }
}
