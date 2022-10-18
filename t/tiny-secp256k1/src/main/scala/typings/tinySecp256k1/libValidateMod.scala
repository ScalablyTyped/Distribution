package typings.tinySecp256k1

import typings.tinySecp256k1.tinySecp256k1Ints.`0`
import typings.tinySecp256k1.tinySecp256k1Ints.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libValidateMod {
  
  @JSImport("tiny-secp256k1/lib/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tiny-secp256k1/lib/validate", "EXTRA_DATA_SIZE")
  @js.native
  val EXTRA_DATA_SIZE: /* 32 */ Double = js.native
  
  @JSImport("tiny-secp256k1/lib/validate", "HASH_SIZE")
  @js.native
  val HASH_SIZE: /* 32 */ Double = js.native
  
  @JSImport("tiny-secp256k1/lib/validate", "PRIVATE_KEY_SIZE")
  @js.native
  val PRIVATE_KEY_SIZE: /* 32 */ Double = js.native
  
  @JSImport("tiny-secp256k1/lib/validate", "PUBLIC_KEY_COMPRESSED_SIZE")
  @js.native
  val PUBLIC_KEY_COMPRESSED_SIZE: /* 33 */ Double = js.native
  
  @JSImport("tiny-secp256k1/lib/validate", "PUBLIC_KEY_UNCOMPRESSED_SIZE")
  @js.native
  val PUBLIC_KEY_UNCOMPRESSED_SIZE: /* 65 */ Double = js.native
  
  @JSImport("tiny-secp256k1/lib/validate", "SIGNATURE_SIZE")
  @js.native
  val SIGNATURE_SIZE: /* 64 */ Double = js.native
  
  @JSImport("tiny-secp256k1/lib/validate", "TWEAK_SIZE")
  @js.native
  val TWEAK_SIZE: /* 32 */ Double = js.native
  
  @JSImport("tiny-secp256k1/lib/validate", "X_ONLY_PUBLIC_KEY_SIZE")
  @js.native
  val X_ONLY_PUBLIC_KEY_SIZE: /* 32 */ Double = js.native
  
  inline def isDERPoint(p: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDERPoint")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPoint(p: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoint")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPointCompressed(p: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPointCompressed")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrivate(x: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrivate")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isXOnlyPoint(p: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXOnlyPoint")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isZero(x: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isZero")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateExtraData(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateExtraData")().asInstanceOf[Unit]
  inline def validateExtraData(e: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateExtraData")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateHash(h: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateHash")(h.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateParity(p: `1` | `0`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateParity")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validatePoint(p: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePoint")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validatePrivate(d: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePrivate")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateSignature(signature: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSignature")(signature.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateSignatureCustom(validatorFn: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSignatureCustom")(validatorFn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateSignatureNonzeroRS(signature: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSignatureNonzeroRS")(signature.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateSigrPMinusN(signature: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSigrPMinusN")(signature.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateTweak(tweak: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTweak")(tweak.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateXOnlyPoint(p: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateXOnlyPoint")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
