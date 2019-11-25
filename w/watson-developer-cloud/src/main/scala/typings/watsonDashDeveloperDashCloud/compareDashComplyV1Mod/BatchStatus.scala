package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The batch-request status. */
trait BatchStatus extends js.Object {
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
  def apply(
    _function: String = null,
    batch_id: String = null,
    created: String = null,
    document_counts: DocCounts = null,
    input_bucket_location: String = null,
    input_bucket_name: String = null,
    output_bucket_location: String = null,
    output_bucket_name: String = null,
    status: String = null,
    updated: String = null
  ): BatchStatus = {
    val __obj = js.Dynamic.literal()
    if (_function != null) __obj.updateDynamic("_function")(_function.asInstanceOf[js.Any])
    if (batch_id != null) __obj.updateDynamic("batch_id")(batch_id.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (document_counts != null) __obj.updateDynamic("document_counts")(document_counts.asInstanceOf[js.Any])
    if (input_bucket_location != null) __obj.updateDynamic("input_bucket_location")(input_bucket_location.asInstanceOf[js.Any])
    if (input_bucket_name != null) __obj.updateDynamic("input_bucket_name")(input_bucket_name.asInstanceOf[js.Any])
    if (output_bucket_location != null) __obj.updateDynamic("output_bucket_location")(output_bucket_location.asInstanceOf[js.Any])
    if (output_bucket_name != null) __obj.updateDynamic("output_bucket_name")(output_bucket_name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchStatus]
  }
}

