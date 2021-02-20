package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BacklogConfiguration extends StObject {
  
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
  implicit class BacklogConfigurationMutableBuilder[Self <: BacklogConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBacklogFields(value: BacklogFields): Self = StObject.set(x, "backlogFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBugsBehavior(value: BugsBehavior): Self = StObject.set(x, "bugsBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenBacklogs(value: js.Array[String]): Self = StObject.set(x, "hiddenBacklogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenBacklogsVarargs(value: String*): Self = StObject.set(x, "hiddenBacklogs", js.Array(value :_*))
    
    @scala.inline
    def setPortfolioBacklogs(value: js.Array[BacklogLevelConfiguration]): Self = StObject.set(x, "portfolioBacklogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortfolioBacklogsVarargs(value: BacklogLevelConfiguration*): Self = StObject.set(x, "portfolioBacklogs", js.Array(value :_*))
    
    @scala.inline
    def setRequirementBacklog(value: BacklogLevelConfiguration): Self = StObject.set(x, "requirementBacklog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskBacklog(value: BacklogLevelConfiguration): Self = StObject.set(x, "taskBacklog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypeMappedStates(value: js.Array[WorkItemTypeStateInfo]): Self = StObject.set(x, "workItemTypeMappedStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypeMappedStatesVarargs(value: WorkItemTypeStateInfo*): Self = StObject.set(x, "workItemTypeMappedStates", js.Array(value :_*))
  }
}
