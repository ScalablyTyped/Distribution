package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemTypeColor extends StObject {
  
  /**
    * Gets or sets the color of the primary.
    */
  var primaryColor: String = js.native
  
  /**
    * Gets or sets the color of the secondary.
    */
  var secondaryColor: String = js.native
  
  /**
    * The name of the work item type.
    */
  var workItemTypeName: String = js.native
}
object WorkItemTypeColor {
  
  @scala.inline
  def apply(primaryColor: String, secondaryColor: String, workItemTypeName: String): WorkItemTypeColor = {
    val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any], secondaryColor = secondaryColor.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeColor]
  }
  
  @scala.inline
  implicit class WorkItemTypeColorMutableBuilder[Self <: WorkItemTypeColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypeName(value: String): Self = StObject.set(x, "workItemTypeName", value.asInstanceOf[js.Any])
  }
}
