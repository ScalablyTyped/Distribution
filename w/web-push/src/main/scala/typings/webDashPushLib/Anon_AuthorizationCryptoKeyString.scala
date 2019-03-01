package typings
package webDashPushLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorizationCryptoKeyString extends js.Object {
  var Authorization: java.lang.String
  var `Crypto-Key`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AuthorizationCryptoKeyString {
  @scala.inline
  def apply(Authorization: java.lang.String, `Crypto-Key`: java.lang.String = null): Anon_AuthorizationCryptoKeyString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Authorization")(Authorization)
    if (`Crypto-Key` != null) __obj.updateDynamic("Crypto-Key")(`Crypto-Key`)
    __obj.asInstanceOf[Anon_AuthorizationCryptoKeyString]
  }
}

