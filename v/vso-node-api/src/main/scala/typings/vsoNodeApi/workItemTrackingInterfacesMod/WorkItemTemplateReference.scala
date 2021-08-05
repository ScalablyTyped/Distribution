package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTemplateReference
  extends StObject
     with WorkItemTrackingResource {
  
  /**
    * The description of the work item template.
    */
  var description: String
  
  /**
    * The identifier of the work item template.
    */
  var id: String
  
  /**
    * The name of the work item template.
    */
  var name: String
  
  /**
    * The name of the work item type.
    */
  var workItemTypeName: String
}
object WorkItemTemplateReference {
  
  inline def apply(
    _links: js.Any,
    description: String,
    id: String,
    name: String,
    url: String,
    workItemTypeName: String
  ): WorkItemTemplateReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTemplateReference]
  }
  
  extension [Self <: WorkItemTemplateReference](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setWorkItemTypeName(value: String): Self = StObject.set(x, "workItemTypeName", value.asInstanceOf[js.Any])
  }
}
