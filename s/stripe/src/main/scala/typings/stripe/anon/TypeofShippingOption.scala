package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofShippingOption extends StObject {
  
  val ShippingRateData: TypeofShippingRateData
}
object TypeofShippingOption {
  
  inline def apply(ShippingRateData: TypeofShippingRateData): TypeofShippingOption = {
    val __obj = js.Dynamic.literal(ShippingRateData = ShippingRateData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofShippingOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofShippingOption] (val x: Self) extends AnyVal {
    
    inline def setShippingRateData(value: TypeofShippingRateData): Self = StObject.set(x, "ShippingRateData", value.asInstanceOf[js.Any])
  }
}
