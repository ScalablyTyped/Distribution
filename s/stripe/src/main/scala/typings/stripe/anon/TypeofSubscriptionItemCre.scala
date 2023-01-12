package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSubscriptionItemCre extends StObject {
  
  val PriceData: TypeofPriceData
}
object TypeofSubscriptionItemCre {
  
  inline def apply(PriceData: TypeofPriceData): TypeofSubscriptionItemCre = {
    val __obj = js.Dynamic.literal(PriceData = PriceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSubscriptionItemCre]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSubscriptionItemCre] (val x: Self) extends AnyVal {
    
    inline def setPriceData(value: TypeofPriceData): Self = StObject.set(x, "PriceData", value.asInstanceOf[js.Any])
  }
}
