package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineTeamData extends js.Object {
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
  implicit class TimelineTeamDataOps[Self <: TimelineTeamData] (val x: Self) extends AnyVal {
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
    def setBacklog(value: BacklogLevel): Self = this.set("backlog", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldReferenceNamesVarargs(value: String*): Self = this.set("fieldReferenceNames", js.Array(value :_*))
    @scala.inline
    def setFieldReferenceNames(value: js.Array[String]): Self = this.set("fieldReferenceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterationsVarargs(value: TimelineTeamIteration*): Self = this.set("iterations", js.Array(value :_*))
    @scala.inline
    def setIterations(value: js.Array[TimelineTeamIteration]): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrderByField(value: String): Self = this.set("orderByField", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartiallyPagedFieldReferenceNamesVarargs(value: String*): Self = this.set("partiallyPagedFieldReferenceNames", js.Array(value :_*))
    @scala.inline
    def setPartiallyPagedFieldReferenceNames(value: js.Array[String]): Self = this.set("partiallyPagedFieldReferenceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: TimelineTeamStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamFieldDefaultValue(value: String): Self = this.set("teamFieldDefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamFieldName(value: String): Self = this.set("teamFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamFieldValuesVarargs(value: TeamFieldValue*): Self = this.set("teamFieldValues", js.Array(value :_*))
    @scala.inline
    def setTeamFieldValues(value: js.Array[TeamFieldValue]): Self = this.set("teamFieldValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkItemTypeColorsVarargs(value: WorkItemColor*): Self = this.set("workItemTypeColors", js.Array(value :_*))
    @scala.inline
    def setWorkItemTypeColors(value: js.Array[WorkItemColor]): Self = this.set("workItemTypeColors", value.asInstanceOf[js.Any])
  }
  
}

