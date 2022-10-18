package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RippleSignTx extends StObject {
  
  var address_n: js.Array[Double]
  
  var fee: UintType
  
  var flags: js.UndefOr[Double] = js.undefined
  
  var last_ledger_sequence: js.UndefOr[Double] = js.undefined
  
  var payment: RipplePayment
  
  var sequence: Double
}
object RippleSignTx {
  
  inline def apply(address_n: js.Array[Double], fee: UintType, payment: RipplePayment, sequence: Double): RippleSignTx = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], payment = payment.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleSignTx]
  }
  
  extension [Self <: RippleSignTx](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setFee(value: UintType): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setLast_ledger_sequence(value: Double): Self = StObject.set(x, "last_ledger_sequence", value.asInstanceOf[js.Any])
    
    inline def setLast_ledger_sequenceUndefined: Self = StObject.set(x, "last_ledger_sequence", js.undefined)
    
    inline def setPayment(value: RipplePayment): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
  }
}
