package typings.trezorConnect.libTypescriptAccountMod

import typings.trezorConnect.anon.Inputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.anon.Error
  - typings.trezorConnect.anon.Bytes
  - typings.trezorConnect.anon.Fee
*/
trait PrecomposedTransaction extends StObject
object PrecomposedTransaction {
  
  inline def Bytes(bytes: Double, fee: String, feePerByte: String, totalSpent: String): typings.trezorConnect.anon.Bytes = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], feePerByte = feePerByte.asInstanceOf[js.Any], totalSpent = totalSpent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nonfinal")
    __obj.asInstanceOf[typings.trezorConnect.anon.Bytes]
  }
  
  inline def Error(error: String): typings.trezorConnect.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typings.trezorConnect.anon.Error]
  }
  
  inline def Fee(bytes: Double, fee: String, feePerByte: String, totalSpent: String, transaction: Inputs): typings.trezorConnect.anon.Fee = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], feePerByte = feePerByte.asInstanceOf[js.Any], totalSpent = totalSpent.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("final")
    __obj.asInstanceOf[typings.trezorConnect.anon.Fee]
  }
}
