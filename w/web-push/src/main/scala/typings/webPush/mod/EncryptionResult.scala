package typings.webPush.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionResult extends js.Object {
  var cipherText: Buffer = js.native
  var localPublicKey: String = js.native
  var salt: String = js.native
}

object EncryptionResult {
  @scala.inline
  def apply(cipherText: Buffer, localPublicKey: String, salt: String): EncryptionResult = {
    val __obj = js.Dynamic.literal(cipherText = cipherText.asInstanceOf[js.Any], localPublicKey = localPublicKey.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionResult]
  }
  @scala.inline
  implicit class EncryptionResultOps[Self <: EncryptionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCipherText(value: Buffer): Self = this.set("cipherText", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalPublicKey(value: String): Self = this.set("localPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSalt(value: String): Self = this.set("salt", value.asInstanceOf[js.Any])
  }
  
}

