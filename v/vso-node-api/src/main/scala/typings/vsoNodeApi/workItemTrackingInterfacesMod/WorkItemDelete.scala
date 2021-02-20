package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemDelete extends WorkItemDeleteReference {
  
  /**
    * The work item object that was deleted.
    */
  var resource: WorkItem = js.native
}
object WorkItemDelete {
  
  @scala.inline
  def apply(
    code: Double,
    deletedBy: String,
    deletedDate: String,
    id: Double,
    message: String,
    name: String,
    project: String,
    resource: WorkItem,
    `type`: String,
    url: String
  ): WorkItemDelete = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], deletedBy = deletedBy.asInstanceOf[js.Any], deletedDate = deletedDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemDelete]
  }
  
  @scala.inline
  implicit class WorkItemDeleteMutableBuilder[Self <: WorkItemDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: WorkItem): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
