package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.BaseValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value[T]
  extends StObject
     with BaseValueRef[T] {
  
  var value: T | Null
}
object Value {
  
  inline def apply[T](): Value[T] = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[Value[T]]
  }
  
  extension [Self <: Value[?], T](x: Self & Value[T]) {
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
