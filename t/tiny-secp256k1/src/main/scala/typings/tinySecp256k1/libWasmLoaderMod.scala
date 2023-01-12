package typings.tinySecp256k1

import org.scalablytyped.runtime.Shortcut
import typings.tinySecp256k1.tinySecp256k1Ints.`-1`
import typings.tinySecp256k1.tinySecp256k1Ints.`0`
import typings.tinySecp256k1.tinySecp256k1Ints.`1`
import typings.tinySecp256k1.tinySecp256k1Ints.`2`
import typings.tinySecp256k1.tinySecp256k1Ints.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWasmLoaderMod extends Shortcut {
  
  @JSImport("tiny-secp256k1/lib/wasm_loader", JSImport.Default)
  @js.native
  val default: Secp256k1WASM = js.native
  
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
  
  trait Secp256k1WASM extends StObject {
    
    var EXTRA_DATA_INPUT: WebAssemblyGlobal
    
    var HASH_INPUT: WebAssemblyGlobal
    
    var PRIVATE_INPUT: WebAssemblyGlobal
    
    var PUBLIC_KEY_INPUT: WebAssemblyGlobal
    
    var PUBLIC_KEY_INPUT2: WebAssemblyGlobal
    
    var SIGNATURE_INPUT: WebAssemblyGlobal
    
    var TWEAK_INPUT: WebAssemblyGlobal
    
    var X_ONLY_PUBLIC_KEY_INPUT: WebAssemblyGlobal
    
    var X_ONLY_PUBLIC_KEY_INPUT2: WebAssemblyGlobal
    
    def initializeContext(): Unit
    
    def isPoint(p: Double): Double
    
    var memory: WebAssemblyMemory
    
    def pointAdd(pA: Double, pB: Double, outputlen: Double): Double
    
    def pointAddScalar(p: Double, outputlen: Double): Double
    
    def pointCompress(p: Double, outputlen: Double): Double
    
    def pointFromScalar(outputlen: Double): Double
    
    def pointMultiply(p: Double, outputlen: Double): Double
    
    def privateAdd(): Double
    
    def privateNegate(): Unit
    
    def privateSub(): Double
    
    def recover(outputlen: Double, recoveryId: RecoveryIdType): Double
    
    def sign(e: Double): Unit
    
    def signRecoverable(e: Double): `0` | `1` | `2` | `3`
    
    def signSchnorr(e: Double): Unit
    
    def verify(Q: Double, strict: Double): Double
    
    def verifySchnorr(): Double
    
    def xOnlyPointAddTweak(): `1` | `0` | `-1`
    
    def xOnlyPointAddTweakCheck(parity: Double): Double
    
    def xOnlyPointFromPoint(inputLen: Double): Double
    
    def xOnlyPointFromScalar(): Double
  }
  object Secp256k1WASM {
    
    inline def apply(
      EXTRA_DATA_INPUT: WebAssemblyGlobal,
      HASH_INPUT: WebAssemblyGlobal,
      PRIVATE_INPUT: WebAssemblyGlobal,
      PUBLIC_KEY_INPUT: WebAssemblyGlobal,
      PUBLIC_KEY_INPUT2: WebAssemblyGlobal,
      SIGNATURE_INPUT: WebAssemblyGlobal,
      TWEAK_INPUT: WebAssemblyGlobal,
      X_ONLY_PUBLIC_KEY_INPUT: WebAssemblyGlobal,
      X_ONLY_PUBLIC_KEY_INPUT2: WebAssemblyGlobal,
      initializeContext: () => Unit,
      isPoint: Double => Double,
      memory: WebAssemblyMemory,
      pointAdd: (Double, Double, Double) => Double,
      pointAddScalar: (Double, Double) => Double,
      pointCompress: (Double, Double) => Double,
      pointFromScalar: Double => Double,
      pointMultiply: (Double, Double) => Double,
      privateAdd: () => Double,
      privateNegate: () => Unit,
      privateSub: () => Double,
      recover: (Double, RecoveryIdType) => Double,
      sign: Double => Unit,
      signRecoverable: Double => `0` | `1` | `2` | `3`,
      signSchnorr: Double => Unit,
      verify: (Double, Double) => Double,
      verifySchnorr: () => Double,
      xOnlyPointAddTweak: () => `1` | `0` | `-1`,
      xOnlyPointAddTweakCheck: Double => Double,
      xOnlyPointFromPoint: Double => Double,
      xOnlyPointFromScalar: () => Double
    ): Secp256k1WASM = {
      val __obj = js.Dynamic.literal(EXTRA_DATA_INPUT = EXTRA_DATA_INPUT.asInstanceOf[js.Any], HASH_INPUT = HASH_INPUT.asInstanceOf[js.Any], PRIVATE_INPUT = PRIVATE_INPUT.asInstanceOf[js.Any], PUBLIC_KEY_INPUT = PUBLIC_KEY_INPUT.asInstanceOf[js.Any], PUBLIC_KEY_INPUT2 = PUBLIC_KEY_INPUT2.asInstanceOf[js.Any], SIGNATURE_INPUT = SIGNATURE_INPUT.asInstanceOf[js.Any], TWEAK_INPUT = TWEAK_INPUT.asInstanceOf[js.Any], X_ONLY_PUBLIC_KEY_INPUT = X_ONLY_PUBLIC_KEY_INPUT.asInstanceOf[js.Any], X_ONLY_PUBLIC_KEY_INPUT2 = X_ONLY_PUBLIC_KEY_INPUT2.asInstanceOf[js.Any], initializeContext = js.Any.fromFunction0(initializeContext), isPoint = js.Any.fromFunction1(isPoint), memory = memory.asInstanceOf[js.Any], pointAdd = js.Any.fromFunction3(pointAdd), pointAddScalar = js.Any.fromFunction2(pointAddScalar), pointCompress = js.Any.fromFunction2(pointCompress), pointFromScalar = js.Any.fromFunction1(pointFromScalar), pointMultiply = js.Any.fromFunction2(pointMultiply), privateAdd = js.Any.fromFunction0(privateAdd), privateNegate = js.Any.fromFunction0(privateNegate), privateSub = js.Any.fromFunction0(privateSub), recover = js.Any.fromFunction2(recover), sign = js.Any.fromFunction1(sign), signRecoverable = js.Any.fromFunction1(signRecoverable), signSchnorr = js.Any.fromFunction1(signSchnorr), verify = js.Any.fromFunction2(verify), verifySchnorr = js.Any.fromFunction0(verifySchnorr), xOnlyPointAddTweak = js.Any.fromFunction0(xOnlyPointAddTweak), xOnlyPointAddTweakCheck = js.Any.fromFunction1(xOnlyPointAddTweakCheck), xOnlyPointFromPoint = js.Any.fromFunction1(xOnlyPointFromPoint), xOnlyPointFromScalar = js.Any.fromFunction0(xOnlyPointFromScalar))
      __obj.asInstanceOf[Secp256k1WASM]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Secp256k1WASM] (val x: Self) extends AnyVal {
      
      inline def setEXTRA_DATA_INPUT(value: WebAssemblyGlobal): Self = StObject.set(x, "EXTRA_DATA_INPUT", value.asInstanceOf[js.Any])
      
      inline def setHASH_INPUT(value: WebAssemblyGlobal): Self = StObject.set(x, "HASH_INPUT", value.asInstanceOf[js.Any])
      
      inline def setInitializeContext(value: () => Unit): Self = StObject.set(x, "initializeContext", js.Any.fromFunction0(value))
      
      inline def setIsPoint(value: Double => Double): Self = StObject.set(x, "isPoint", js.Any.fromFunction1(value))
      
      inline def setMemory(value: WebAssemblyMemory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setPRIVATE_INPUT(value: WebAssemblyGlobal): Self = StObject.set(x, "PRIVATE_INPUT", value.asInstanceOf[js.Any])
      
      inline def setPUBLIC_KEY_INPUT(value: WebAssemblyGlobal): Self = StObject.set(x, "PUBLIC_KEY_INPUT", value.asInstanceOf[js.Any])
      
      inline def setPUBLIC_KEY_INPUT2(value: WebAssemblyGlobal): Self = StObject.set(x, "PUBLIC_KEY_INPUT2", value.asInstanceOf[js.Any])
      
      inline def setPointAdd(value: (Double, Double, Double) => Double): Self = StObject.set(x, "pointAdd", js.Any.fromFunction3(value))
      
      inline def setPointAddScalar(value: (Double, Double) => Double): Self = StObject.set(x, "pointAddScalar", js.Any.fromFunction2(value))
      
      inline def setPointCompress(value: (Double, Double) => Double): Self = StObject.set(x, "pointCompress", js.Any.fromFunction2(value))
      
      inline def setPointFromScalar(value: Double => Double): Self = StObject.set(x, "pointFromScalar", js.Any.fromFunction1(value))
      
      inline def setPointMultiply(value: (Double, Double) => Double): Self = StObject.set(x, "pointMultiply", js.Any.fromFunction2(value))
      
      inline def setPrivateAdd(value: () => Double): Self = StObject.set(x, "privateAdd", js.Any.fromFunction0(value))
      
      inline def setPrivateNegate(value: () => Unit): Self = StObject.set(x, "privateNegate", js.Any.fromFunction0(value))
      
      inline def setPrivateSub(value: () => Double): Self = StObject.set(x, "privateSub", js.Any.fromFunction0(value))
      
      inline def setRecover(value: (Double, RecoveryIdType) => Double): Self = StObject.set(x, "recover", js.Any.fromFunction2(value))
      
      inline def setSIGNATURE_INPUT(value: WebAssemblyGlobal): Self = StObject.set(x, "SIGNATURE_INPUT", value.asInstanceOf[js.Any])
      
      inline def setSign(value: Double => Unit): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
      
      inline def setSignRecoverable(value: Double => `0` | `1` | `2` | `3`): Self = StObject.set(x, "signRecoverable", js.Any.fromFunction1(value))
      
      inline def setSignSchnorr(value: Double => Unit): Self = StObject.set(x, "signSchnorr", js.Any.fromFunction1(value))
      
      inline def setTWEAK_INPUT(value: WebAssemblyGlobal): Self = StObject.set(x, "TWEAK_INPUT", value.asInstanceOf[js.Any])
      
      inline def setVerify(value: (Double, Double) => Double): Self = StObject.set(x, "verify", js.Any.fromFunction2(value))
      
      inline def setVerifySchnorr(value: () => Double): Self = StObject.set(x, "verifySchnorr", js.Any.fromFunction0(value))
      
      inline def setXOnlyPointAddTweak(value: () => `1` | `0` | `-1`): Self = StObject.set(x, "xOnlyPointAddTweak", js.Any.fromFunction0(value))
      
      inline def setXOnlyPointAddTweakCheck(value: Double => Double): Self = StObject.set(x, "xOnlyPointAddTweakCheck", js.Any.fromFunction1(value))
      
      inline def setXOnlyPointFromPoint(value: Double => Double): Self = StObject.set(x, "xOnlyPointFromPoint", js.Any.fromFunction1(value))
      
      inline def setXOnlyPointFromScalar(value: () => Double): Self = StObject.set(x, "xOnlyPointFromScalar", js.Any.fromFunction0(value))
      
      inline def setX_ONLY_PUBLIC_KEY_INPUT(value: WebAssemblyGlobal): Self = StObject.set(x, "X_ONLY_PUBLIC_KEY_INPUT", value.asInstanceOf[js.Any])
      
      inline def setX_ONLY_PUBLIC_KEY_INPUT2(value: WebAssemblyGlobal): Self = StObject.set(x, "X_ONLY_PUBLIC_KEY_INPUT2", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebAssemblyGlobal extends StObject {
    
    var value: Double
  }
  object WebAssemblyGlobal {
    
    inline def apply(value: Double): WebAssemblyGlobal = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAssemblyGlobal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebAssemblyGlobal] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebAssemblyMemory extends StObject {
    
    var buffer: js.typedarray.Uint8Array
  }
  object WebAssemblyMemory {
    
    inline def apply(buffer: js.typedarray.Uint8Array): WebAssemblyMemory = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAssemblyMemory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebAssemblyMemory] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Secp256k1WASM
  
  /* This means you don't have to write `default`, but can instead just say `libWasmLoaderMod.foo` */
  override def _to: Secp256k1WASM = default
}
