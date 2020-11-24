package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DocumentAccepted. */
@js.native
trait DocumentAccepted extends js.Object {
  
  /** The unique identifier of the ingested document. */
  var document_id: js.UndefOr[String] = js.native
  
  /** Array of notices produced by the document-ingestion process. */
  var notices: js.UndefOr[js.Array[Notice]] = js.native
  
  /** Status of the document in the ingestion process. A status of `processing` is returned for documents that are ingested with a *version* date before `2019-01-01`. The `pending` status is returned for all others. */
  var status: js.UndefOr[String] = js.native
}
object DocumentAccepted {
  
  @scala.inline
  def apply(): DocumentAccepted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAccepted]
  }
  
  @scala.inline
  implicit class DocumentAcceptedOps[Self <: DocumentAccepted] (val x: Self) extends AnyVal {
    
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
    def setNoticesVarargs(value: Notice*): Self = this.set("notices", js.Array(value :_*))
    
    @scala.inline
    def setNotices(value: js.Array[Notice]): Self = this.set("notices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotices: Self = this.set("notices", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
