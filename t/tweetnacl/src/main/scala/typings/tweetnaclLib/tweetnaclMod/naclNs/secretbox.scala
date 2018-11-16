package typings
package tweetnaclLib.tweetnaclMod.naclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait secretbox extends js.Object {
  val keyLength: scala.Double = js.native
  val nonceLength: scala.Double = js.native
  val overheadLength: scala.Double = js.native
  def apply(msg: stdLib.Uint8Array, nonce: stdLib.Uint8Array, key: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  def open(box: stdLib.Uint8Array, nonce: stdLib.Uint8Array, key: stdLib.Uint8Array): stdLib.Uint8Array | tweetnaclLib.tweetnaclLibNumbers.`false` = js.native
}

