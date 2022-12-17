package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.anon.CommonTxInputTypeaddressn
  - typings.trezorConnect.anon.CommonTxInputTypeaddressnAddressn
*/
trait TxInputType extends StObject
object TxInputType {
  
  inline def CommonTxInputTypeaddressn(address_n: js.Array[Double], amount: UintType, prev_hash: String, prev_index: Double): typings.trezorConnect.anon.CommonTxInputTypeaddressn = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], prev_hash = prev_hash.asInstanceOf[js.Any], prev_index = prev_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.CommonTxInputTypeaddressn]
  }
  
  inline def CommonTxInputTypeaddressnAddressn(address_n: scala.Unit, amount: UintType, prev_hash: String, prev_index: Double): typings.trezorConnect.anon.CommonTxInputTypeaddressnAddressn = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], prev_hash = prev_hash.asInstanceOf[js.Any], prev_index = prev_index.asInstanceOf[js.Any], script_type = "EXTERNAL")
    __obj.asInstanceOf[typings.trezorConnect.anon.CommonTxInputTypeaddressnAddressn]
  }
}
