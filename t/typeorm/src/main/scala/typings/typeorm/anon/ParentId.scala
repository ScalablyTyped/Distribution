package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentId extends StObject {
  
  var id: js.Any = js.native
  
  var parentId: js.Any = js.native
}
object ParentId {
  
  @scala.inline
  def apply(id: js.Any, parentId: js.Any): ParentId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentId]
  }
  
  @scala.inline
  implicit class ParentIdMutableBuilder[Self <: ParentId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: js.Any): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
  }
}
