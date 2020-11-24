package typings.web3Eth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProof extends js.Object {
  
  var accountProof: js.Array[String] = js.native
  
  var address: String = js.native
  
  var balance: String = js.native
  
  var codeHash: String = js.native
  
  var nonce: String = js.native
  
  var storageHash: String = js.native
  
  var storageProof: js.Array[StorageProof] = js.native
}
object GetProof {
  
  @scala.inline
  def apply(
    accountProof: js.Array[String],
    address: String,
    balance: String,
    codeHash: String,
    nonce: String,
    storageHash: String,
    storageProof: js.Array[StorageProof]
  ): GetProof = {
    val __obj = js.Dynamic.literal(accountProof = accountProof.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], codeHash = codeHash.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], storageHash = storageHash.asInstanceOf[js.Any], storageProof = storageProof.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProof]
  }
  
  @scala.inline
  implicit class GetProofOps[Self <: GetProof] (val x: Self) extends AnyVal {
    
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
    def setAccountProofVarargs(value: String*): Self = this.set("accountProof", js.Array(value :_*))
    
    @scala.inline
    def setAccountProof(value: js.Array[String]): Self = this.set("accountProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalance(value: String): Self = this.set("balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeHash(value: String): Self = this.set("codeHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageHash(value: String): Self = this.set("storageHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageProofVarargs(value: StorageProof*): Self = this.set("storageProof", js.Array(value :_*))
    
    @scala.inline
    def setStorageProof(value: js.Array[StorageProof]): Self = this.set("storageProof", value.asInstanceOf[js.Any])
  }
}
