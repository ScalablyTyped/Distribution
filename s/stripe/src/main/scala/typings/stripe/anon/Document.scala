package typings.stripe.anon

import typings.stripe.mod.accounts.IPersonDocumentCreateUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  /**
    * A document showing address, either a passport, local ID card, or utility bill from a well-known utility company.
    */
  var additional_document: js.UndefOr[IPersonDocumentCreateUpdateOptions] = js.undefined
  
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: js.UndefOr[IPersonDocumentCreateUpdateOptions] = js.undefined
}
object Document {
  
  inline def apply(): Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document]
  }
  
  extension [Self <: Document](x: Self) {
    
    inline def setAdditional_document(value: IPersonDocumentCreateUpdateOptions): Self = StObject.set(x, "additional_document", value.asInstanceOf[js.Any])
    
    inline def setAdditional_documentUndefined: Self = StObject.set(x, "additional_document", js.undefined)
    
    inline def setDocument(value: IPersonDocumentCreateUpdateOptions): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
  }
}
