package typings.tinySecp256k1

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tiny-secp256k1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPoint(A: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoint")(A.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPointCompressed(A: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPointCompressed")(A.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrivate(d: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrivate")(d.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pointAdd(A: Buffer, B: Buffer): Buffer | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAdd")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[Buffer | Null]
  inline def pointAdd(A: Buffer, B: Buffer, compressed: Boolean): Buffer | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAdd")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Buffer | Null]
  
  inline def pointAddScalar(A: Buffer, tweak: Buffer): Buffer | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAddScalar")(A.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[Buffer | Null]
  inline def pointAddScalar(A: Buffer, tweak: Buffer, compressed: Boolean): Buffer | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAddScalar")(A.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Buffer | Null]
  
  inline def pointCompress(A: Buffer, compressed: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pointCompress")(A.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def pointFromScalar(d: Buffer): Buffer | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("pointFromScalar")(d.asInstanceOf[js.Any]).asInstanceOf[Buffer | Null]
  inline def pointFromScalar(d: Buffer, compressed: Boolean): Buffer | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointFromScalar")(d.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Buffer | Null]
  
  inline def pointMultiply(A: Buffer, tweak: Buffer): Buffer | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointMultiply")(A.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[Buffer | Null]
  inline def pointMultiply(A: Buffer, tweak: Buffer, compressed: Boolean): Buffer | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointMultiply")(A.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Buffer | Null]
  
  inline def privateAdd(d: Buffer, tweak: Buffer): Buffer | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("privateAdd")(d.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[Buffer | Null]
  
  inline def privateSub(d: Buffer, tweak: Buffer): Buffer | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("privateSub")(d.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[Buffer | Null]
  
  inline def sign(message: Buffer, privateKey: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def verify(message: Buffer, publicKey: Buffer, signature: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
