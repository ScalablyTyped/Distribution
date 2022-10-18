package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BacklogConfiguration extends StObject {
  
  /**
    * Behavior/type field mapping
    */
  var backlogFields: BacklogFields
  
  /**
    * Bugs behavior
    */
  var bugsBehavior: BugsBehavior
  
  /**
    * Hidden Backlog
    */
  var hiddenBacklogs: js.Array[String]
  
  /**
    * Portfolio backlog descriptors
    */
  var portfolioBacklogs: js.Array[BacklogLevelConfiguration]
  
  /**
    * Requirement backlog
    */
  var requirementBacklog: BacklogLevelConfiguration
  
  /**
    * Task backlog
    */
  var taskBacklog: BacklogLevelConfiguration
  
  var url: String
  
  /**
    * Mapped states for work item types
    */
  var workItemTypeMappedStates: js.Array[WorkItemTypeStateInfo]
}
object BacklogConfiguration {
  
  inline def apply(
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
  
  extension [Self <: BacklogConfiguration](x: Self) {
    
    inline def setBacklogFields(value: BacklogFields): Self = StObject.set(x, "backlogFields", value.asInstanceOf[js.Any])
    
    inline def setBugsBehavior(value: BugsBehavior): Self = StObject.set(x, "bugsBehavior", value.asInstanceOf[js.Any])
    
    inline def setHiddenBacklogs(value: js.Array[String]): Self = StObject.set(x, "hiddenBacklogs", value.asInstanceOf[js.Any])
    
    inline def setHiddenBacklogsVarargs(value: String*): Self = StObject.set(x, "hiddenBacklogs", js.Array(value*))
    
    inline def setPortfolioBacklogs(value: js.Array[BacklogLevelConfiguration]): Self = StObject.set(x, "portfolioBacklogs", value.asInstanceOf[js.Any])
    
    inline def setPortfolioBacklogsVarargs(value: BacklogLevelConfiguration*): Self = StObject.set(x, "portfolioBacklogs", js.Array(value*))
    
    inline def setRequirementBacklog(value: BacklogLevelConfiguration): Self = StObject.set(x, "requirementBacklog", value.asInstanceOf[js.Any])
    
    inline def setTaskBacklog(value: BacklogLevelConfiguration): Self = StObject.set(x, "taskBacklog", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWorkItemTypeMappedStates(value: js.Array[WorkItemTypeStateInfo]): Self = StObject.set(x, "workItemTypeMappedStates", value.asInstanceOf[js.Any])
    
    inline def setWorkItemTypeMappedStatesVarargs(value: WorkItemTypeStateInfo*): Self = StObject.set(x, "workItemTypeMappedStates", js.Array(value*))
  }
}
