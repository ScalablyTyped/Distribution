package typings.yaDisk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastUploadedResourceList extends StObject {
  
  var items: js.Array[Resource]
  
  var limit: Double
}
object LastUploadedResourceList {
  
  inline def apply(items: js.Array[Resource], limit: Double): LastUploadedResourceList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastUploadedResourceList]
  }
  
  extension [Self <: LastUploadedResourceList](x: Self) {
    
    inline def setItems(value: js.Array[Resource]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Resource*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
  }
}
