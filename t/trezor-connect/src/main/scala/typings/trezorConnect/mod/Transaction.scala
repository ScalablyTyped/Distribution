package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends js.Object {
  
    // signer signatures
  var serializedTx: String = js.native
  
  var signatures: js.Array[String] = js.native
  
    // serialized transaction
  var txid: js.UndefOr[String] = js.native
}
object Transaction {
  
  @scala.inline
  def apply(serializedTx: String, signatures: js.Array[String]): Transaction = {
    val __obj = js.Dynamic.literal(serializedTx = serializedTx.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSerializedTx(value: String): Self = this.set("serializedTx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: String*): Self = this.set("signatures", js.Array(value :_*))
    
    @scala.inline
    def setSignatures(value: js.Array[String]): Self = this.set("signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxid(value: String): Self = this.set("txid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTxid: Self = this.set("txid", js.undefined)
  }
}
