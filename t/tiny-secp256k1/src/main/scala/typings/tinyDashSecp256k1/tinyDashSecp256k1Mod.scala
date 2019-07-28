package typings.tinyDashSecp256k1

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tiny-secp256k1", JSImport.Namespace)
@js.native
object tinyDashSecp256k1Mod extends js.Object {
  def isPoint(A: Buffer): Boolean = js.native
  def isPointCompressed(A: Buffer): Boolean = js.native
  def isPrivate(d: Buffer): Boolean = js.native
  def pointAdd(A: Buffer, B: Buffer): Buffer | Null = js.native
  def pointAdd(A: Buffer, B: Buffer, compressed: Boolean): Buffer | Null = js.native
  def pointAddScalar(A: Buffer, tweak: Buffer): Buffer | Null = js.native
  def pointAddScalar(A: Buffer, tweak: Buffer, compressed: Boolean): Buffer | Null = js.native
  def pointCompress(A: Buffer, compressed: Boolean): Buffer = js.native
  def pointFromScalar(d: Buffer): Buffer | Null = js.native
  def pointFromScalar(d: Buffer, compressed: Boolean): Buffer | Null = js.native
  def pointMultiply(A: Buffer, tweak: Buffer): Buffer | Null = js.native
  def pointMultiply(A: Buffer, tweak: Buffer, compressed: Boolean): Buffer | Null = js.native
  def privateAdd(d: Buffer, tweak: Buffer): Buffer | Null = js.native
  def privateSub(d: Buffer, tweak: Buffer): Buffer | Null = js.native
  def sign(message: Buffer, privateKey: Buffer): Buffer = js.native
  def verify(message: Buffer, publicKey: Buffer, signature: Buffer): Boolean = js.native
}

