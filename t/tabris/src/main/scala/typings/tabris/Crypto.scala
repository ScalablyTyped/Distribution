package typings.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Crypto
/**
  * The global `crypto` object provides an implementation of the `RandomSource` interface that can be
  * used to generate cryptographically secure random numbers.
  */
trait Crypto extends StObject {
  
  /**
    * Generates random numbers.
    * @param typedArray A typed array which will be filled with random numbers. The *same* array is also returned by this method.
    */
  def getRandomValues(typedArray: TypedArray): TypedArray
  
  /**
    * @constant
    */
  val subtle: SubtleCrypto
}
object Crypto {
  
  inline def apply(getRandomValues: TypedArray => TypedArray, subtle: SubtleCrypto): Crypto = {
    val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1(getRandomValues), subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crypto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Crypto] (val x: Self) extends AnyVal {
    
    inline def setGetRandomValues(value: TypedArray => TypedArray): Self = StObject.set(x, "getRandomValues", js.Any.fromFunction1(value))
    
    inline def setSubtle(value: SubtleCrypto): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
  }
}
