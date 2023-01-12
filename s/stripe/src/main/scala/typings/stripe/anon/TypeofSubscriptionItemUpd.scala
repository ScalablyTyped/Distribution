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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSubscriptionItemUpd] (val x: Self) extends AnyVal {
    
    inline def setPriceData(value: TypeofPriceData): Self = StObject.set(x, "PriceData", value.asInstanceOf[js.Any])
  }
}
