package typings.tinySecp256k1

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tiny-secp256k1", "isPoint")
  @js.native
  def isPoint(A: Buffer): Boolean = js.native
  
  @JSImport("tiny-secp256k1", "isPointCompressed")
  @js.native
  def isPointCompressed(A: Buffer): Boolean = js.native
  
  @JSImport("tiny-secp256k1", "isPrivate")
  @js.native
  def isPrivate(d: Buffer): Boolean = js.native
  
  @JSImport("tiny-secp256k1", "pointAdd")
  @js.native
  def pointAdd(A: Buffer, B: Buffer): Buffer | Null = js.native
  @JSImport("tiny-secp256k1", "pointAdd")
  @js.native
  def pointAdd(A: Buffer, B: Buffer, compressed: Boolean): Buffer | Null = js.native
  
  @JSImport("tiny-secp256k1", "pointAddScalar")
  @js.native
  def pointAddScalar(A: Buffer, tweak: Buffer): Buffer | Null = js.native
  @JSImport("tiny-secp256k1", "pointAddScalar")
  @js.native
  def pointAddScalar(A: Buffer, tweak: Buffer, compressed: Boolean): Buffer | Null = js.native
  
  @JSImport("tiny-secp256k1", "pointCompress")
  @js.native
  def pointCompress(A: Buffer, compressed: Boolean): Buffer = js.native
  
  @JSImport("tiny-secp256k1", "pointFromScalar")
  @js.native
  def pointFromScalar(d: Buffer): Buffer | Null = js.native
  @JSImport("tiny-secp256k1", "pointFromScalar")
  @js.native
  def pointFromScalar(d: Buffer, compressed: Boolean): Buffer | Null = js.native
  
  @JSImport("tiny-secp256k1", "pointMultiply")
  @js.native
  def pointMultiply(A: Buffer, tweak: Buffer): Buffer | Null = js.native
  @JSImport("tiny-secp256k1", "pointMultiply")
  @js.native
  def pointMultiply(A: Buffer, tweak: Buffer, compressed: Boolean): Buffer | Null = js.native
  
  @JSImport("tiny-secp256k1", "privateAdd")
  @js.native
  def privateAdd(d: Buffer, tweak: Buffer): Buffer | Null = js.native
  
  @JSImport("tiny-secp256k1", "privateSub")
  @js.native
  def privateSub(d: Buffer, tweak: Buffer): Buffer | Null = js.native
  
  @JSImport("tiny-secp256k1", "sign")
  @js.native
  def sign(message: Buffer, privateKey: Buffer): Buffer = js.native
  
  @JSImport("tiny-secp256k1", "verify")
  @js.native
  def verify(message: Buffer, publicKey: Buffer, signature: Buffer): Boolean = js.native
}
