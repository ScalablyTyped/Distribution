package typings.tweetnacl.tweetnaclMod.boxNs

import typings.std.Uint8Array
import typings.tweetnacl.tweetnaclMod.BoxKeyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait keyPair extends js.Object {
  def apply(): BoxKeyPair = js.native
  def fromSecretKey(secretKey: Uint8Array): BoxKeyPair = js.native
}

