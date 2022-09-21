package typings.trezorConnect.accountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.anon.Disabled
  - typings.trezorConnect.anon.FeePerByte
*/
trait SelectFeeLevel extends StObject
object SelectFeeLevel {
  
  inline def Disabled(name: String): typings.trezorConnect.anon.Disabled = {
    val __obj = js.Dynamic.literal(disabled = true, fee = "0", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.Disabled]
  }
  
  inline def FeePerByte(fee: String, feePerByte: String, minutes: Double, name: String, total: String): typings.trezorConnect.anon.FeePerByte = {
    val __obj = js.Dynamic.literal(fee = fee.asInstanceOf[js.Any], feePerByte = feePerByte.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.FeePerByte]
  }
}
