package typings.tweetnacl.tweetnaclMod

import typings.std.Uint8Array
import typings.tweetnacl.tweetnaclMod.signNs.detached
import typings.tweetnacl.tweetnaclMod.signNs.keyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sign extends js.Object {
  @JSName("detached")
  var detached_Original: detached = js.native
  @JSName("keyPair")
  var keyPair_Original: keyPair = js.native
  val publicKeyLength: Double = js.native
  val secretKeyLength: Double = js.native
  val seedLength: Double = js.native
  val signatureLength: Double = js.native
  def apply(msg: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
  def detached(msg: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
  def keyPair(): SignKeyPair = js.native
  def open(signedMsg: Uint8Array, publicKey: Uint8Array): Uint8Array | Null = js.native
}

