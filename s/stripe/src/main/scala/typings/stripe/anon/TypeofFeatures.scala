package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFeatures extends StObject {
  
  val CustomerUpdate: Any
  
  val SubscriptionCancel: TypeofSubscriptionCancel
  
  val SubscriptionUpdate: Any
}
object TypeofFeatures {
  
  inline def apply(CustomerUpdate: Any, SubscriptionCancel: TypeofSubscriptionCancel, SubscriptionUpdate: Any): TypeofFeatures = {
    val __obj = js.Dynamic.literal(CustomerUpdate = CustomerUpdate.asInstanceOf[js.Any], SubscriptionCancel = SubscriptionCancel.asInstanceOf[js.Any], SubscriptionUpdate = SubscriptionUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFeatures] (val x: Self) extends AnyVal {
    
    inline def setCustomerUpdate(value: Any): Self = StObject.set(x, "CustomerUpdate", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionCancel(value: TypeofSubscriptionCancel): Self = StObject.set(x, "SubscriptionCancel", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUpdate(value: Any): Self = StObject.set(x, "SubscriptionUpdate", value.asInstanceOf[js.Any])
  }
}
