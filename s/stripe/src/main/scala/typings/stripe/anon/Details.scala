package typings.stripe.anon

import typings.stripe.stripeStrings.document_address_mismatch
import typings.stripe.stripeStrings.document_dob_mismatch
import typings.stripe.stripeStrings.document_duplicate_type
import typings.stripe.stripeStrings.document_id_number_mismatch
import typings.stripe.stripeStrings.document_name_mismatch
import typings.stripe.stripeStrings.failed_keyed_identity
import typings.stripe.stripeStrings.failed_other
import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.unverified
import typings.stripe.stripeStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Details extends js.Object {
  
  /**
    * A user-displayable string describing the verification state for the person.
    * For example, this may say “Provided identity information could not be verified”.
    */
  var details: js.UndefOr[String] = js.native
  
  /**
    * One of document_address_mismatch, document_dob_mismatch, document_duplicate_type, document_id_number_mismatch,
    * document_name_mismatch, failed_keyed_identity, or failed_other.
    * A machine-readable code specifying the verification state for the person.
    */
  var details_code: js.UndefOr[
    document_address_mismatch | document_dob_mismatch | document_duplicate_type | document_id_number_mismatch | document_name_mismatch | failed_keyed_identity | failed_other
  ] = js.native
  
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: js.UndefOr[Back] = js.native
  
  /**
    * The state of verification for the person. Possible values are unverified, pending, or verified.
    */
  var status: js.UndefOr[unverified | pending | verified] = js.native
}
object Details {
  
  @scala.inline
  def apply(): Details = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit class DetailsOps[Self <: Details] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setDetails_code(
      value: document_address_mismatch | document_dob_mismatch | document_duplicate_type | document_id_number_mismatch | document_name_mismatch | failed_keyed_identity | failed_other
    ): Self = this.set("details_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails_code: Self = this.set("details_code", js.undefined)
    
    @scala.inline
    def setDocument(value: Back): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    
    @scala.inline
    def setStatus(value: unverified | pending | verified): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
