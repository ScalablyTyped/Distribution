package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mcc extends StObject {
  
  /**
    * The merchant category code for the account. MCCs are used to classify businesses
    * based on the goods or services they provide.
    */
  var mcc: js.UndefOr[String] = js.undefined
  
  /**
    * The customer-facing business name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Internal-only description of the product sold or service provided by the
    * business. It’s used by Stripe for risk and underwriting purposes.
    */
  var product_description: js.UndefOr[String] = js.undefined
  
  /**
    * A publicly available mailing address for sending support issues to.
    */
  var support_address: js.UndefOr[City] = js.undefined
  
  /**
    * A publicly available email address for sending support issues to.
    */
  var support_email: js.UndefOr[String] = js.undefined
  
  /**
    * A publicly available phone number to call with support issues.
    */
  var support_phone: js.UndefOr[String] = js.undefined
  
  /**
    * A publicly available website for handling support issues.
    */
  var support_url: js.UndefOr[String] = js.undefined
  
  /**
    * The business’s publicly available website.
    */
  var url: js.UndefOr[String] = js.undefined
}
object Mcc {
  
  inline def apply(): Mcc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mcc]
  }
  
  extension [Self <: Mcc](x: Self) {
    
    inline def setMcc(value: String): Self = StObject.set(x, "mcc", value.asInstanceOf[js.Any])
    
    inline def setMccUndefined: Self = StObject.set(x, "mcc", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProduct_description(value: String): Self = StObject.set(x, "product_description", value.asInstanceOf[js.Any])
    
    inline def setProduct_descriptionUndefined: Self = StObject.set(x, "product_description", js.undefined)
    
    inline def setSupport_address(value: City): Self = StObject.set(x, "support_address", value.asInstanceOf[js.Any])
    
    inline def setSupport_addressUndefined: Self = StObject.set(x, "support_address", js.undefined)
    
    inline def setSupport_email(value: String): Self = StObject.set(x, "support_email", value.asInstanceOf[js.Any])
    
    inline def setSupport_emailUndefined: Self = StObject.set(x, "support_email", js.undefined)
    
    inline def setSupport_phone(value: String): Self = StObject.set(x, "support_phone", value.asInstanceOf[js.Any])
    
    inline def setSupport_phoneUndefined: Self = StObject.set(x, "support_phone", js.undefined)
    
    inline def setSupport_url(value: String): Self = StObject.set(x, "support_url", value.asInstanceOf[js.Any])
    
    inline def setSupport_urlUndefined: Self = StObject.set(x, "support_url", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
