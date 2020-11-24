package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `addTrainingData` operation. */
@js.native
trait AddTrainingDataParams extends js.Object {
  
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
  implicit class AddTrainingDataParamsOps[Self <: AddTrainingDataParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollection_id(value: String): Self = this.set("collection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExamplesVarargs(value: TrainingExample*): Self = this.set("examples", js.Array(value :_*))
    
    @scala.inline
    def setExamples(value: js.Array[TrainingExample]): Self = this.set("examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExamples: Self = this.set("examples", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setNatural_language_query(value: String): Self = this.set("natural_language_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatural_language_query: Self = this.set("natural_language_query", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
}
