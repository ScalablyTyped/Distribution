package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DocumentAccepted. */
trait DocumentAccepted extends js.Object {
  /** The unique identifier of the ingested document. */
  var document_id: js.UndefOr[String] = js.undefined
  /** Array of notices produced by the document-ingestion process. */
  var notices: js.UndefOr[js.Array[Notice]] = js.undefined
  /** Status of the document in the ingestion process. A status of `processing` is returned for documents that are ingested with a *version* date before `2019-01-01`. The `pending` status is returned for all others. */
  var status: js.UndefOr[String] = js.undefined
}

object DocumentAccepted {
  @scala.inline
  def apply(document_id: String = null, notices: js.Array[Notice] = null, status: String = null): DocumentAccepted = {
    val __obj = js.Dynamic.literal()
    if (document_id != null) __obj.updateDynamic("document_id")(document_id.asInstanceOf[js.Any])
    if (notices != null) __obj.updateDynamic("notices")(notices.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAccepted]
  }
}

