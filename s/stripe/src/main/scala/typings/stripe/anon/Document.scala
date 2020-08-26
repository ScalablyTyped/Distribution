package typings.stripe.anon

import typings.stripe.mod.accounts.IPersonDocumentCreateUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  /**
    * A document showing address, either a passport, local ID card, or utility bill from a well-known utility company.
    */
  var additional_document: js.UndefOr[IPersonDocumentCreateUpdateOptions] = js.native
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: js.UndefOr[IPersonDocumentCreateUpdateOptions] = js.native
}

object Document {
  @scala.inline
  def apply(): Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
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
    def setAdditional_document(value: IPersonDocumentCreateUpdateOptions): Self = this.set("additional_document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditional_document: Self = this.set("additional_document", js.undefined)
    @scala.inline
    def setDocument(value: IPersonDocumentCreateUpdateOptions): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
  }
  
}

