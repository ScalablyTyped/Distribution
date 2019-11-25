package typings.webDashPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorizationCryptoKeyString extends js.Object {
  var Authorization: String
  var `Crypto-Key`: js.UndefOr[String] = js.undefined
}

object Anon_AuthorizationCryptoKeyString {
  @scala.inline
  def apply(Authorization: String, `Crypto-Key`: String = null): Anon_AuthorizationCryptoKeyString = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    if (`Crypto-Key` != null) __obj.updateDynamic("Crypto-Key")(`Crypto-Key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthorizationCryptoKeyString]
  }
}

