package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A notice produced for the collection. */
@js.native
trait Notice extends js.Object {
  /** The creation date of the collection in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. */
  var created: js.UndefOr[String] = js.native
  /** The description of the notice. */
  var description: js.UndefOr[String] = js.native
  /** Unique identifier of the document. */
  var document_id: js.UndefOr[String] = js.native
  /** Identifies the notice. Many notices might have the same ID. This field exists so that user applications can programmatically identify a notice and take automatic corrective action. Typical notice IDs include: `index_failed`, `index_failed_too_many_requests`, `index_failed_incompatible_field`, `index_failed_cluster_unavailable`, `ingestion_timeout`, `ingestion_error`, `bad_request`, `internal_error`, `missing_model`, `unsupported_model`, `smart_document_understanding_failed_incompatible_field`, `smart_document_understanding_failed_internal_error`, `smart_document_understanding_failed_internal_error`, `smart_document_understanding_failed_warning`, `smart_document_understanding_page_error`, `smart_document_understanding_page_warning`. **Note:** This is not a complete list, other values might be returned. */
  var notice_id: js.UndefOr[String] = js.native
  /** Unique identifier of the query used for relevance training. */
  var query_id: js.UndefOr[String] = js.native
  /** Severity level of the notice. */
  var severity: js.UndefOr[String] = js.native
  /** Ingestion or training step in which the notice occurred. Typical step values include: `classify_elements`, `smartDocumentUnderstanding`, `ingestion`, `indexing`, `convert`. **Note:** This is not a complete list, other values might be returned. */
  var step: js.UndefOr[String] = js.native
}

object Notice {
  @scala.inline
  def apply(): Notice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notice]
  }
  @scala.inline
  implicit class NoticeOps[Self <: Notice] (val x: Self) extends AnyVal {
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
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDocument_id(value: String): Self = this.set("document_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument_id: Self = this.set("document_id", js.undefined)
    @scala.inline
    def setNotice_id(value: String): Self = this.set("notice_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotice_id: Self = this.set("notice_id", js.undefined)
    @scala.inline
    def setQuery_id(value: String): Self = this.set("query_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery_id: Self = this.set("query_id", js.undefined)
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setStep(value: String): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

