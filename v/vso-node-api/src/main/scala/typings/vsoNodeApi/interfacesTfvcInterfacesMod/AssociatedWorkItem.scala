package typings.vsoNodeApi.interfacesTfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatedWorkItem extends StObject {
  
  var assignedTo: String
  
  /**
    * Id of associated the work item.
    */
  var id: Double
  
  var state: String
  
  var title: String
  
  /**
    * REST Url of the work item.
    */
  var url: String
  
  var webUrl: String
  
  var workItemType: String
}
object AssociatedWorkItem {
  
  inline def apply(
    assignedTo: String,
    id: Double,
    state: String,
    title: String,
    url: String,
    webUrl: String,
    workItemType: String
  ): AssociatedWorkItem = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webUrl = webUrl.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatedWorkItem]
  }
  
  extension [Self <: AssociatedWorkItem](x: Self) {
    
    inline def setAssignedTo(value: String): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWebUrl(value: String): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWorkItemType(value: String): Self = StObject.set(x, "workItemType", value.asInstanceOf[js.Any])
  }
}
