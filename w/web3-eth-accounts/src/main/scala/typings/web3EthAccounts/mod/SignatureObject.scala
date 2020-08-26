package typings.web3EthAccounts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureObject extends js.Object {
  var messageHash: String = js.native
  var r: String = js.native
  var s: String = js.native
  var v: String = js.native
}

object SignatureObject {
  @scala.inline
  def apply(messageHash: String, r: String, s: String, v: String): SignatureObject = {
    val __obj = js.Dynamic.literal(messageHash = messageHash.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureObject]
  }
  @scala.inline
  implicit class SignatureObjectOps[Self <: SignatureObject] (val x: Self) extends AnyVal {
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
    def setMessageHash(value: String): Self = this.set("messageHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: String): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: String): Self = this.set("v", value.asInstanceOf[js.Any])
  }
  
}

