package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TrainingQuery. */
@js.native
trait TrainingQuery extends js.Object {
  
  /** Array of training examples. */
  var examples: js.UndefOr[js.Array[TrainingExample]] = js.native
  
  /** The filter used on the collection before the **natural_language_query** is applied. */
  var filter: js.UndefOr[String] = js.native
  
  /** The natural text query for the training query. */
  var natural_language_query: js.UndefOr[String] = js.native
  
  /** The query ID associated with the training query. */
  var query_id: js.UndefOr[String] = js.native
}
object TrainingQuery {
  
  @scala.inline
  def apply(): TrainingQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingQuery]
  }
  
  @scala.inline
  implicit class TrainingQueryOps[Self <: TrainingQuery] (val x: Self) extends AnyVal {
    
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
    def setNatural_language_query(value: String): Self = this.set("natural_language_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatural_language_query: Self = this.set("natural_language_query", js.undefined)
    
    @scala.inline
    def setQuery_id(value: String): Self = this.set("query_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery_id: Self = this.set("query_id", js.undefined)
  }
}
