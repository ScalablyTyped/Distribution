package typings
package tweetnaclLib.tweetnaclMod.naclNs.signNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait keyPair extends js.Object {
  def apply(): tweetnaclLib.tweetnaclMod.naclNs.SignKeyPair = js.native
  def fromSecretKey(secretKey: stdLib.Uint8Array): tweetnaclLib.tweetnaclMod.naclNs.SignKeyPair = js.native
  def fromSeed(secretKey: stdLib.Uint8Array): tweetnaclLib.tweetnaclMod.naclNs.SignKeyPair = js.native
}

