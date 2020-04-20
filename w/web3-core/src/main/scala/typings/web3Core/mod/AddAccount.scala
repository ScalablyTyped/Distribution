package typings.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddAccount extends js.Object {
  var address: String
  var privateKey: String
}

object AddAccount {
  @scala.inline
  def apply(address: String, privateKey: String): AddAccount = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAccount]
  }
}

