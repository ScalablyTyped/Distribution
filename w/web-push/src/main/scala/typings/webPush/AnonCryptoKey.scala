package typings.webPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCryptoKey extends js.Object {
  var Authorization: String
  var `Crypto-Key`: String
}

object AnonCryptoKey {
  @scala.inline
  def apply(Authorization: String, `Crypto-Key`: String): AnonCryptoKey = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.updateDynamic("Crypto-Key")(`Crypto-Key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCryptoKey]
  }
}

