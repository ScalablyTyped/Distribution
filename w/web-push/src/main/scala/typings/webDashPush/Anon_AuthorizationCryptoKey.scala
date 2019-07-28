package typings.webDashPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorizationCryptoKey extends js.Object {
  var Authorization: String
  var `Crypto-Key`: String
}

object Anon_AuthorizationCryptoKey {
  @scala.inline
  def apply(Authorization: String, `Crypto-Key`: String): Anon_AuthorizationCryptoKey = {
    val __obj = js.Dynamic.literal(Authorization = Authorization)
    __obj.updateDynamic("Crypto-Key")(`Crypto-Key`)
    __obj.asInstanceOf[Anon_AuthorizationCryptoKey]
  }
}

