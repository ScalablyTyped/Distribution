package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectSerializer extends StObject {
  
  def deserialize(arg0: ObjectDeserializerContext): Any
  
  def serialize(arg0: Any, arg1: ObjectSerializerContext): Unit
}
object ObjectSerializer {
  
  inline def apply(deserialize: ObjectDeserializerContext => Any, serialize: (Any, ObjectSerializerContext) => Unit): ObjectSerializer = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction2(serialize))
    __obj.asInstanceOf[ObjectSerializer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectSerializer] (val x: Self) extends AnyVal {
    
    inline def setDeserialize(value: ObjectDeserializerContext => Any): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
    
    inline def setSerialize(value: (Any, ObjectSerializerContext) => Unit): Self = StObject.set(x, "serialize", js.Any.fromFunction2(value))
  }
}
