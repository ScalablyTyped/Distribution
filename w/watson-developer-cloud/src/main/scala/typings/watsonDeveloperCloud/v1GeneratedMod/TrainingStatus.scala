package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TrainingStatus. */
@js.native
trait TrainingStatus extends StObject {
  
  /** When `true`, the collection has been successfully trained. */
  var available: js.UndefOr[Boolean] = js.native
  
  /** The timestamp of when the data was uploaded. */
  var data_updated: js.UndefOr[String] = js.native
  
  /** When `true`, the collection has a sufficent amount of examples added for training to occur. */
  var minimum_examples_added: js.UndefOr[Boolean] = js.native
  
  /** When `true`, the collection has a sufficent amount of queries added for training to occur. */
  var minimum_queries_added: js.UndefOr[Boolean] = js.native
  
  /** The number of notices associated with this data set. */
  var notices: js.UndefOr[Double] = js.native
  
  /** When `true`, the collection is currently processing training. */
  var processing: js.UndefOr[Boolean] = js.native
  
  /** The timestamp of when the collection was successfully trained. */
  var successfully_trained: js.UndefOr[String] = js.native
  
  /** When `true`, the collection has a sufficent amount of diversity in labeled results for training to occur. */
  var sufficient_label_diversity: js.UndefOr[Boolean] = js.native
  
  /** The total number of training examples uploaded to this collection. */
  var total_examples: js.UndefOr[Double] = js.native
}
object TrainingStatus {
  
  @scala.inline
  def apply(): TrainingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingStatus]
  }
  
  @scala.inline
  implicit class TrainingStatusMutableBuilder[Self <: TrainingStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    @scala.inline
    def setData_updated(value: String): Self = StObject.set(x, "data_updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_updatedUndefined: Self = StObject.set(x, "data_updated", js.undefined)
    
    @scala.inline
    def setMinimum_examples_added(value: Boolean): Self = StObject.set(x, "minimum_examples_added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum_examples_addedUndefined: Self = StObject.set(x, "minimum_examples_added", js.undefined)
    
    @scala.inline
    def setMinimum_queries_added(value: Boolean): Self = StObject.set(x, "minimum_queries_added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum_queries_addedUndefined: Self = StObject.set(x, "minimum_queries_added", js.undefined)
    
    @scala.inline
    def setNotices(value: Double): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoticesUndefined: Self = StObject.set(x, "notices", js.undefined)
    
    @scala.inline
    def setProcessing(value: Boolean): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingUndefined: Self = StObject.set(x, "processing", js.undefined)
    
    @scala.inline
    def setSuccessfully_trained(value: String): Self = StObject.set(x, "successfully_trained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfully_trainedUndefined: Self = StObject.set(x, "successfully_trained", js.undefined)
    
    @scala.inline
    def setSufficient_label_diversity(value: Boolean): Self = StObject.set(x, "sufficient_label_diversity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSufficient_label_diversityUndefined: Self = StObject.set(x, "sufficient_label_diversity", js.undefined)
    
    @scala.inline
    def setTotal_examples(value: Double): Self = StObject.set(x, "total_examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_examplesUndefined: Self = StObject.set(x, "total_examples", js.undefined)
  }
}
