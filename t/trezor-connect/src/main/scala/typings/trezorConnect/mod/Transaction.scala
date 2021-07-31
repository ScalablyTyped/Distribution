package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction extends StObject {
  
  // signer signatures
  var serializedTx: String
  
  var signatures: js.Array[String]
  
  // serialized transaction
  var txid: js.UndefOr[String] = js.undefined
}
object Transaction {
  
  @scala.inline
  def apply(serializedTx: String, signatures: js.Array[String]): Transaction = {
    val __obj = js.Dynamic.literal(serializedTx = serializedTx.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit class TransactionMutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerializedTx(value: String): Self = StObject.set(x, "serializedTx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatures(value: js.Array[String]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: String*): Self = StObject.set(x, "signatures", js.Array(value :_*))
    
    @scala.inline
    def setTxid(value: String): Self = StObject.set(x, "txid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxidUndefined: Self = StObject.set(x, "txid", js.undefined)
  }
}
