package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineTeamData extends js.Object {
  /**
    * Backlog matching the mapped backlog associated with this team.
    */
  var backlog: BacklogLevel
  /**
    * The field reference names of the work item data
    */
  var fieldReferenceNames: js.Array[String]
  /**
    * The id of the team
    */
  var id: String
  /**
    * Was iteration and work item data retrieved for this team. <remarks> Teams with IsExpanded false have not had their iteration, work item, and field related data queried and will never contain this data. If true then these items are queried and, if there are items in the queried range, there will be data. </remarks>
    */
  var isExpanded: Boolean
  /**
    * The iteration data, including the work items, in the queried date range.
    */
  var iterations: js.Array[TimelineTeamIteration]
  /**
    * The name of the team
    */
  var name: String
  /**
    * The order by field name of this team
    */
  var orderByField: String
  /**
    * The field reference names of the partially paged work items, such as ID, WorkItemType
    */
  var partiallyPagedFieldReferenceNames: js.Array[String]
  /**
    * The project id the team belongs team
    */
  var projectId: String
  /**
    * Status for this team.
    */
  var status: TimelineTeamStatus
  /**
    * The team field default value
    */
  var teamFieldDefaultValue: String
  /**
    * The team field name of this team
    */
  var teamFieldName: String
  /**
    * The team field values
    */
  var teamFieldValues: js.Array[TeamFieldValue]
  /**
    * Colors for the work item types.
    */
  var workItemTypeColors: js.Array[WorkItemColor]
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
}

