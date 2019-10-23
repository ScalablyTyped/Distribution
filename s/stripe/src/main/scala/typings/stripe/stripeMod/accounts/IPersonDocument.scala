package typings.stripe.stripeMod.accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonDocument extends IPersonDocumentCreateUpdateOptions {
  /**
    * A user-displayable string describing the verification state of this document.
    * For example, if a document is uploaded and the picture is too fuzzy, this may
    * say “Identity document is too unclear to read”.
    */
  var details: js.UndefOr[String] = js.undefined
  /**
    * One of document_corrupt, document_country_not_supported, document_expired, document_failed_copy,
    * document_failed_other, document_failed_test_mode, document_fraudulent, document_failed_greyscale,
    * document_incomplete, document_invalid, document_manipulated, document_missing_back, document_missing_front,
    * document_not_readable, document_not_uploaded, document_photo_mismatch, document_too_large, or document_type_not_supported.
    * A machine-readable code specifying the verification state for this document.
    */
  var details_code: js.UndefOr[String] = js.undefined
}

object IPersonDocument {
  @scala.inline
  def apply(back: String = null, details: String = null, details_code: String = null, front: String = null): IPersonDocument = {
    val __obj = js.Dynamic.literal()
    if (back != null) __obj.updateDynamic("back")(back)
    if (details != null) __obj.updateDynamic("details")(details)
    if (details_code != null) __obj.updateDynamic("details_code")(details_code)
    if (front != null) __obj.updateDynamic("front")(front)
    __obj.asInstanceOf[IPersonDocument]
  }
}

