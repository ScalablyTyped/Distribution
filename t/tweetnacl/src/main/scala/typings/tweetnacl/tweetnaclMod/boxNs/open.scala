package typings.tweetnacl.tweetnaclMod.boxNs

import typings.std.Uint8Array
import typings.tweetnacl.tweetnaclNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait open extends js.Object {
  def apply(msg: Uint8Array, nonce: Uint8Array, publicKey: Uint8Array, secretKey: Uint8Array): Uint8Array | `false` = js.native
  def after(box: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array | `false` = js.native
}

