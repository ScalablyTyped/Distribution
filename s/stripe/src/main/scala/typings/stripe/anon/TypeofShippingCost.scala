package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofShippingCost extends StObject {
  
  val ShippingRateData: TypeofShippingRateData
}
object TypeofShippingCost {
  
  inline def apply(ShippingRateData: TypeofShippingRateData): TypeofShippingCost = {
    val __obj = js.Dynamic.literal(ShippingRateData = ShippingRateData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofShippingCost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofShippingCost] (val x: Self) extends AnyVal {
    
    inline def setShippingRateData(value: TypeofShippingRateData): Self = StObject.set(x, "ShippingRateData", value.asInstanceOf[js.Any])
  }
}
