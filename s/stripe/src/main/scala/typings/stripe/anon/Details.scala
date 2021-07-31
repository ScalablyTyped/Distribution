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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Details extends StObject {
  
  /**
    * A user-displayable string describing the verification state for the person.
    * For example, this may say “Provided identity information could not be verified”.
    */
  var details: js.UndefOr[String] = js.undefined
  
  /**
    * One of document_address_mismatch, document_dob_mismatch, document_duplicate_type, document_id_number_mismatch,
    * document_name_mismatch, failed_keyed_identity, or failed_other.
    * A machine-readable code specifying the verification state for the person.
    */
  var details_code: js.UndefOr[
    document_address_mismatch | document_dob_mismatch | document_duplicate_type | document_id_number_mismatch | document_name_mismatch | failed_keyed_identity | failed_other
  ] = js.undefined
  
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: js.UndefOr[Back] = js.undefined
  
  /**
    * The state of verification for the person. Possible values are unverified, pending, or verified.
    */
  var status: js.UndefOr[unverified | pending | verified] = js.undefined
}
object Details {
  
  @scala.inline
  def apply(): Details = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit class DetailsMutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetails_code(
      value: document_address_mismatch | document_dob_mismatch | document_duplicate_type | document_id_number_mismatch | document_name_mismatch | failed_keyed_identity | failed_other
    ): Self = StObject.set(x, "details_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails_codeUndefined: Self = StObject.set(x, "details_code", js.undefined)
    
    @scala.inline
    def setDocument(value: Back): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setStatus(value: unverified | pending | verified): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
