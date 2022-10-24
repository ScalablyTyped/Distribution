package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddedToContainerId extends StObject {
  
  var addedIndex: Any
  
  var addedToContainerId: Any
  
  var removedFromContainerId: Any
  
  var removedIndex: Any
}
object AddedToContainerId {
  
  inline def apply(addedIndex: Any, addedToContainerId: Any, removedFromContainerId: Any, removedIndex: Any): AddedToContainerId = {
    val __obj = js.Dynamic.literal(addedIndex = addedIndex.asInstanceOf[js.Any], addedToContainerId = addedToContainerId.asInstanceOf[js.Any], removedFromContainerId = removedFromContainerId.asInstanceOf[js.Any], removedIndex = removedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddedToContainerId]
  }
  
  extension [Self <: AddedToContainerId](x: Self) {
    
    inline def setAddedIndex(value: Any): Self = StObject.set(x, "addedIndex", value.asInstanceOf[js.Any])
    
    inline def setAddedToContainerId(value: Any): Self = StObject.set(x, "addedToContainerId", value.asInstanceOf[js.Any])
    
    inline def setRemovedFromContainerId(value: Any): Self = StObject.set(x, "removedFromContainerId", value.asInstanceOf[js.Any])
    
    inline def setRemovedIndex(value: Any): Self = StObject.set(x, "removedIndex", value.asInstanceOf[js.Any])
  }
}
