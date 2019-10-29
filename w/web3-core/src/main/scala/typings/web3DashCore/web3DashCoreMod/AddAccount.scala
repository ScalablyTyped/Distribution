package typings.web3DashCore.web3DashCoreMod

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
    val __obj = js.Dynamic.literal(address = address, privateKey = privateKey)
  
    __obj.asInstanceOf[AddAccount]
  }
}

