package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TrainingDataSet. */
@js.native
trait TrainingDataSet extends js.Object {
  
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
  implicit class TrainingDataSetOps[Self <: TrainingDataSet] (val x: Self) extends AnyVal {
    
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
    def deleteCollection_id: Self = this.set("collection_id", js.undefined)
    
    @scala.inline
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment_id: Self = this.set("environment_id", js.undefined)
    
    @scala.inline
    def setQueriesVarargs(value: TrainingQuery*): Self = this.set("queries", js.Array(value :_*))
    
    @scala.inline
    def setQueries(value: js.Array[TrainingQuery]): Self = this.set("queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
  }
}
