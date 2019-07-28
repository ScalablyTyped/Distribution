package typings.tweetnacl.tweetnaclMod.signNs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait detached extends js.Object {
  def apply(msg: Uint8Array, secretKey: Uint8Array): Uint8Array = js.native
  def verify(msg: Uint8Array, sig: Uint8Array, publicKey: Uint8Array): Boolean = js.native
}

