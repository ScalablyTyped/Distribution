package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLineItem extends StObject {
  
  val PriceData: TypeofPriceData
}
object TypeofLineItem {
  
  inline def apply(PriceData: TypeofPriceData): TypeofLineItem = {
    val __obj = js.Dynamic.literal(PriceData = PriceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofLineItem]
  }
  
  extension [Self <: TypeofLineItem](x: Self) {
    
    inline def setPriceData(value: TypeofPriceData): Self = StObject.set(x, "PriceData", value.asInstanceOf[js.Any])
  }
}
