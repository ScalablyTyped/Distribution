package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSubscriptionItemUpd extends StObject {
  
  val PriceData: TypeofPriceData
}
object TypeofSubscriptionItemUpd {
  
  inline def apply(PriceData: TypeofPriceData): TypeofSubscriptionItemUpd = {
    val __obj = js.Dynamic.literal(PriceData = PriceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSubscriptionItemUpd]
  }
  
  extension [Self <: TypeofSubscriptionItemUpd](x: Self) {
    
    inline def setPriceData(value: TypeofPriceData): Self = StObject.set(x, "PriceData", value.asInstanceOf[js.Any])
  }
}
