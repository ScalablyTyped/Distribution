package typings.workboxCore

import typings.workboxCore.typesMod.MapLikeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait HasMethod extends StObject {
    
    def hasMethod(`object`: MapLikeObject, expectedMethod: String, details: MapLikeObject): Unit
    
    def isArray(value: js.Array[Any], details: MapLikeObject): Unit
    
    def isArrayOfClass(value: Any, expectedClass: js.Function, details: MapLikeObject): Unit
    
    def isInstance(`object`: Any, expectedClass: js.Function, details: MapLikeObject): Unit
    
    def isOneOf(value: Any, validValues: js.Array[Any], details: MapLikeObject): Unit
    
    def isType(`object`: Any, expectedType: String, details: MapLikeObject): Unit
  }
  object HasMethod {
    
    inline def apply(
      hasMethod: (MapLikeObject, String, MapLikeObject) => Unit,
      isArray: (js.Array[Any], MapLikeObject) => Unit,
      isArrayOfClass: (Any, js.Function, MapLikeObject) => Unit,
      isInstance: (Any, js.Function, MapLikeObject) => Unit,
      isOneOf: (Any, js.Array[Any], MapLikeObject) => Unit,
      isType: (Any, String, MapLikeObject) => Unit
    ): HasMethod = {
      val __obj = js.Dynamic.literal(hasMethod = js.Any.fromFunction3(hasMethod), isArray = js.Any.fromFunction2(isArray), isArrayOfClass = js.Any.fromFunction3(isArrayOfClass), isInstance = js.Any.fromFunction3(isInstance), isOneOf = js.Any.fromFunction3(isOneOf), isType = js.Any.fromFunction3(isType))
      __obj.asInstanceOf[HasMethod]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HasMethod] (val x: Self) extends AnyVal {
      
      inline def setHasMethod(value: (MapLikeObject, String, MapLikeObject) => Unit): Self = StObject.set(x, "hasMethod", js.Any.fromFunction3(value))
      
      inline def setIsArray(value: (js.Array[Any], MapLikeObject) => Unit): Self = StObject.set(x, "isArray", js.Any.fromFunction2(value))
      
      inline def setIsArrayOfClass(value: (Any, js.Function, MapLikeObject) => Unit): Self = StObject.set(x, "isArrayOfClass", js.Any.fromFunction3(value))
      
      inline def setIsInstance(value: (Any, js.Function, MapLikeObject) => Unit): Self = StObject.set(x, "isInstance", js.Any.fromFunction3(value))
      
      inline def setIsOneOf(value: (Any, js.Array[Any], MapLikeObject) => Unit): Self = StObject.set(x, "isOneOf", js.Any.fromFunction3(value))
      
      inline def setIsType(value: (Any, String, MapLikeObject) => Unit): Self = StObject.set(x, "isType", js.Any.fromFunction3(value))
    }
  }
}
