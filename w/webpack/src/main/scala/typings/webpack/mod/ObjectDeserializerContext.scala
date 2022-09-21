package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectDeserializerContext extends StObject {
  
  def read(): Any
}
object ObjectDeserializerContext {
  
  inline def apply(read: () => Any): ObjectDeserializerContext = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[ObjectDeserializerContext]
  }
  
  extension [Self <: ObjectDeserializerContext](x: Self) {
    
    inline def setRead(value: () => Any): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
  }
}
