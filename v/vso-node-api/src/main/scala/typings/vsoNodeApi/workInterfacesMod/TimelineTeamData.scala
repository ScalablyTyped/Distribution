package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineTeamData extends StObject {
  
  /**
    * Backlog matching the mapped backlog associated with this team.
    */
  var backlog: BacklogLevel = js.native
  
  /**
    * The field reference names of the work item data
    */
  var fieldReferenceNames: js.Array[String] = js.native
  
  /**
    * The id of the team
    */
  var id: String = js.native
  
  /**
    * Was iteration and work item data retrieved for this team. <remarks> Teams with IsExpanded false have not had their iteration, work item, and field related data queried and will never contain this data. If true then these items are queried and, if there are items in the queried range, there will be data. </remarks>
    */
  var isExpanded: Boolean = js.native
  
  /**
    * The iteration data, including the work items, in the queried date range.
    */
  var iterations: js.Array[TimelineTeamIteration] = js.native
  
  /**
    * The name of the team
    */
  var name: String = js.native
  
  /**
    * The order by field name of this team
    */
  var orderByField: String = js.native
  
  /**
    * The field reference names of the partially paged work items, such as ID, WorkItemType
    */
  var partiallyPagedFieldReferenceNames: js.Array[String] = js.native
  
  /**
    * The project id the team belongs team
    */
  var projectId: String = js.native
  
  /**
    * Status for this team.
    */
  var status: TimelineTeamStatus = js.native
  
  /**
    * The team field default value
    */
  var teamFieldDefaultValue: String = js.native
  
  /**
    * The team field name of this team
    */
  var teamFieldName: String = js.native
  
  /**
    * The team field values
    */
  var teamFieldValues: js.Array[TeamFieldValue] = js.native
  
  /**
    * Colors for the work item types.
    */
  var workItemTypeColors: js.Array[WorkItemColor] = js.native
}
object TimelineTeamData {
  
  @scala.inline
  def apply(
    backlog: BacklogLevel,
    fieldReferenceNames: js.Array[String],
    id: String,
    isExpanded: Boolean,
    iterations: js.Array[TimelineTeamIteration],
    name: String,
    orderByField: String,
    partiallyPagedFieldReferenceNames: js.Array[String],
    projectId: String,
    status: TimelineTeamStatus,
    teamFieldDefaultValue: String,
    teamFieldName: String,
    teamFieldValues: js.Array[TeamFieldValue],
    workItemTypeColors: js.Array[WorkItemColor]
  ): TimelineTeamData = {
    val __obj = js.Dynamic.literal(backlog = backlog.asInstanceOf[js.Any], fieldReferenceNames = fieldReferenceNames.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orderByField = orderByField.asInstanceOf[js.Any], partiallyPagedFieldReferenceNames = partiallyPagedFieldReferenceNames.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], teamFieldDefaultValue = teamFieldDefaultValue.asInstanceOf[js.Any], teamFieldName = teamFieldName.asInstanceOf[js.Any], teamFieldValues = teamFieldValues.asInstanceOf[js.Any], workItemTypeColors = workItemTypeColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineTeamData]
  }
  
  @scala.inline
  implicit class TimelineTeamDataMutableBuilder[Self <: TimelineTeamData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBacklog(value: BacklogLevel): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldReferenceNames(value: js.Array[String]): Self = StObject.set(x, "fieldReferenceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldReferenceNamesVarargs(value: String*): Self = StObject.set(x, "fieldReferenceNames", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: js.Array[TimelineTeamIteration]): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationsVarargs(value: TimelineTeamIteration*): Self = StObject.set(x, "iterations", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByField(value: String): Self = StObject.set(x, "orderByField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartiallyPagedFieldReferenceNames(value: js.Array[String]): Self = StObject.set(x, "partiallyPagedFieldReferenceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartiallyPagedFieldReferenceNamesVarargs(value: String*): Self = StObject.set(x, "partiallyPagedFieldReferenceNames", js.Array(value :_*))
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: TimelineTeamStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamFieldDefaultValue(value: String): Self = StObject.set(x, "teamFieldDefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamFieldName(value: String): Self = StObject.set(x, "teamFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamFieldValues(value: js.Array[TeamFieldValue]): Self = StObject.set(x, "teamFieldValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamFieldValuesVarargs(value: TeamFieldValue*): Self = StObject.set(x, "teamFieldValues", js.Array(value :_*))
    
    @scala.inline
    def setWorkItemTypeColors(value: js.Array[WorkItemColor]): Self = StObject.set(x, "workItemTypeColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypeColorsVarargs(value: WorkItemColor*): Self = StObject.set(x, "workItemTypeColors", js.Array(value :_*))
  }
}
