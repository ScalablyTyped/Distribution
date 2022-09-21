package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Crypto * / any */ trait Crypto1 extends StObject {
  
  /**
    * Generates cryptographically random values
    * @param array Is an integer-based BufferSource.
    * All elements in the array are going to be overridden with random numbers.
    */
  def getRandomValues[T /* <: js.typedarray.ArrayBufferView | Null */](array: T): T
  
  /**
    * Generates a v4 UUID using a cryptographically secure random number generator
    * @returns UUID v4 string
    */
  def randomUUID(): String
  
  /**
    * Returns a SubtleCrypto object providing access to common cryptographic primitives,
    * like hashing, signing, encryption or decryption
    */
  val subtle: SubtleCrypto1
}
object Crypto1 {
  
  inline def apply(getRandomValues: Any => Any, randomUUID: () => String, subtle: SubtleCrypto1): Crypto1 = {
    val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1(getRandomValues), randomUUID = js.Any.fromFunction0(randomUUID), subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crypto1]
  }
  
  extension [Self <: Crypto1](x: Self) {
    
    inline def setGetRandomValues(value: Any => Any): Self = StObject.set(x, "getRandomValues", js.Any.fromFunction1(value))
    
    inline def setRandomUUID(value: () => String): Self = StObject.set(x, "randomUUID", js.Any.fromFunction0(value))
    
    inline def setSubtle(value: SubtleCrypto1): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
  }
}
