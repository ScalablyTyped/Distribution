package typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemBehaviorField extends StObject {
  
  var behaviorFieldId: String
  
  var id: String
  
  var url: String
}
object WorkItemBehaviorField {
  
  inline def apply(behaviorFieldId: String, id: String, url: String): WorkItemBehaviorField = {
    val __obj = js.Dynamic.literal(behaviorFieldId = behaviorFieldId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemBehaviorField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkItemBehaviorField] (val x: Self) extends AnyVal {
    
    inline def setBehaviorFieldId(value: String): Self = StObject.set(x, "behaviorFieldId", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
