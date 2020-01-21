package typings.stripe

import typings.stripe.mod.accounts.IPersonDocumentCreateUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdditionaldocumentDocument extends js.Object {
  /**
    * A document showing address, either a passport, local ID card, or utility bill from a well-known utility company.
    */
  var additional_document: js.UndefOr[IPersonDocumentCreateUpdateOptions] = js.undefined
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: js.UndefOr[IPersonDocumentCreateUpdateOptions] = js.undefined
}

object AnonAdditionaldocumentDocument {
  @scala.inline
  def apply(
    additional_document: IPersonDocumentCreateUpdateOptions = null,
    document: IPersonDocumentCreateUpdateOptions = null
  ): AnonAdditionaldocumentDocument = {
    val __obj = js.Dynamic.literal()
    if (additional_document != null) __obj.updateDynamic("additional_document")(additional_document.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdditionaldocumentDocument]
  }
}

