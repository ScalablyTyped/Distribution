package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofItem extends StObject {
  
  val PriceData: TypeofPriceData
}
object TypeofItem {
  
  inline def apply(PriceData: TypeofPriceData): TypeofItem = {
    val __obj = js.Dynamic.literal(PriceData = PriceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofItem]
  }
  
  extension [Self <: TypeofItem](x: Self) {
    
    inline def setPriceData(value: TypeofPriceData): Self = StObject.set(x, "PriceData", value.asInstanceOf[js.Any])
  }
}
