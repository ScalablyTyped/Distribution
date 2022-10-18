package typings.vsoNodeApi.interfacesWorkInterfacesMod

import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemFieldReference
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BacklogLevelConfiguration extends StObject {
  
  /**
    * List of fields to include in Add Panel
    */
  var addPanelFields: js.Array[WorkItemFieldReference]
  
  /**
    * Color for the backlog level
    */
  var color: String
  
  /**
    * Default list of columns for the backlog
    */
  var columnFields: js.Array[BacklogColumn]
  
  /**
    * Defaulst Work Item Type for the backlog
    */
  var defaultWorkItemType: WorkItemTypeReference
  
  /**
    * Backlog Id (for Legacy Backlog Level from process config it can be categoryref name)
    */
  var id: String
  
  /**
    * Backlog Name
    */
  var name: String
  
  /**
    * Backlog Rank (Taskbacklog is 0)
    */
  var rank: Double
  
  /**
    * Max number of work items to show in the given backlog
    */
  var workItemCountLimit: Double
  
  /**
    * Work Item types participating in this backlog as known by the project/Process, can be overridden by team settings for bugs
    */
  var workItemTypes: js.Array[WorkItemTypeReference]
}
object BacklogLevelConfiguration {
  
  inline def apply(
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
  
  extension [Self <: BacklogLevelConfiguration](x: Self) {
    
    inline def setAddPanelFields(value: js.Array[WorkItemFieldReference]): Self = StObject.set(x, "addPanelFields", value.asInstanceOf[js.Any])
    
    inline def setAddPanelFieldsVarargs(value: WorkItemFieldReference*): Self = StObject.set(x, "addPanelFields", js.Array(value*))
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColumnFields(value: js.Array[BacklogColumn]): Self = StObject.set(x, "columnFields", value.asInstanceOf[js.Any])
    
    inline def setColumnFieldsVarargs(value: BacklogColumn*): Self = StObject.set(x, "columnFields", js.Array(value*))
    
    inline def setDefaultWorkItemType(value: WorkItemTypeReference): Self = StObject.set(x, "defaultWorkItemType", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setWorkItemCountLimit(value: Double): Self = StObject.set(x, "workItemCountLimit", value.asInstanceOf[js.Any])
    
    inline def setWorkItemTypes(value: js.Array[WorkItemTypeReference]): Self = StObject.set(x, "workItemTypes", value.asInstanceOf[js.Any])
    
    inline def setWorkItemTypesVarargs(value: WorkItemTypeReference*): Self = StObject.set(x, "workItemTypes", js.Array(value*))
  }
}
