package typings.web3Eth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageProof extends js.Object {
  var key: String = js.native
  var proof: js.Array[String] = js.native
  var value: String = js.native
}

object StorageProof {
  @scala.inline
  def apply(key: String, proof: js.Array[String], value: String): StorageProof = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], proof = proof.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageProof]
  }
  @scala.inline
  implicit class StorageProofOps[Self <: StorageProof] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setProofVarargs(value: String*): Self = this.set("proof", js.Array(value :_*))
    @scala.inline
    def setProof(value: js.Array[String]): Self = this.set("proof", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

