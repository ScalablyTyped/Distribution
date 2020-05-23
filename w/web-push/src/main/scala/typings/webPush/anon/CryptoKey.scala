package typings.webPush.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKey extends js.Object {
  var Authorization: String
  var `Crypto-Key`: String
}

object CryptoKey {
  @scala.inline
  def apply(Authorization: String, `Crypto-Key`: String): CryptoKey = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.updateDynamic("Crypto-Key")(`Crypto-Key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
}

