package typings.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Crypto extends StObject {
  
  def getRandomValues(typedArray: TypedArray): TypedArray
}
object Crypto {
  
  inline def apply(getRandomValues: TypedArray => TypedArray): Crypto = {
    val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1(getRandomValues))
    __obj.asInstanceOf[Crypto]
  }
  
  extension [Self <: Crypto](x: Self) {
    
    inline def setGetRandomValues(value: TypedArray => TypedArray): Self = StObject.set(x, "getRandomValues", js.Any.fromFunction1(value))
  }
}
