package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("webcrypto-core", "Crypto")
@js.native
open class Crypto ()
  extends StObject
     with Crypto1 {
  
  /**
    * Generates cryptographically random values
    * @param array Is an integer-based BufferSource.
    * All elements in the array are going to be overridden with random numbers.
    */
  /* CompleteClass */
  override def getRandomValues[T /* <: js.typedarray.ArrayBufferView | Null */](array: T): T = js.native
  
  /**
    * Generates a v4 UUID using a cryptographically secure random number generator
    * @returns UUID v4 string
    */
  /* CompleteClass */
  override def randomUUID(): String = js.native
  
  /**
    * Returns a SubtleCrypto object providing access to common cryptographic primitives,
    * like hashing, signing, encryption or decryption
    */
  /* CompleteClass */
  override val subtle: SubtleCrypto1 = js.native
}
