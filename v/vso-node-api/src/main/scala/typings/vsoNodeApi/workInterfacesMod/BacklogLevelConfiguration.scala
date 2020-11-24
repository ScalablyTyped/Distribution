package typings.vsoNodeApi.workInterfacesMod

import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemFieldReference
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BacklogLevelConfiguration extends js.Object {
  
  /**
    * List of fields to include in Add Panel
    */
  var addPanelFields: js.Array[WorkItemFieldReference] = js.native
  
  /**
    * Color for the backlog level
    */
  var color: String = js.native
  
  /**
    * Default list of columns for the backlog
    */
  var columnFields: js.Array[BacklogColumn] = js.native
  
  /**
    * Defaulst Work Item Type for the backlog
    */
  var defaultWorkItemType: WorkItemTypeReference = js.native
  
  /**
    * Backlog Id (for Legacy Backlog Level from process config it can be categoryref name)
    */
  var id: String = js.native
  
  /**
    * Backlog Name
    */
  var name: String = js.native
  
  /**
    * Backlog Rank (Taskbacklog is 0)
    */
  var rank: Double = js.native
  
  /**
    * Max number of work items to show in the given backlog
    */
  var workItemCountLimit: Double = js.native
  
  /**
    * Work Item types participating in this backlog as known by the project/Process, can be overridden by team settings for bugs
    */
  var workItemTypes: js.Array[WorkItemTypeReference] = js.native
}
object BacklogLevelConfiguration {
  
  @scala.inline
  def apply(
    addPanelFields: js.Array[WorkItemFieldReference],
    color: String,
    columnFields: js.Array[BacklogColumn],
    defaultWorkItemType: WorkItemTypeReference,
    id: String,
    name: String,
    rank: Double,
    workItemCountLimit: Double,
    workItemTypes: js.Array[WorkItemTypeReference]
  ): BacklogLevelConfiguration = {
    val __obj = js.Dynamic.literal(addPanelFields = addPanelFields.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], columnFields = columnFields.asInstanceOf[js.Any], defaultWorkItemType = defaultWorkItemType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], workItemCountLimit = workItemCountLimit.asInstanceOf[js.Any], workItemTypes = workItemTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogLevelConfiguration]
  }
  
  @scala.inline
  implicit class BacklogLevelConfigurationOps[Self <: BacklogLevelConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAddPanelFieldsVarargs(value: WorkItemFieldReference*): Self = this.set("addPanelFields", js.Array(value :_*))
    
    @scala.inline
    def setAddPanelFields(value: js.Array[WorkItemFieldReference]): Self = this.set("addPanelFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnFieldsVarargs(value: BacklogColumn*): Self = this.set("columnFields", js.Array(value :_*))
    
    @scala.inline
    def setColumnFields(value: js.Array[BacklogColumn]): Self = this.set("columnFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultWorkItemType(value: WorkItemTypeReference): Self = this.set("defaultWorkItemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemCountLimit(value: Double): Self = this.set("workItemCountLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypesVarargs(value: WorkItemTypeReference*): Self = this.set("workItemTypes", js.Array(value :_*))
    
    @scala.inline
    def setWorkItemTypes(value: js.Array[WorkItemTypeReference]): Self = this.set("workItemTypes", value.asInstanceOf[js.Any])
  }
}
