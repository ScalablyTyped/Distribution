package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.anon.Addressn
  - typings.trezorConnect.anon.Multisig
  - typings.trezorConnect.anon.Opreturndata
*/
trait TxOutputType extends StObject
object TxOutputType {
  
  inline def Addressn(address: String, address_n: scala.Unit, amount: UintType): typings.trezorConnect.anon.Addressn = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], script_type = "PAYTOADDRESS")
    __obj.asInstanceOf[typings.trezorConnect.anon.Addressn]
  }
  
  inline def Multisig(
    address: scala.Unit,
    address_n: js.Array[Double],
    amount: UintType,
    script_type: ChangeOutputScriptType
  ): typings.trezorConnect.anon.Multisig = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], script_type = script_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.Multisig]
  }
  
  inline def Opreturndata(address: scala.Unit, address_n: scala.Unit, op_return_data: String): typings.trezorConnect.anon.Opreturndata = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], address_n = address_n.asInstanceOf[js.Any], amount = "0", op_return_data = op_return_data.asInstanceOf[js.Any], script_type = "PAYTOOPRETURN")
    __obj.asInstanceOf[typings.trezorConnect.anon.Opreturndata]
  }
}
