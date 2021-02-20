package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemBehaviorField extends StObject {
  
  var behaviorFieldId: String = js.native
  
  var id: String = js.native
  
  var url: String = js.native
}
object WorkItemBehaviorField {
  
  @scala.inline
  def apply(behaviorFieldId: String, id: String, url: String): WorkItemBehaviorField = {
    val __obj = js.Dynamic.literal(behaviorFieldId = behaviorFieldId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemBehaviorField]
  }
  
  @scala.inline
  implicit class WorkItemBehaviorFieldMutableBuilder[Self <: WorkItemBehaviorField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehaviorFieldId(value: String): Self = StObject.set(x, "behaviorFieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
