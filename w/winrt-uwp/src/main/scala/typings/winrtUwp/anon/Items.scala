package typings.winrtUwp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items[T] extends StObject {
  
  /** The items in the collection. */ var items: T
  
  /** The number of items in the collection. */ var returnValue: Double
}
object Items {
  
  inline def apply[T](items: T, returnValue: Double): Items[T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Items[?], T] (val x: Self & Items[T]) extends AnyVal {
    
    inline def setItems(value: T): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
