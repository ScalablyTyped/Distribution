package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTypeColor extends StObject {
  
  /**
    * Gets or sets the color of the primary.
    */
  var primaryColor: String
  
  /**
    * Gets or sets the color of the secondary.
    */
  var secondaryColor: String
  
  /**
    * The name of the work item type.
    */
  var workItemTypeName: String
}
object WorkItemTypeColor {
  
  inline def apply(primaryColor: String, secondaryColor: String, workItemTypeName: String): WorkItemTypeColor = {
    val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any], secondaryColor = secondaryColor.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkItemTypeColor] (val x: Self) extends AnyVal {
    
    inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
    
    inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
    
    inline def setWorkItemTypeName(value: String): Self = StObject.set(x, "workItemTypeName", value.asInstanceOf[js.Any])
  }
}
