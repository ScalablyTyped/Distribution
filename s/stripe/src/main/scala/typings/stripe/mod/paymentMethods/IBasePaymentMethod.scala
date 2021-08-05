package typings.stripe.mod.paymentMethods

import typings.stripe.anon.Email
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.customers.ICustomer
import typings.stripe.stripeStrings.payment_method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBasePaymentMethod
  extends StObject
     with IResourceObject {
  
  /** Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods. */
  var billing_details: Null | Email
  
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  var created: Double
  
  /** The ID of the Customer to which this PaymentMethod is saved. This will not be set when the PaymentMethod has not been saved to a Customer. [Expandable] */
  var customer: String | ICustomer | Null
  
  /** Has the value true if the object exists in live mode or the value false if the object exists in test mode. */
  var livemode: Boolean
  
  /** Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. */
  var metadata: IMetadata
  
  @JSName("object")
  var object_IBasePaymentMethod: payment_method
}
object IBasePaymentMethod {
  
  inline def apply(created: Double, id: String, livemode: Boolean, metadata: IMetadata): IBasePaymentMethod = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], billing_details = null, customer = null)
    __obj.updateDynamic("object")("payment_method")
    __obj.asInstanceOf[IBasePaymentMethod]
  }
  
  extension [Self <: IBasePaymentMethod](x: Self) {
    
    inline def setBilling_details(value: Email): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
    
    inline def setBilling_detailsNull: Self = StObject.set(x, "billing_details", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: String | ICustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject(value: payment_method): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
