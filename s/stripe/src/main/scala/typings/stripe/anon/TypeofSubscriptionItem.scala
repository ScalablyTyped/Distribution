package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSubscriptionItem extends StObject {
  
  val PriceData: TypeofPriceData
}
object TypeofSubscriptionItem {
  
  inline def apply(PriceData: TypeofPriceData): TypeofSubscriptionItem = {
    val __obj = js.Dynamic.literal(PriceData = PriceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSubscriptionItem]
  }
  
  extension [Self <: TypeofSubscriptionItem](x: Self) {
    
    inline def setPriceData(value: TypeofPriceData): Self = StObject.set(x, "PriceData", value.asInstanceOf[js.Any])
  }
}
