package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushTransactionParams extends CommonParams {
  
  var coin: String = js.native
  
  var tx: String = js.native
}
object PushTransactionParams {
  
  @scala.inline
  def apply(coin: String, tx: String): PushTransactionParams = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushTransactionParams]
  }
  
  @scala.inline
  implicit class PushTransactionParamsMutableBuilder[Self <: PushTransactionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTx(value: String): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
