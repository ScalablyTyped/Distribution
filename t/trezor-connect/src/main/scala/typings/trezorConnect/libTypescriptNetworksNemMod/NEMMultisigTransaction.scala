package typings.trezorConnect.libTypescriptNetworksNemMod

import typings.trezorConnect.trezorConnectInts.`0x0102`
import typings.trezorConnect.trezorConnectInts.`0x1002`
import typings.trezorConnect.trezorConnectInts.`0x1004`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMMultisigTransaction
  extends StObject
     with TransactionCommon
     with NEMTransaction {
  
  var otherTrans: NEMRegularTransaction
  
  var `type`: `0x0102` | `0x1002` | `0x1004`
}
object NEMMultisigTransaction {
  
  inline def apply(
    deadline: Double,
    fee: Double,
    otherTrans: NEMRegularTransaction,
    timeStamp: Double,
    `type`: `0x0102` | `0x1002` | `0x1004`,
    version: Double
  ): NEMMultisigTransaction = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], otherTrans = otherTrans.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMMultisigTransaction]
  }
  
  extension [Self <: NEMMultisigTransaction](x: Self) {
    
    inline def setOtherTrans(value: NEMRegularTransaction): Self = StObject.set(x, "otherTrans", value.asInstanceOf[js.Any])
    
    inline def setType(value: `0x0102` | `0x1002` | `0x1004`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
