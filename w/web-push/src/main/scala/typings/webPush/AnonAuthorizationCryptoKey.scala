package typings.webPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorizationCryptoKey extends js.Object {
  var Authorization: String
  var `Crypto-Key`: js.UndefOr[String] = js.undefined
}

object AnonAuthorizationCryptoKey {
  @scala.inline
  def apply(Authorization: String, `Crypto-Key`: String = null): AnonAuthorizationCryptoKey = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    if (`Crypto-Key` != null) __obj.updateDynamic("Crypto-Key")(`Crypto-Key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorizationCryptoKey]
  }
}

