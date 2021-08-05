package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTypeColorAndIcon extends StObject {
  
  /**
    * The color of the work item type in hex format.
    */
  var color: String
  
  /**
    * Tthe work item type icon.
    */
  var icon: String
  
  /**
    * The name of the work item type.
    */
  var workItemTypeName: String
}
object WorkItemTypeColorAndIcon {
  
  inline def apply(color: String, icon: String, workItemTypeName: String): WorkItemTypeColorAndIcon = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeColorAndIcon]
  }
  
  extension [Self <: WorkItemTypeColorAndIcon](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setWorkItemTypeName(value: String): Self = StObject.set(x, "workItemTypeName", value.asInstanceOf[js.Any])
  }
}
