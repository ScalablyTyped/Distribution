package typings.stripe.anon

import typings.stripe.mod.paymentMethods.IPaymentMethodType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeT[T /* <: IPaymentMethodType */] extends StObject {
  
  var `type`: T
}
object TypeT {
  
  inline def apply[T /* <: IPaymentMethodType */](`type`: T): TypeT[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeT[T]]
  }
  
  extension [Self <: TypeT[?], T /* <: IPaymentMethodType */](x: Self & TypeT[T]) {
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
