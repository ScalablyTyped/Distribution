package typings.web3Eth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageProof extends js.Object {
  var key: String
  var proof: js.Array[String]
  var value: String
}

object StorageProof {
  @scala.inline
  def apply(key: String, proof: js.Array[String], value: String): StorageProof = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], proof = proof.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StorageProof]
  }
}

