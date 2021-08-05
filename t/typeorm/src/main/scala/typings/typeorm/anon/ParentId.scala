package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentId extends StObject {
  
  var id: js.Any
  
  var parentId: js.Any
}
object ParentId {
  
  inline def apply(id: js.Any, parentId: js.Any): ParentId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentId]
  }
  
  extension [Self <: ParentId](x: Self) {
    
    inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setParentId(value: js.Any): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
  }
}
