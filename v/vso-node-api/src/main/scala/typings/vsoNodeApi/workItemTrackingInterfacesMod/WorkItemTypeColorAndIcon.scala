package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemTypeColorAndIcon extends js.Object {
  
  /**
    * The color of the work item type in hex format.
    */
  var color: String = js.native
  
  /**
    * Tthe work item type icon.
    */
  var icon: String = js.native
  
  /**
    * The name of the work item type.
    */
  var workItemTypeName: String = js.native
}
object WorkItemTypeColorAndIcon {
  
  @scala.inline
  def apply(color: String, icon: String, workItemTypeName: String): WorkItemTypeColorAndIcon = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeColorAndIcon]
  }
  
  @scala.inline
  implicit class WorkItemTypeColorAndIconOps[Self <: WorkItemTypeColorAndIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypeName(value: String): Self = this.set("workItemTypeName", value.asInstanceOf[js.Any])
  }
}
