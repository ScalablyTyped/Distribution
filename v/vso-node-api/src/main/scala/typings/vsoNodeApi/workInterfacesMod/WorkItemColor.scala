package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemColor extends StObject {
  
  var icon: String = js.native
  
  var primaryColor: String = js.native
  
  var workItemTypeName: String = js.native
}
object WorkItemColor {
  
  @scala.inline
  def apply(icon: String, primaryColor: String, workItemTypeName: String): WorkItemColor = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], primaryColor = primaryColor.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemColor]
  }
  
  @scala.inline
  implicit class WorkItemColorMutableBuilder[Self <: WorkItemColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypeName(value: String): Self = StObject.set(x, "workItemTypeName", value.asInstanceOf[js.Any])
  }
}
