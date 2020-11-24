package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BacklogConfiguration extends js.Object {
  
  /**
    * Behavior/type field mapping
    */
  var backlogFields: BacklogFields = js.native
  
  /**
    * Bugs behavior
    */
  var bugsBehavior: BugsBehavior = js.native
  
  /**
    * Hidden Backlog
    */
  var hiddenBacklogs: js.Array[String] = js.native
  
  /**
    * Portfolio backlog descriptors
    */
  var portfolioBacklogs: js.Array[BacklogLevelConfiguration] = js.native
  
  /**
    * Requirement backlog
    */
  var requirementBacklog: BacklogLevelConfiguration = js.native
  
  /**
    * Task backlog
    */
  var taskBacklog: BacklogLevelConfiguration = js.native
  
  var url: String = js.native
  
  /**
    * Mapped states for work item types
    */
  var workItemTypeMappedStates: js.Array[WorkItemTypeStateInfo] = js.native
}
object BacklogConfiguration {
  
  @scala.inline
  def apply(
    backlogFields: BacklogFields,
    bugsBehavior: BugsBehavior,
    hiddenBacklogs: js.Array[String],
    portfolioBacklogs: js.Array[BacklogLevelConfiguration],
    requirementBacklog: BacklogLevelConfiguration,
    taskBacklog: BacklogLevelConfiguration,
    url: String,
    workItemTypeMappedStates: js.Array[WorkItemTypeStateInfo]
  ): BacklogConfiguration = {
    val __obj = js.Dynamic.literal(backlogFields = backlogFields.asInstanceOf[js.Any], bugsBehavior = bugsBehavior.asInstanceOf[js.Any], hiddenBacklogs = hiddenBacklogs.asInstanceOf[js.Any], portfolioBacklogs = portfolioBacklogs.asInstanceOf[js.Any], requirementBacklog = requirementBacklog.asInstanceOf[js.Any], taskBacklog = taskBacklog.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemTypeMappedStates = workItemTypeMappedStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogConfiguration]
  }
  
  @scala.inline
  implicit class BacklogConfigurationOps[Self <: BacklogConfiguration] (val x: Self) extends AnyVal {
    
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
    def setBacklogFields(value: BacklogFields): Self = this.set("backlogFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBugsBehavior(value: BugsBehavior): Self = this.set("bugsBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenBacklogsVarargs(value: String*): Self = this.set("hiddenBacklogs", js.Array(value :_*))
    
    @scala.inline
    def setHiddenBacklogs(value: js.Array[String]): Self = this.set("hiddenBacklogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortfolioBacklogsVarargs(value: BacklogLevelConfiguration*): Self = this.set("portfolioBacklogs", js.Array(value :_*))
    
    @scala.inline
    def setPortfolioBacklogs(value: js.Array[BacklogLevelConfiguration]): Self = this.set("portfolioBacklogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirementBacklog(value: BacklogLevelConfiguration): Self = this.set("requirementBacklog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskBacklog(value: BacklogLevelConfiguration): Self = this.set("taskBacklog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypeMappedStatesVarargs(value: WorkItemTypeStateInfo*): Self = this.set("workItemTypeMappedStates", js.Array(value :_*))
    
    @scala.inline
    def setWorkItemTypeMappedStates(value: js.Array[WorkItemTypeStateInfo]): Self = this.set("workItemTypeMappedStates", value.asInstanceOf[js.Any])
  }
}
