package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectWorkItemStateColors extends StObject {
  
  /**
    * Project name
    */
  var projectName: String
  
  /**
    * State colors for all work item type in a project
    */
  var workItemTypeStateColors: js.Array[WorkItemTypeStateColors]
}
object ProjectWorkItemStateColors {
  
  @scala.inline
  def apply(projectName: String, workItemTypeStateColors: js.Array[WorkItemTypeStateColors]): ProjectWorkItemStateColors = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any], workItemTypeStateColors = workItemTypeStateColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectWorkItemStateColors]
  }
  
  @scala.inline
  implicit class ProjectWorkItemStateColorsMutableBuilder[Self <: ProjectWorkItemStateColors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypeStateColors(value: js.Array[WorkItemTypeStateColors]): Self = StObject.set(x, "workItemTypeStateColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypeStateColorsVarargs(value: WorkItemTypeStateColors*): Self = StObject.set(x, "workItemTypeStateColors", js.Array(value :_*))
  }
}
