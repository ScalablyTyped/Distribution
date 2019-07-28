package typings.webDashPush.webDashPushMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionResult extends js.Object {
  var cipherText: Buffer
  var localPublicKey: String
  var salt: String
}

object EncryptionResult {
  @scala.inline
  def apply(cipherText: Buffer, localPublicKey: String, salt: String): EncryptionResult = {
    val __obj = js.Dynamic.literal(cipherText = cipherText, localPublicKey = localPublicKey, salt = salt)
  
    __obj.asInstanceOf[EncryptionResult]
  }
}

