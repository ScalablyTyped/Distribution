package typings.webPush.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(userPublicKey: String, userAuth: String, payload: String, contentEncoding: ContentEncoding): EncryptionResult = js.native
  def apply(userPublicKey: String, userAuth: String, payload: Buffer, contentEncoding: ContentEncoding): EncryptionResult = js.native
}

