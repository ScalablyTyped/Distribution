package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The batch-request status. */
trait BatchStatus extends StObject {
  
  /** The method to be run against the documents. Possible values are `html_conversion`, `element_classification`, and `tables`. */
  var _function: js.UndefOr[String] = js.undefined
  
  /** The unique identifier for the batch request. */
  var batch_id: js.UndefOr[String] = js.undefined
  
  /** The creation time of the batch request. */
  var created: js.UndefOr[String] = js.undefined
  
  /** Document counts. */
  var document_counts: js.UndefOr[DocCounts] = js.undefined
  
  /** The geographical location of the Cloud Object Storage input bucket as listed on the **Endpoint** tab of your COS instance; for example, `us-geo`, `eu-geo`, or `ap-geo`. */
  var input_bucket_location: js.UndefOr[String] = js.undefined
  
  /** The name of the Cloud Object Storage input bucket. */
  var input_bucket_name: js.UndefOr[String] = js.undefined
  
  /** The geographical location of the Cloud Object Storage output bucket as listed on the **Endpoint** tab of your COS instance; for example, `us-geo`, `eu-geo`, or `ap-geo`. */
  var output_bucket_location: js.UndefOr[String] = js.undefined
  
  /** The name of the Cloud Object Storage output bucket. */
  var output_bucket_name: js.UndefOr[String] = js.undefined
  
  /** The status of the batch request. */
  var status: js.UndefOr[String] = js.undefined
  
  /** The time of the most recent update to the batch request. */
  var updated: js.UndefOr[String] = js.undefined
}
object BatchStatus {
  
  @scala.inline
  def apply(): BatchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStatus]
  }
  
  @scala.inline
  implicit class BatchStatusMutableBuilder[Self <: BatchStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatch_id(value: String): Self = StObject.set(x, "batch_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatch_idUndefined: Self = StObject.set(x, "batch_id", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDocument_counts(value: DocCounts): Self = StObject.set(x, "document_counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument_countsUndefined: Self = StObject.set(x, "document_counts", js.undefined)
    
    @scala.inline
    def setInput_bucket_location(value: String): Self = StObject.set(x, "input_bucket_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_bucket_locationUndefined: Self = StObject.set(x, "input_bucket_location", js.undefined)
    
    @scala.inline
    def setInput_bucket_name(value: String): Self = StObject.set(x, "input_bucket_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_bucket_nameUndefined: Self = StObject.set(x, "input_bucket_name", js.undefined)
    
    @scala.inline
    def setOutput_bucket_location(value: String): Self = StObject.set(x, "output_bucket_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput_bucket_locationUndefined: Self = StObject.set(x, "output_bucket_location", js.undefined)
    
    @scala.inline
    def setOutput_bucket_name(value: String): Self = StObject.set(x, "output_bucket_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput_bucket_nameUndefined: Self = StObject.set(x, "output_bucket_name", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def set_function(value: String): Self = StObject.set(x, "_function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_functionUndefined: Self = StObject.set(x, "_function", js.undefined)
  }
}
