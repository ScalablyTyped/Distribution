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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofLineItem] (val x: Self) extends AnyVal {
    
    inline def setPriceData(value: TypeofPriceData): Self = StObject.set(x, "PriceData", value.asInstanceOf[js.Any])
  }
}
