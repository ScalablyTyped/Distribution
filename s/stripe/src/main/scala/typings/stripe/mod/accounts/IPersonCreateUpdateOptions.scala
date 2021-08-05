package typings.stripe.mod.accounts

import typings.stripe.anon.Document
import typings.stripe.mod.IOptionsMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPersonCreateUpdateOptions
  extends StObject
     with IPersonShared {
  
  /**
    * The person’s ID number, as appropriate for their country. For example, a social security number
    * in the U.S., social insurance number in Canada, etc. Instead of the number itself,
    * you can also provide a PII token provided by Stripe.js.
    */
  var id_number: js.UndefOr[String] = js.undefined
  
  /**
    * Set of key-value pairs that you can attach to an object.
    * This can be useful for storing additional information about the object in a structured format.
    * Individual keys can be unset by posting an empty value to them.
    * All keys can be unset by posting an empty value to metadata.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
  
  /**
    * A person token, used to securely provide details to the person.
    */
  var person_token: js.UndefOr[String] = js.undefined
  
  /**
    * The last four digits of the person’s Social Security Number (U.S. only).
    */
  var ssn_last_4: js.UndefOr[String] = js.undefined
  
  /**
    * The person’s verification document information.
    */
  var verification: js.UndefOr[Document] = js.undefined
}
object IPersonCreateUpdateOptions {
  
  inline def apply(): IPersonCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonCreateUpdateOptions]
  }
  
  extension [Self <: IPersonCreateUpdateOptions](x: Self) {
    
    inline def setId_number(value: String): Self = StObject.set(x, "id_number", value.asInstanceOf[js.Any])
    
    inline def setId_numberUndefined: Self = StObject.set(x, "id_number", js.undefined)
    
    inline def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPerson_token(value: String): Self = StObject.set(x, "person_token", value.asInstanceOf[js.Any])
    
    inline def setPerson_tokenUndefined: Self = StObject.set(x, "person_token", js.undefined)
    
    inline def setSsn_last_4(value: String): Self = StObject.set(x, "ssn_last_4", value.asInstanceOf[js.Any])
    
    inline def setSsn_last_4Undefined: Self = StObject.set(x, "ssn_last_4", js.undefined)
    
    inline def setVerification(value: Document): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
  }
}
