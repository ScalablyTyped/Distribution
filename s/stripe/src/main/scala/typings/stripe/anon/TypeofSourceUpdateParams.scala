package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSourceUpdateParams extends StObject {
  
  val Mandate: TypeofMandate
  
  val SourceOrder: TypeofSourceOrder
}
object TypeofSourceUpdateParams {
  
  inline def apply(Mandate: TypeofMandate, SourceOrder: TypeofSourceOrder): TypeofSourceUpdateParams = {
    val __obj = js.Dynamic.literal(Mandate = Mandate.asInstanceOf[js.Any], SourceOrder = SourceOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSourceUpdateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSourceUpdateParams] (val x: Self) extends AnyVal {
    
    inline def setMandate(value: TypeofMandate): Self = StObject.set(x, "Mandate", value.asInstanceOf[js.Any])
    
    inline def setSourceOrder(value: TypeofSourceOrder): Self = StObject.set(x, "SourceOrder", value.asInstanceOf[js.Any])
  }
}
