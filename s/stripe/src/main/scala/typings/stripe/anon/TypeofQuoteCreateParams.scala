package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofQuoteCreateParams extends StObject {
  
  val LineItem: TypeofLineItem
}
object TypeofQuoteCreateParams {
  
  inline def apply(LineItem: TypeofLineItem): TypeofQuoteCreateParams = {
    val __obj = js.Dynamic.literal(LineItem = LineItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofQuoteCreateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofQuoteCreateParams] (val x: Self) extends AnyVal {
    
    inline def setLineItem(value: TypeofLineItem): Self = StObject.set(x, "LineItem", value.asInstanceOf[js.Any])
  }
}
