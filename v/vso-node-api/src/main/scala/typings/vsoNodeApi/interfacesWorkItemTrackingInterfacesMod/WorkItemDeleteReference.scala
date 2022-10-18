package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemDeleteReference extends StObject {
  
  /**
    * The HTTP status code for work item operation in a batch request.
    */
  var code: Double
  
  /**
    * The user who deleted the work item type.
    */
  var deletedBy: String
  
  /**
    * The work item deletion date.
    */
  var deletedDate: String
  
  /**
    * Work item ID.
    */
  var id: Double
  
  /**
    * The exception message for work item operation in a batch request.
    */
  var message: String
  
  /**
    * Name or title of the work item.
    */
  var name: String
  
  /**
    * Parent project of the deleted work item.
    */
  var project: String
  
  /**
    * Type of work item.
    */
  var `type`: String
  
  /**
    * REST API URL of the resource
    */
  var url: String
}
object WorkItemDeleteReference {
  
  inline def apply(
    code: Double,
    deletedBy: String,
    deletedDate: String,
    id: Double,
    message: String,
    name: String,
    project: String,
    `type`: String,
    url: String
  ): WorkItemDeleteReference = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], deletedBy = deletedBy.asInstanceOf[js.Any], deletedDate = deletedDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemDeleteReference]
  }
  
  extension [Self <: WorkItemDeleteReference](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDeletedBy(value: String): Self = StObject.set(x, "deletedBy", value.asInstanceOf[js.Any])
    
    inline def setDeletedDate(value: String): Self = StObject.set(x, "deletedDate", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
