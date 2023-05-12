package typings.stripe.anon

import typings.stripe.stripeStrings.tax_code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.TaxCode> */
trait ResponseTaxCode extends StObject {
  
  /**
    * A detailed description of which types of products the tax code represents.
    */
  var description: String
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * A short name for the tax code.
    */
  var name: String
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: tax_code
}
object ResponseTaxCode {
  
  inline def apply(description: String, id: String, lastResponse: ApiVersion, name: String): ResponseTaxCode = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("tax_code")
    __obj.asInstanceOf[ResponseTaxCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseTaxCode] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObject(value: tax_code): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
