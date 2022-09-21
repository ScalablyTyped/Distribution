package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofQuoteUpdateParams extends StObject {
  
  val LineItem: TypeofLineItem
}
object TypeofQuoteUpdateParams {
  
  inline def apply(LineItem: TypeofLineItem): TypeofQuoteUpdateParams = {
    val __obj = js.Dynamic.literal(LineItem = LineItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofQuoteUpdateParams]
  }
  
  extension [Self <: TypeofQuoteUpdateParams](x: Self) {
    
    inline def setLineItem(value: TypeofLineItem): Self = StObject.set(x, "LineItem", value.asInstanceOf[js.Any])
  }
}
