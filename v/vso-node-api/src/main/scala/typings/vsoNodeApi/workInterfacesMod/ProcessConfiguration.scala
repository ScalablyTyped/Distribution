package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemFieldReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessConfiguration extends StObject {
  
  /**
    * Details about bug work items
    */
  var bugWorkItems: CategoryConfiguration
  
  /**
    * Details about portfolio backlogs
    */
  var portfolioBacklogs: js.Array[CategoryConfiguration]
  
  /**
    * Details of requirement backlog
    */
  var requirementBacklog: CategoryConfiguration
  
  /**
    * Details of task backlog
    */
  var taskBacklog: CategoryConfiguration
  
  /**
    * Type fields for the process configuration
    */
  var typeFields: StringDictionary[WorkItemFieldReference]
  
  var url: String
}
object ProcessConfiguration {
  
  inline def apply(
    bugWorkItems: CategoryConfiguration,
    portfolioBacklogs: js.Array[CategoryConfiguration],
    requirementBacklog: CategoryConfiguration,
    taskBacklog: CategoryConfiguration,
    typeFields: StringDictionary[WorkItemFieldReference],
    url: String
  ): ProcessConfiguration = {
    val __obj = js.Dynamic.literal(bugWorkItems = bugWorkItems.asInstanceOf[js.Any], portfolioBacklogs = portfolioBacklogs.asInstanceOf[js.Any], requirementBacklog = requirementBacklog.asInstanceOf[js.Any], taskBacklog = taskBacklog.asInstanceOf[js.Any], typeFields = typeFields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessConfiguration]
  }
  
  extension [Self <: ProcessConfiguration](x: Self) {
    
    inline def setBugWorkItems(value: CategoryConfiguration): Self = StObject.set(x, "bugWorkItems", value.asInstanceOf[js.Any])
    
    inline def setPortfolioBacklogs(value: js.Array[CategoryConfiguration]): Self = StObject.set(x, "portfolioBacklogs", value.asInstanceOf[js.Any])
    
    inline def setPortfolioBacklogsVarargs(value: CategoryConfiguration*): Self = StObject.set(x, "portfolioBacklogs", js.Array(value :_*))
    
    inline def setRequirementBacklog(value: CategoryConfiguration): Self = StObject.set(x, "requirementBacklog", value.asInstanceOf[js.Any])
    
    inline def setTaskBacklog(value: CategoryConfiguration): Self = StObject.set(x, "taskBacklog", value.asInstanceOf[js.Any])
    
    inline def setTypeFields(value: StringDictionary[WorkItemFieldReference]): Self = StObject.set(x, "typeFields", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
