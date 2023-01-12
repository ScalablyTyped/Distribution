package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLineItemPriceData extends StObject {
  
  val PriceData: Any
  
  val ProductData: Any
}
object TypeofLineItemPriceData {
  
  inline def apply(PriceData: Any, ProductData: Any): TypeofLineItemPriceData = {
    val __obj = js.Dynamic.literal(PriceData = PriceData.asInstanceOf[js.Any], ProductData = ProductData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofLineItemPriceData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofLineItemPriceData] (val x: Self) extends AnyVal {
    
    inline def setPriceData(value: Any): Self = StObject.set(x, "PriceData", value.asInstanceOf[js.Any])
    
    inline def setProductData(value: Any): Self = StObject.set(x, "ProductData", value.asInstanceOf[js.Any])
  }
}
