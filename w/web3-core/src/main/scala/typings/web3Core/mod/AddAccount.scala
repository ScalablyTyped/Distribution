package typings.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAccount extends js.Object {
  var address: String = js.native
  var privateKey: String = js.native
}

object AddAccount {
  @scala.inline
  def apply(address: String, privateKey: String): AddAccount = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAccount]
  }
  @scala.inline
  implicit class AddAccountOps[Self <: AddAccount] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
  }
  
}

