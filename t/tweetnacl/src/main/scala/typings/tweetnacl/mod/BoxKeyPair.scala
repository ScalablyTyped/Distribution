package typings.tweetnacl.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxKeyPair extends js.Object {
  var publicKey: Uint8Array
  var secretKey: Uint8Array
}

object BoxKeyPair {
  @scala.inline
  def apply(publicKey: Uint8Array, secretKey: Uint8Array): BoxKeyPair = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoxKeyPair]
  }
}

