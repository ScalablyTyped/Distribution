package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptBackendTransactionsMod.RippleLibTransaction
import typings.trezorConnect.libTypescriptBackendTransactionsMod.TypedRawTransaction
import typings.trezorConnect.trezorConnectStrings.ripple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxType
  extends StObject
     with TypedRawTransaction {
  
  var tx: RippleLibTransaction
  
  var `type`: ripple
}
object TxType {
  
  inline def apply(tx: RippleLibTransaction): TxType = {
    val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ripple")
    __obj.asInstanceOf[TxType]
  }
  
  extension [Self <: TxType](x: Self) {
    
    inline def setTx(value: RippleLibTransaction): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
    
    inline def setType(value: ripple): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
