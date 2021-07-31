package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items[R, T] extends StObject {
  
  var id: R
  
  var items: js.Array[T]
}
object Items {
  
  @scala.inline
  def apply[R, T](id: R, items: js.Array[T]): Items[R, T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items[R, T]]
  }
  
  @scala.inline
  implicit class ItemsMutableBuilder[Self <: Items[?, ?], R, T] (val x: Self & (Items[R, T])) extends AnyVal {
    
    @scala.inline
    def setId(value: R): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
