package typings
package tweetnaclLib.tweetnaclMod.naclNs.boxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait keyPair extends js.Object {
  def apply(): tweetnaclLib.tweetnaclMod.naclNs.BoxKeyPair = js.native
  def fromSecretKey(secretKey: stdLib.Uint8Array): tweetnaclLib.tweetnaclMod.naclNs.BoxKeyPair = js.native
}

