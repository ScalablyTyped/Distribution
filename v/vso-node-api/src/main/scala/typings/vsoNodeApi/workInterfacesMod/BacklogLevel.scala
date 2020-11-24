package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BacklogLevel extends js.Object {
  
  /**
    * Reference name of the corresponding WIT category
    */
  var categoryReferenceName: String = js.native
  
  /**
    * Plural name for the backlog level
    */
  var pluralName: String = js.native
  
  /**
    * Collection of work item states that are included in the plan. The server will filter to only these work item types.
    */
  var workItemStates: js.Array[String] = js.native
  
  /**
    * Collection of valid workitem type names for the given backlog level
    */
  var workItemTypes: js.Array[String] = js.native
}
object BacklogLevel {
  
  @scala.inline
  def apply(
    categoryReferenceName: String,
    pluralName: String,
    workItemStates: js.Array[String],
    workItemTypes: js.Array[String]
  ): BacklogLevel = {
    val __obj = js.Dynamic.literal(categoryReferenceName = categoryReferenceName.asInstanceOf[js.Any], pluralName = pluralName.asInstanceOf[js.Any], workItemStates = workItemStates.asInstanceOf[js.Any], workItemTypes = workItemTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogLevel]
  }
  
  @scala.inline
  implicit class BacklogLevelOps[Self <: BacklogLevel] (val x: Self) extends AnyVal {
    
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
    def setCategoryReferenceName(value: String): Self = this.set("categoryReferenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluralName(value: String): Self = this.set("pluralName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemStatesVarargs(value: String*): Self = this.set("workItemStates", js.Array(value :_*))
    
    @scala.inline
    def setWorkItemStates(value: js.Array[String]): Self = this.set("workItemStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypesVarargs(value: String*): Self = this.set("workItemTypes", js.Array(value :_*))
    
    @scala.inline
    def setWorkItemTypes(value: js.Array[String]): Self = this.set("workItemTypes", value.asInstanceOf[js.Any])
  }
}
