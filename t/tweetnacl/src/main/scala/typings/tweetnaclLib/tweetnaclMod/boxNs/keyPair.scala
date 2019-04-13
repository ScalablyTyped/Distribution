package typings
package tweetnaclLib.tweetnaclMod.boxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait keyPair extends js.Object {
  def apply(): tweetnaclLib.tweetnaclMod.BoxKeyPair = js.native
  def fromSecretKey(secretKey: stdLib.Uint8Array): tweetnaclLib.tweetnaclMod.BoxKeyPair = js.native
}

