package typings.trezorDashConnect.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginDetails extends js.Object {
  var address: String
  var publicKey: String
  var signature: String
}

object LoginDetails {
  @scala.inline
  def apply(address: String, publicKey: String, signature: String): LoginDetails = {
    val __obj = js.Dynamic.literal(address = address, publicKey = publicKey, signature = signature)
  
    __obj.asInstanceOf[LoginDetails]
  }
}

