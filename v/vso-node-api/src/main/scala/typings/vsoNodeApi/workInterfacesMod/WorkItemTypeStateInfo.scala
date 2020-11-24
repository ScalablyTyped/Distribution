package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemTypeStateInfo extends js.Object {
  
  /**
    * State name to state category map
    */
  var states: StringDictionary[String] = js.native
  
  /**
    * Work Item type name
    */
  var workItemTypeName: String = js.native
}
object WorkItemTypeStateInfo {
  
  @scala.inline
  def apply(states: StringDictionary[String], workItemTypeName: String): WorkItemTypeStateInfo = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeStateInfo]
  }
  
  @scala.inline
  implicit class WorkItemTypeStateInfoOps[Self <: WorkItemTypeStateInfo] (val x: Self) extends AnyVal {
    
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
    def setStates(value: StringDictionary[String]): Self = this.set("states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypeName(value: String): Self = this.set("workItemTypeName", value.asInstanceOf[js.Any])
  }
}
