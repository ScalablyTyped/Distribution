package typings
package tweetnaclLib.tweetnaclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sign extends js.Object {
  @JSName("detached")
  var detached_Original: tweetnaclLib.tweetnaclMod.signNs.detached = js.native
  @JSName("keyPair")
  var keyPair_Original: tweetnaclLib.tweetnaclMod.signNs.keyPair = js.native
  val publicKeyLength: scala.Double = js.native
  val secretKeyLength: scala.Double = js.native
  val seedLength: scala.Double = js.native
  val signatureLength: scala.Double = js.native
  def apply(msg: stdLib.Uint8Array, secretKey: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  def detached(msg: stdLib.Uint8Array, secretKey: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  def keyPair(): SignKeyPair = js.native
  def open(signedMsg: stdLib.Uint8Array, publicKey: stdLib.Uint8Array): stdLib.Uint8Array | scala.Null = js.native
}

