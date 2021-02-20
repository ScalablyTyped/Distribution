package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Items[R, T] extends StObject {
  
  var id: R = js.native
  
  var items: js.Array[T] = js.native
}
object Items {
  
  @scala.inline
  def apply[R, T](id: R, items: js.Array[T]): Items[R, T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items[R, T]]
  }
  
  @scala.inline
  implicit class ItemsMutableBuilder[Self <: Items[_, _], R, T] (val x: Self with (Items[R, T])) extends AnyVal {
    
    @scala.inline
    def setId(value: R): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
