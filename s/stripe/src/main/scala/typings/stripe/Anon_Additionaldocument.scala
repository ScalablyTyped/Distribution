package typings.stripe

import typings.stripe.stripeMod.accounts.IPersonDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Additionaldocument extends js.Object {
  /**
    * A document showing address, either a passport, local ID card, or utility bill from a well-known utility company.
    */
  var additional_document: IPersonDocument
  /**
    * A user-displayable string describing the verification state for the person.
    * For example, this may say “Provided identity information could not be verified”.
    */
  var details: String
  /**
    * One of document_address_mismatch, document_dob_mismatch, document_duplicate_type, document_id_number_mismatch,
    * document_name_mismatch, failed_keyed_identity, or failed_other.
    * A machine-readable code specifying the verification state for the person.
    */
  var details_code: String
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: IPersonDocument
  /**
    * The state of verification for the person. Possible values are unverified, pending, or verified.
    */
  var status: String
}

object Anon_Additionaldocument {
  @scala.inline
  def apply(
    additional_document: IPersonDocument,
    details: String,
    details_code: String,
    document: IPersonDocument,
    status: String
  ): Anon_Additionaldocument = {
    val __obj = js.Dynamic.literal(additional_document = additional_document.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], details_code = details_code.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Additionaldocument]
  }
}

