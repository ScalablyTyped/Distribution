package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionID extends StObject {
  
  var txid: String
}
object TransactionID {
  
  inline def apply(txid: String): TransactionID = {
    val __obj = js.Dynamic.literal(txid = txid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionID]
  }
  
  extension [Self <: TransactionID](x: Self) {
    
    inline def setTxid(value: String): Self = StObject.set(x, "txid", value.asInstanceOf[js.Any])
  }
}
