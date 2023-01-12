package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPullTypeCollection extends StObject {
  
  def getLength(): Double
  
  def getTypeAtIndex(index: Double): PullTypeSymbol
}
object IPullTypeCollection {
  
  inline def apply(getLength: () => Double, getTypeAtIndex: Double => PullTypeSymbol): IPullTypeCollection = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getTypeAtIndex = js.Any.fromFunction1(getTypeAtIndex))
    __obj.asInstanceOf[IPullTypeCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPullTypeCollection] (val x: Self) extends AnyVal {
    
    inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    inline def setGetTypeAtIndex(value: Double => PullTypeSymbol): Self = StObject.set(x, "getTypeAtIndex", js.Any.fromFunction1(value))
  }
}
