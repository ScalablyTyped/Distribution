package typings.web3Eth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProof extends js.Object {
  var accountProof: js.Array[String]
  var address: String
  var balance: String
  var codeHash: String
  var nonce: String
  var storageHash: String
  var storageProof: js.Array[StorageProof]
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
}

