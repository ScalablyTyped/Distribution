package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

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
  var fieldReferenceNames: js.Array[java.lang.String]
  /**
    * The id of the team
    */
  var id: java.lang.String
  /**
    * Was iteration and work item data retrieved for this team. <remarks> Teams with IsExpanded false have not had their iteration, work item, and field related data queried and will never contain this data. If true then these items are queried and, if there are items in the queried range, there will be data. </remarks>
    */
  var isExpanded: scala.Boolean
  /**
    * The iteration data, including the work items, in the queried date range.
    */
  var iterations: js.Array[TimelineTeamIteration]
  /**
    * The name of the team
    */
  var name: java.lang.String
  /**
    * The order by field name of this team
    */
  var orderByField: java.lang.String
  /**
    * The field reference names of the partially paged work items, such as ID, WorkItemType
    */
  var partiallyPagedFieldReferenceNames: js.Array[java.lang.String]
  /**
    * The project id the team belongs team
    */
  var projectId: java.lang.String
  /**
    * Status for this team.
    */
  var status: TimelineTeamStatus
  /**
    * The team field default value
    */
  var teamFieldDefaultValue: java.lang.String
  /**
    * The team field name of this team
    */
  var teamFieldName: java.lang.String
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
    fieldReferenceNames: js.Array[java.lang.String],
    id: java.lang.String,
    isExpanded: scala.Boolean,
    iterations: js.Array[TimelineTeamIteration],
    name: java.lang.String,
    orderByField: java.lang.String,
    partiallyPagedFieldReferenceNames: js.Array[java.lang.String],
    projectId: java.lang.String,
    status: TimelineTeamStatus,
    teamFieldDefaultValue: java.lang.String,
    teamFieldName: java.lang.String,
    teamFieldValues: js.Array[TeamFieldValue],
    workItemTypeColors: js.Array[WorkItemColor]
  ): TimelineTeamData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backlog")(backlog)
    __obj.updateDynamic("fieldReferenceNames")(fieldReferenceNames)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isExpanded")(isExpanded)
    __obj.updateDynamic("iterations")(iterations)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("orderByField")(orderByField)
    __obj.updateDynamic("partiallyPagedFieldReferenceNames")(partiallyPagedFieldReferenceNames)
    __obj.updateDynamic("projectId")(projectId)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("teamFieldDefaultValue")(teamFieldDefaultValue)
    __obj.updateDynamic("teamFieldName")(teamFieldName)
    __obj.updateDynamic("teamFieldValues")(teamFieldValues)
    __obj.updateDynamic("workItemTypeColors")(workItemTypeColors)
    __obj.asInstanceOf[TimelineTeamData]
  }
}

