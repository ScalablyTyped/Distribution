package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerId extends StObject {
  
  var containerId: Any
  
  var groupName: Any
  
  var id: Any
  
  var index: Any
  
  var item: Any
}
object ContainerId {
  
  inline def apply(containerId: Any, groupName: Any, id: Any, index: Any, item: Any): ContainerId = {
    val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerId]
  }
  
  extension [Self <: ContainerId](x: Self) {
    
    inline def setContainerId(value: Any): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: Any): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
