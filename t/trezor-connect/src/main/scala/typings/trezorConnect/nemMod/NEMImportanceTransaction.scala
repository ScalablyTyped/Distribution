package typings.trezorConnect.nemMod

import typings.trezorConnect.anon.Mode
import typings.trezorConnect.trezorConnectNumbers.`0x0801`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMImportanceTransaction
  extends StObject
     with TransactionCommon
     with NEMRegularTransaction {
  
  var importanceTransfer: Mode
  
  var `type`: `0x0801`
}
object NEMImportanceTransaction {
  
  inline def apply(deadline: Double, fee: Double, importanceTransfer: Mode, timeStamp: Double, version: Double): NEMImportanceTransaction = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], importanceTransfer = importanceTransfer.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x0801)
    __obj.asInstanceOf[NEMImportanceTransaction]
  }
  
  extension [Self <: NEMImportanceTransaction](x: Self) {
    
    inline def setImportanceTransfer(value: Mode): Self = StObject.set(x, "importanceTransfer", value.asInstanceOf[js.Any])
    
    inline def setType(value: `0x0801`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
