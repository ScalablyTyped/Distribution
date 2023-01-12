package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RipplePayment extends StObject {
  
  var amount: UintType
  
  var destination: String
  
  var destination_tag: js.UndefOr[Double] = js.undefined
}
object RipplePayment {
  
  inline def apply(amount: UintType, destination: String): RipplePayment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[RipplePayment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RipplePayment] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestination_tag(value: Double): Self = StObject.set(x, "destination_tag", value.asInstanceOf[js.Any])
    
    inline def setDestination_tagUndefined: Self = StObject.set(x, "destination_tag", js.undefined)
  }
}
