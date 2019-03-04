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
    val __obj = js.Dynamic.literal(Authorization = Authorization)
    __obj.updateDynamic("Crypto-Key")(`Crypto-Key`)
    __obj.asInstanceOf[Anon_AuthorizationCryptoKey]
  }
}

