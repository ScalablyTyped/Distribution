package typings.stripe.anon

import typings.stripe.mod.accounts.IPersonDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Additionaldocument extends js.Object {
  
  /**
    * A document showing address, either a passport, local ID card, or utility bill from a well-known utility company.
    */
  var additional_document: IPersonDocument = js.native
  
  /**
    * A user-displayable string describing the verification state for the person.
    * For example, this may say “Provided identity information could not be verified”.
    */
  var details: String = js.native
  
  /**
    * One of document_address_mismatch, document_dob_mismatch, document_duplicate_type, document_id_number_mismatch,
    * document_name_mismatch, failed_keyed_identity, or failed_other.
    * A machine-readable code specifying the verification state for the person.
    */
  var details_code: String = js.native
  
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: IPersonDocument = js.native
  
  /**
    * The state of verification for the person. Possible values are unverified, pending, or verified.
    */
  var status: String = js.native
}
object Additionaldocument {
  
  @scala.inline
  def apply(
    additional_document: IPersonDocument,
    details: String,
    details_code: String,
    document: IPersonDocument,
    status: String
  ): Additionaldocument = {
    val __obj = js.Dynamic.literal(additional_document = additional_document.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], details_code = details_code.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Additionaldocument]
  }
  
  @scala.inline
  implicit class AdditionaldocumentOps[Self <: Additionaldocument] (val x: Self) extends AnyVal {
    
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
    def setAdditional_document(value: IPersonDocument): Self = this.set("additional_document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails_code(value: String): Self = this.set("details_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: IPersonDocument): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
