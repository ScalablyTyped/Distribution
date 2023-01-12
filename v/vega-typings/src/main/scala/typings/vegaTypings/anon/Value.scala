package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecEncodeMod.BaseValueRef
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value[?], T] (val x: Self & Value[T]) extends AnyVal {
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
