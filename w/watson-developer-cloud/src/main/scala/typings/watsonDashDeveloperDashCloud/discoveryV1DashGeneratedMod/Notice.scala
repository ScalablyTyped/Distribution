package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A notice produced for the collection. */
trait Notice extends js.Object {
  /** The creation date of the collection in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. */
  var created: js.UndefOr[String] = js.undefined
  /** The description of the notice. */
  var description: js.UndefOr[String] = js.undefined
  /** Unique identifier of the document. */
  var document_id: js.UndefOr[String] = js.undefined
  /** Identifies the notice. Many notices might have the same ID. This field exists so that user applications can programmatically identify a notice and take automatic corrective action. Typical notice IDs include: `index_failed`, `index_failed_too_many_requests`, `index_failed_incompatible_field`, `index_failed_cluster_unavailable`, `ingestion_timeout`, `ingestion_error`, `bad_request`, `internal_error`, `missing_model`, `unsupported_model`, `smart_document_understanding_failed_incompatible_field`, `smart_document_understanding_failed_internal_error`, `smart_document_understanding_failed_internal_error`, `smart_document_understanding_failed_warning`, `smart_document_understanding_page_error`, `smart_document_understanding_page_warning`. **Note:** This is not a complete list, other values might be returned. */
  var notice_id: js.UndefOr[String] = js.undefined
  /** Unique identifier of the query used for relevance training. */
  var query_id: js.UndefOr[String] = js.undefined
  /** Severity level of the notice. */
  var severity: js.UndefOr[String] = js.undefined
  /** Ingestion or training step in which the notice occurred. Typical step values include: `classify_elements`, `smartDocumentUnderstanding`, `ingestion`, `indexing`, `convert`. **Note:** This is not a complete list, other values might be returned. */
  var step: js.UndefOr[String] = js.undefined
}

object Notice {
  @scala.inline
  def apply(
    created: String = null,
    description: String = null,
    document_id: String = null,
    notice_id: String = null,
    query_id: String = null,
    severity: String = null,
    step: String = null
  ): Notice = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (document_id != null) __obj.updateDynamic("document_id")(document_id.asInstanceOf[js.Any])
    if (notice_id != null) __obj.updateDynamic("notice_id")(notice_id.asInstanceOf[js.Any])
    if (query_id != null) __obj.updateDynamic("query_id")(query_id.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notice]
  }
}

