package typings.stripe.mod.accounts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPersonDocument
  extends StObject
     with IPersonDocumentCreateUpdateOptions {
  
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
  def apply(): IPersonDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonDocument]
  }
  
  @scala.inline
  implicit class IPersonDocumentMutableBuilder[Self <: IPersonDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetails_code(value: String): Self = StObject.set(x, "details_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails_codeUndefined: Self = StObject.set(x, "details_code", js.undefined)
  }
}
