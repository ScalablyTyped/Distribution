package typings
package tweetnaclLib.tweetnaclMod.naclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait box extends js.Object {
  @JSName("keyPair")
  var keyPair_Original: tweetnaclLib.tweetnaclMod.naclNs.boxNs.keyPair = js.native
  val nonceLength: scala.Double = js.native
  @JSName("open")
  var open_Original: tweetnaclLib.tweetnaclMod.naclNs.boxNs.open = js.native
  val overheadLength: scala.Double = js.native
  val publicKeyLength: scala.Double = js.native
  val secretKeyLength: scala.Double = js.native
  val sharedKeyLength: scala.Double = js.native
  def apply(
    msg: stdLib.Uint8Array,
    nonce: stdLib.Uint8Array,
    publicKey: stdLib.Uint8Array,
    secretKey: stdLib.Uint8Array
  ): stdLib.Uint8Array = js.native
  def after(msg: stdLib.Uint8Array, nonce: stdLib.Uint8Array, key: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  def before(publicKey: stdLib.Uint8Array, secretKey: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  def keyPair(): BoxKeyPair = js.native
  def open(
    msg: stdLib.Uint8Array,
    nonce: stdLib.Uint8Array,
    publicKey: stdLib.Uint8Array,
    secretKey: stdLib.Uint8Array
  ): stdLib.Uint8Array | tweetnaclLib.tweetnaclLibNumbers.`false` = js.native
}

