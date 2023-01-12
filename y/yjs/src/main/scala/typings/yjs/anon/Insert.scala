package typings.yjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Insert extends StObject {
  
  var delete: js.UndefOr[Double] = js.undefined
  
  var insert: js.UndefOr[js.Array[Any] | String] = js.undefined
  
  var retain: js.UndefOr[Double] = js.undefined
}
object Insert {
  
  inline def apply(): Insert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Insert]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Insert] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setInsert(value: js.Array[Any] | String): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    inline def setInsertVarargs(value: Any*): Self = StObject.set(x, "insert", js.Array(value*))
    
    inline def setRetain(value: Double): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
    
    inline def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
  }
}
