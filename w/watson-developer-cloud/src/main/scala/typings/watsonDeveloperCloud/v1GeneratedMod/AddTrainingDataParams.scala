package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `addTrainingData` operation. */
@js.native
trait AddTrainingDataParams extends StObject {
  
  /** The ID of the collection. */
  var collection_id: String = js.native
  
  /** The ID of the environment. */
  var environment_id: String = js.native
  
  /** Array of training examples. */
  var examples: js.UndefOr[js.Array[TrainingExample]] = js.native
  
  /** The filter used on the collection before the **natural_language_query** is applied. */
  var filter: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** The natural text query for the new training query. */
  var natural_language_query: js.UndefOr[String] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object AddTrainingDataParams {
  
  @scala.inline
  def apply(collection_id: String, environment_id: String): AddTrainingDataParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTrainingDataParams]
  }
  
  @scala.inline
  implicit class AddTrainingDataParamsMutableBuilder[Self <: AddTrainingDataParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExamples(value: js.Array[TrainingExample]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    @scala.inline
    def setExamplesVarargs(value: TrainingExample*): Self = StObject.set(x, "examples", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setNatural_language_query(value: String): Self = StObject.set(x, "natural_language_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatural_language_queryUndefined: Self = StObject.set(x, "natural_language_query", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
