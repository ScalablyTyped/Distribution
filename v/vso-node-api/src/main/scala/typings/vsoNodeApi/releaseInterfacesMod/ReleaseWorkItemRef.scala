package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseWorkItemRef extends StObject {
  
  var assignee: String
  
  var id: String
  
  var state: String
  
  var title: String
  
  var `type`: String
  
  var url: String
}
object ReleaseWorkItemRef {
  
  @scala.inline
  def apply(assignee: String, id: String, state: String, title: String, `type`: String, url: String): ReleaseWorkItemRef = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseWorkItemRef]
  }
  
  @scala.inline
  implicit class ReleaseWorkItemRefMutableBuilder[Self <: ReleaseWorkItemRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignee(value: String): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
