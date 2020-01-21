package typings.tweetnacl.mod

import typings.std.Uint8Array
import typings.tweetnacl.mod.box.keyPair
import typings.tweetnacl.mod.box.open
import typings.tweetnacl.tweetnaclBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait box extends js.Object {
  @JSName("keyPair")
  var keyPair_Original: keyPair = js.native
  val nonceLength: Double = js.native
  @JSName("open")
  var open_Original: open = js.native
  val overheadLength: Double = js.native
  val publicKeyLength: Double = js.native
  val secretKeyLength: Double = js.native
  val sharedKeyLength: Double = js.native
  def apply(msg: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
  def after(msg: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def before(publicKey: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
  def keyPair(): BoxKeyPair = js.native
  def open(msg: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, secretKey: Uint8Array): Uint8Array | `false` = js.native
}

@JSImport("tweetnacl", "box")
@js.native
object box extends js.Object {
  @js.native
  trait keyPair extends js.Object {
    def apply(): BoxKeyPair = js.native
    def fromSecretKey(secretKey: Uint8Array): BoxKeyPair = js.native
  }
  
  @js.native
  trait open extends js.Object {
    def apply(msg: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, secretKey: Uint8Array): Uint8Array | `false` = js.native
    def after(box: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array | `false` = js.native
  }
  
}

