package typings.webPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorizationCryptoKey extends js.Object {
  var Authorization: String
  var `Crypto-Key`: String
}

object AnonAuthorizationCryptoKey {
  @scala.inline
  def apply(Authorization: String, `Crypto-Key`: String): AnonAuthorizationCryptoKey = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.updateDynamic("Crypto-Key")(`Crypto-Key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorizationCryptoKey]
  }
}

