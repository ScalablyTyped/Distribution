package typings.tweetnacl.tweetnaclMod

import typings.std.Uint8Array
import typings.tweetnacl.tweetnaclBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait secretbox extends js.Object {
  val keyLength: Double = js.native
  val nonceLength: Double = js.native
  val overheadLength: Double = js.native
  def apply(msg: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def open(box: Uint8Array, nonce: Uint8Array, key: Uint8Array): Uint8Array | `false` = js.native
}

