package typings.webPush.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationCryptoKey extends js.Object {
  var Authorization: String
  var `Crypto-Key`: js.UndefOr[String] = js.undefined
}

object AuthorizationCryptoKey {
  @scala.inline
  def apply(Authorization: String, `Crypto-Key`: String = null): AuthorizationCryptoKey = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    if (`Crypto-Key` != null) __obj.updateDynamic("Crypto-Key")(`Crypto-Key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationCryptoKey]
  }
}

