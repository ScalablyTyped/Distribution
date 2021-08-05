package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushTransactionParams
  extends StObject
     with CommonParams {
  
  var coin: String
  
  var tx: String
}
object PushTransactionParams {
  
  inline def apply(coin: String, tx: String): PushTransactionParams = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushTransactionParams]
  }
  
  extension [Self <: PushTransactionParams](x: Self) {
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setTx(value: String): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
