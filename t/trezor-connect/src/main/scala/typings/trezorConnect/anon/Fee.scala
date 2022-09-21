package typings.trezorConnect.anon

import typings.trezorConnect.accountMod.PrecomposedTransaction
import typings.trezorConnect.trezorConnectStrings.`final`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fee
  extends StObject
     with PrecomposedTransaction {
  
  var bytes: Double
  
  // all the outputs, no fee, no change
  var fee: String
  
  var feePerByte: String
  
  var max: js.UndefOr[String] = js.undefined
  
  var totalSpent: String
  
  var transaction: Inputs
  
  var `type`: `final`
}
object Fee {
  
  inline def apply(bytes: Double, fee: String, feePerByte: String, totalSpent: String, transaction: Inputs): Fee = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], feePerByte = feePerByte.asInstanceOf[js.Any], totalSpent = totalSpent.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("final")
    __obj.asInstanceOf[Fee]
  }
  
  extension [Self <: Fee](x: Self) {
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setFee(value: String): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setFeePerByte(value: String): Self = StObject.set(x, "feePerByte", value.asInstanceOf[js.Any])
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setTotalSpent(value: String): Self = StObject.set(x, "totalSpent", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: Inputs): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setType(value: `final`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
