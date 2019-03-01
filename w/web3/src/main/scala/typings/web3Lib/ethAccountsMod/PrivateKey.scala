package typings
package web3Lib.ethAccountsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKey extends js.Object {
  var address: java.lang.String
  var crypto: web3Lib.Anon_Cipher
  var id: java.lang.String
  var version: scala.Double
}

object PrivateKey {
  @scala.inline
  def apply(
    address: java.lang.String,
    crypto: web3Lib.Anon_Cipher,
    id: java.lang.String,
    version: scala.Double
  ): PrivateKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("crypto")(crypto)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PrivateKey]
  }
}

