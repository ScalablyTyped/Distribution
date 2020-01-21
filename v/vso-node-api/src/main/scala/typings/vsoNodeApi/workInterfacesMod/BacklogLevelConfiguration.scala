package typings.vsoNodeApi.workInterfacesMod

import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemFieldReference
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BacklogLevelConfiguration extends js.Object {
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
}

