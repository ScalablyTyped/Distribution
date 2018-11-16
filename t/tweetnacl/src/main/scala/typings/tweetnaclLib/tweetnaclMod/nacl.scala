package typings
package tweetnaclLib.tweetnaclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait nacl extends js.Object {
  @JSName("box")
  var box_Original: tweetnaclLib.tweetnaclMod.naclNs.box = js.native
  @JSName("hash")
  var hash_Original: tweetnaclLib.tweetnaclMod.naclNs.hash = js.native
  @JSName("scalarMult")
  var scalarMult_Original: tweetnaclLib.tweetnaclMod.naclNs.scalarMult = js.native
  @JSName("secretbox")
  var secretbox_Original: tweetnaclLib.tweetnaclMod.naclNs.secretbox = js.native
  @JSName("sign")
  var sign_Original: tweetnaclLib.tweetnaclMod.naclNs.sign = js.native
  def box(
    msg: stdLib.Uint8Array,
    nonce: stdLib.Uint8Array,
    publicKey: stdLib.Uint8Array,
    secretKey: stdLib.Uint8Array
  ): stdLib.Uint8Array = js.native
  def hash(msg: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  def randomBytes(n: scala.Double): stdLib.Uint8Array = js.native
  def scalarMult(n: stdLib.Uint8Array, p: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  def secretbox(msg: stdLib.Uint8Array, nonce: stdLib.Uint8Array, key: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  def setPRNG(fn: js.Function2[/* x */ stdLib.Uint8Array, /* n */ scala.Double, scala.Unit]): scala.Unit = js.native
  def sign(msg: stdLib.Uint8Array, secretKey: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  def verify(x: stdLib.Uint8Array, y: stdLib.Uint8Array): scala.Boolean = js.native
}

