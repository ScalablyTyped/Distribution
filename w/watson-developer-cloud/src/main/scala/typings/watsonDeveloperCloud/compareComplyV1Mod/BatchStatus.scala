package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The batch-request status. */
@js.native
trait BatchStatus extends js.Object {
  
  /** The method to be run against the documents. Possible values are `html_conversion`, `element_classification`, and `tables`. */
  var _function: js.UndefOr[String] = js.native
  
  /** The unique identifier for the batch request. */
  var batch_id: js.UndefOr[String] = js.native
  
  /** The creation time of the batch request. */
  var created: js.UndefOr[String] = js.native
  
  /** Document counts. */
  var document_counts: js.UndefOr[DocCounts] = js.native
  
  /** The geographical location of the Cloud Object Storage input bucket as listed on the **Endpoint** tab of your COS instance; for example, `us-geo`, `eu-geo`, or `ap-geo`. */
  var input_bucket_location: js.UndefOr[String] = js.native
  
  /** The name of the Cloud Object Storage input bucket. */
  var input_bucket_name: js.UndefOr[String] = js.native
  
  /** The geographical location of the Cloud Object Storage output bucket as listed on the **Endpoint** tab of your COS instance; for example, `us-geo`, `eu-geo`, or `ap-geo`. */
  var output_bucket_location: js.UndefOr[String] = js.native
  
  /** The name of the Cloud Object Storage output bucket. */
  var output_bucket_name: js.UndefOr[String] = js.native
  
  /** The status of the batch request. */
  var status: js.UndefOr[String] = js.native
  
  /** The time of the most recent update to the batch request. */
  var updated: js.UndefOr[String] = js.native
}
object BatchStatus {
  
  @scala.inline
  def apply(): BatchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStatus]
  }
  
  @scala.inline
  implicit class BatchStatusOps[Self <: BatchStatus] (val x: Self) extends AnyVal {
    
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
    def set_function(value: String): Self = this.set("_function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_function: Self = this.set("_function", js.undefined)
    
    @scala.inline
    def setBatch_id(value: String): Self = this.set("batch_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatch_id: Self = this.set("batch_id", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDocument_counts(value: DocCounts): Self = this.set("document_counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument_counts: Self = this.set("document_counts", js.undefined)
    
    @scala.inline
    def setInput_bucket_location(value: String): Self = this.set("input_bucket_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput_bucket_location: Self = this.set("input_bucket_location", js.undefined)
    
    @scala.inline
    def setInput_bucket_name(value: String): Self = this.set("input_bucket_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput_bucket_name: Self = this.set("input_bucket_name", js.undefined)
    
    @scala.inline
    def setOutput_bucket_location(value: String): Self = this.set("output_bucket_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput_bucket_location: Self = this.set("output_bucket_location", js.undefined)
    
    @scala.inline
    def setOutput_bucket_name(value: String): Self = this.set("output_bucket_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput_bucket_name: Self = this.set("output_bucket_name", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
}
