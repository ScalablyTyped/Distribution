package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddedIndex extends StObject {
  
  var addedIndex: Double | String
  
  var id: js.Any
  
  var item: js.Object
  
  var removedIndex: Double | String
}
object AddedIndex {
  
  inline def apply(addedIndex: Double | String, id: js.Any, item: js.Object, removedIndex: Double | String): AddedIndex = {
    val __obj = js.Dynamic.literal(addedIndex = addedIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], removedIndex = removedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddedIndex]
  }
  
  extension [Self <: AddedIndex](x: Self) {
    
    inline def setAddedIndex(value: Double | String): Self = StObject.set(x, "addedIndex", value.asInstanceOf[js.Any])
    
    inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setRemovedIndex(value: Double | String): Self = StObject.set(x, "removedIndex", value.asInstanceOf[js.Any])
  }
}
