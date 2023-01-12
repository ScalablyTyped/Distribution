package typings.yaDisk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilesResourceList extends StObject {
  
  var items: js.Array[Resource]
  
  var limit: Double
  
  var offset: Double
}
object FilesResourceList {
  
  inline def apply(items: js.Array[Resource], limit: Double, offset: Double): FilesResourceList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesResourceList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilesResourceList] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Resource]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Resource*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
