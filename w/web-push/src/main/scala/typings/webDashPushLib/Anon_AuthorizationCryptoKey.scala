package typings
package webDashPushLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorizationCryptoKey extends js.Object {
  var Authorization: java.lang.String
  var `Crypto-Key`: java.lang.String
}

object Anon_AuthorizationCryptoKey {
  @scala.inline
  def apply(Authorization: java.lang.String, `Crypto-Key`: java.lang.String): Anon_AuthorizationCryptoKey = {
    val __obj = js.Dynamic.literal(`Crypto-Key` = `Crypto-Key`)
    __obj.updateDynamic("Authorization")(Authorization)
    __obj.asInstanceOf[Anon_AuthorizationCryptoKey]
  }
}

