package typings.tweetnacl.tweetnaclMod.signNs

import typings.std.Uint8Array
import typings.tweetnacl.tweetnaclMod.SignKeyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait keyPair extends js.Object {
  def apply(): SignKeyPair = js.native
  def fromSecretKey(secretKey: Uint8Array): SignKeyPair = js.native
  def fromSeed(secretKey: Uint8Array): SignKeyPair = js.native
}

