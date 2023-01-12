package typings.tinySecp256k1

import typings.tinySecp256k1.tinySecp256k1Ints.`0`
import typings.tinySecp256k1.tinySecp256k1Ints.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tiny-secp256k1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializeContext(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__initializeContext")().asInstanceOf[Unit]
  
  inline def isPoint(p: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoint")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPointCompressed(p: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPointCompressed")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrivate(d: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrivate")(d.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isXOnlyPoint(p: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXOnlyPoint")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pointAdd(pA: js.typedarray.Uint8Array, pB: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAdd")(pA.asInstanceOf[js.Any], pB.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]
  inline def pointAdd(pA: js.typedarray.Uint8Array, pB: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAdd")(pA.asInstanceOf[js.Any], pB.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]
  
  inline def pointAddScalar(p: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAddScalar")(p.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]
  inline def pointAddScalar(p: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAddScalar")(p.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]
  
  inline def pointCompress(p: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("pointCompress")(p.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def pointCompress(p: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("pointCompress")(p.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def pointFromScalar(d: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("pointFromScalar")(d.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | Null]
  inline def pointFromScalar(d: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointFromScalar")(d.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]
  
  inline def pointMultiply(p: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointMultiply")(p.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]
  inline def pointMultiply(p: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointMultiply")(p.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]
  
  inline def privateAdd(d: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("privateAdd")(d.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]
  
  inline def privateNegate(d: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("privateNegate")(d.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def privateSub(d: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("privateSub")(d.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]
  
  inline def recover(h: js.typedarray.Uint8Array, signature: js.typedarray.Uint8Array, recoveryId: RecoveryIdType): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("recover")(h.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], recoveryId.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]
  inline def recover(
    h: js.typedarray.Uint8Array,
    signature: js.typedarray.Uint8Array,
    recoveryId: RecoveryIdType,
    compressed: Boolean
  ): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("recover")(h.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], recoveryId.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]
  
  inline def sign(h: js.typedarray.Uint8Array, d: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(h.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def sign(h: js.typedarray.Uint8Array, d: js.typedarray.Uint8Array, e: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(h.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def signRecoverable(h: js.typedarray.Uint8Array, d: js.typedarray.Uint8Array): RecoverableSignature = (^.asInstanceOf[js.Dynamic].applyDynamic("signRecoverable")(h.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[RecoverableSignature]
  inline def signRecoverable(h: js.typedarray.Uint8Array, d: js.typedarray.Uint8Array, e: js.typedarray.Uint8Array): RecoverableSignature = (^.asInstanceOf[js.Dynamic].applyDynamic("signRecoverable")(h.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[RecoverableSignature]
  
  inline def signSchnorr(h: js.typedarray.Uint8Array, d: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("signSchnorr")(h.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def signSchnorr(h: js.typedarray.Uint8Array, d: js.typedarray.Uint8Array, e: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("signSchnorr")(h.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def verify(h: js.typedarray.Uint8Array, Q: js.typedarray.Uint8Array, signature: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(h.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(
    h: js.typedarray.Uint8Array,
    Q: js.typedarray.Uint8Array,
    signature: js.typedarray.Uint8Array,
    strict: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(h.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def verifySchnorr(h: js.typedarray.Uint8Array, Q: js.typedarray.Uint8Array, signature: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySchnorr")(h.asInstanceOf[js.Any], Q.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def xOnlyPointAddTweak(p: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): XOnlyPointAddTweakResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("xOnlyPointAddTweak")(p.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[XOnlyPointAddTweakResult | Null]
  
  inline def xOnlyPointAddTweakCheck(
    point: js.typedarray.Uint8Array,
    tweak: js.typedarray.Uint8Array,
    resultToCheck: js.typedarray.Uint8Array
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("xOnlyPointAddTweakCheck")(point.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], resultToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def xOnlyPointAddTweakCheck(
    point: js.typedarray.Uint8Array,
    tweak: js.typedarray.Uint8Array,
    resultToCheck: js.typedarray.Uint8Array,
    tweakParity: TweakParity
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("xOnlyPointAddTweakCheck")(point.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], resultToCheck.asInstanceOf[js.Any], tweakParity.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def xOnlyPointFromPoint(p: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("xOnlyPointFromPoint")(p.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def xOnlyPointFromScalar(d: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("xOnlyPointFromScalar")(d.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  trait RecoverableSignature extends StObject {
    
    var recoveryId: RecoveryIdType
    
    var signature: js.typedarray.Uint8Array
  }
  object RecoverableSignature {
    
    inline def apply(recoveryId: RecoveryIdType, signature: js.typedarray.Uint8Array): RecoverableSignature = {
      val __obj = js.Dynamic.literal(recoveryId = recoveryId.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecoverableSignature]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecoverableSignature] (val x: Self) extends AnyVal {
      
      inline def setRecoveryId(value: RecoveryIdType): Self = StObject.set(x, "recoveryId", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tinySecp256k1.tinySecp256k1Ints.`0`
    - typings.tinySecp256k1.tinySecp256k1Ints.`1`
    - typings.tinySecp256k1.tinySecp256k1Ints.`2`
    - typings.tinySecp256k1.tinySecp256k1Ints.`3`
  */
  trait RecoveryIdType extends StObject
  object RecoveryIdType {
    
    inline def `0`: typings.tinySecp256k1.tinySecp256k1Ints.`0` = 0.asInstanceOf[typings.tinySecp256k1.tinySecp256k1Ints.`0`]
    
    inline def `1`: typings.tinySecp256k1.tinySecp256k1Ints.`1` = 1.asInstanceOf[typings.tinySecp256k1.tinySecp256k1Ints.`1`]
    
    inline def `2`: typings.tinySecp256k1.tinySecp256k1Ints.`2` = 2.asInstanceOf[typings.tinySecp256k1.tinySecp256k1Ints.`2`]
    
    inline def `3`: typings.tinySecp256k1.tinySecp256k1Ints.`3` = 3.asInstanceOf[typings.tinySecp256k1.tinySecp256k1Ints.`3`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tinySecp256k1.tinySecp256k1Ints.`1`
    - typings.tinySecp256k1.tinySecp256k1Ints.`0`
  */
  trait TweakParity extends StObject
  object TweakParity {
    
    inline def `0`: typings.tinySecp256k1.tinySecp256k1Ints.`0` = 0.asInstanceOf[typings.tinySecp256k1.tinySecp256k1Ints.`0`]
    
    inline def `1`: typings.tinySecp256k1.tinySecp256k1Ints.`1` = 1.asInstanceOf[typings.tinySecp256k1.tinySecp256k1Ints.`1`]
  }
  
  trait XOnlyPointAddTweakResult extends StObject {
    
    var parity: `1` | `0`
    
    var xOnlyPubkey: js.typedarray.Uint8Array
  }
  object XOnlyPointAddTweakResult {
    
    inline def apply(parity: `1` | `0`, xOnlyPubkey: js.typedarray.Uint8Array): XOnlyPointAddTweakResult = {
      val __obj = js.Dynamic.literal(parity = parity.asInstanceOf[js.Any], xOnlyPubkey = xOnlyPubkey.asInstanceOf[js.Any])
      __obj.asInstanceOf[XOnlyPointAddTweakResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XOnlyPointAddTweakResult] (val x: Self) extends AnyVal {
      
      inline def setParity(value: `1` | `0`): Self = StObject.set(x, "parity", value.asInstanceOf[js.Any])
      
      inline def setXOnlyPubkey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "xOnlyPubkey", value.asInstanceOf[js.Any])
    }
  }
}
