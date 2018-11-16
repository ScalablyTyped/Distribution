package typings
package tinyDashSecp256k1Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tiny-secp256k1", JSImport.Namespace)
@js.native
object tinyDashSecp256k1Mod extends js.Object {
  def isPoint(A: nodeLib.Buffer): scala.Boolean = js.native
  def isPointCompressed(A: nodeLib.Buffer): scala.Boolean = js.native
  def isPrivate(d: nodeLib.Buffer): scala.Boolean = js.native
  def pointAdd(A: nodeLib.Buffer, B: nodeLib.Buffer): nodeLib.Buffer | scala.Null = js.native
  def pointAdd(A: nodeLib.Buffer, B: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer | scala.Null = js.native
  def pointAddScalar(A: nodeLib.Buffer, tweak: nodeLib.Buffer): nodeLib.Buffer | scala.Null = js.native
  def pointAddScalar(A: nodeLib.Buffer, tweak: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer | scala.Null = js.native
  def pointCompress(A: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer = js.native
  def pointFromScalar(d: nodeLib.Buffer): nodeLib.Buffer | scala.Null = js.native
  def pointFromScalar(d: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer | scala.Null = js.native
  def pointMultiply(A: nodeLib.Buffer, tweak: nodeLib.Buffer): nodeLib.Buffer | scala.Null = js.native
  def pointMultiply(A: nodeLib.Buffer, tweak: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer | scala.Null = js.native
  def privateAdd(d: nodeLib.Buffer, tweak: nodeLib.Buffer): nodeLib.Buffer | scala.Null = js.native
  def privateSub(d: nodeLib.Buffer, tweak: nodeLib.Buffer): nodeLib.Buffer | scala.Null = js.native
  def sign(message: nodeLib.Buffer, privateKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  def verify(message: nodeLib.Buffer, publicKey: nodeLib.Buffer, signature: nodeLib.Buffer): scala.Boolean = js.native
}

