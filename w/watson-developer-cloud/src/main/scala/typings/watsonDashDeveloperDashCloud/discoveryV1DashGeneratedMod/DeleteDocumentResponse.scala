package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DeleteDocumentResponse. */
trait DeleteDocumentResponse extends js.Object {
  /** The unique identifier of the document. */
  var document_id: js.UndefOr[String] = js.undefined
  /** Status of the document. A deleted document has the status deleted. */
  var status: js.UndefOr[String] = js.undefined
}

object DeleteDocumentResponse {
  @scala.inline
  def apply(document_id: String = null, status: String = null): DeleteDocumentResponse = {
    val __obj = js.Dynamic.literal()
    if (document_id != null) __obj.updateDynamic("document_id")(document_id)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[DeleteDocumentResponse]
  }
}

