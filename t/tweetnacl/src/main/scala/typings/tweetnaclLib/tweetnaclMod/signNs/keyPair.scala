package typings
package tweetnaclLib.tweetnaclMod.signNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait keyPair extends js.Object {
  def apply(): tweetnaclLib.tweetnaclMod.SignKeyPair = js.native
  def fromSecretKey(secretKey: stdLib.Uint8Array): tweetnaclLib.tweetnaclMod.SignKeyPair = js.native
  def fromSeed(secretKey: stdLib.Uint8Array): tweetnaclLib.tweetnaclMod.SignKeyPair = js.native
}

