package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginDetails extends js.Object {
  var address: java.lang.String
  var publicKey: java.lang.String
  var signature: java.lang.String
}

object LoginDetails {
  @scala.inline
  def apply(address: java.lang.String, publicKey: java.lang.String, signature: java.lang.String): LoginDetails = {
    val __obj = js.Dynamic.literal(address = address, publicKey = publicKey, signature = signature)
  
    __obj.asInstanceOf[LoginDetails]
  }
}

