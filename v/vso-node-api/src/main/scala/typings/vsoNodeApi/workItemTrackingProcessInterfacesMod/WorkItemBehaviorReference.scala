package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemBehaviorReference extends StObject {
  
  var id: String
  
  var url: String
}
object WorkItemBehaviorReference {
  
  @scala.inline
  def apply(id: String, url: String): WorkItemBehaviorReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemBehaviorReference]
  }
  
  @scala.inline
  implicit class WorkItemBehaviorReferenceMutableBuilder[Self <: WorkItemBehaviorReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
