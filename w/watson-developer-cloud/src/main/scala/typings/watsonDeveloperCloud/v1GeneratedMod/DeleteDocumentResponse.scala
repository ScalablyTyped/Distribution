package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DeleteDocumentResponse. */
@js.native
trait DeleteDocumentResponse extends js.Object {
  /** The unique identifier of the document. */
  var document_id: js.UndefOr[String] = js.native
  /** Status of the document. A deleted document has the status deleted. */
  var status: js.UndefOr[String] = js.native
}

object DeleteDocumentResponse {
  @scala.inline
  def apply(): DeleteDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDocumentResponse]
  }
  @scala.inline
  implicit class DeleteDocumentResponseOps[Self <: DeleteDocumentResponse] (val x: Self) extends AnyVal {
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
    def setDocument_id(value: String): Self = this.set("document_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument_id: Self = this.set("document_id", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

