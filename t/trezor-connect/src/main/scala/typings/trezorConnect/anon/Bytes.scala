package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptAccountMod.PrecomposedTransaction
import typings.trezorConnect.trezorConnectStrings.nonfinal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bytes
  extends StObject
     with PrecomposedTransaction {
  
  var bytes: Double
  
  // all the outputs, no fee, no change
  var fee: String
  
  var feePerByte: String
  
  var max: js.UndefOr[String] = js.undefined
  
  var totalSpent: String
  
  var `type`: nonfinal
}
object Bytes {
  
  inline def apply(bytes: Double, fee: String, feePerByte: String, totalSpent: String): Bytes = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], feePerByte = feePerByte.asInstanceOf[js.Any], totalSpent = totalSpent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nonfinal")
    __obj.asInstanceOf[Bytes]
  }
  
  extension [Self <: Bytes](x: Self) {
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setFee(value: String): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setFeePerByte(value: String): Self = StObject.set(x, "feePerByte", value.asInstanceOf[js.Any])
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setTotalSpent(value: String): Self = StObject.set(x, "totalSpent", value.asInstanceOf[js.Any])
    
    inline def setType(value: nonfinal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
