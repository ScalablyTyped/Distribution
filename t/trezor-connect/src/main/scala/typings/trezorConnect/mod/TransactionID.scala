package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionID extends StObject {
  
  var txid: String
}
object TransactionID {
  
  @scala.inline
  def apply(txid: String): TransactionID = {
    val __obj = js.Dynamic.literal(txid = txid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionID]
  }
  
  @scala.inline
  implicit class TransactionIDMutableBuilder[Self <: TransactionID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTxid(value: String): Self = StObject.set(x, "txid", value.asInstanceOf[js.Any])
  }
}
