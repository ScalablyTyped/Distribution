package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BacklogLevelConfiguration extends js.Object {
  /**
    * List of fields to include in Add Panel
    */
  var addPanelFields: js.Array[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemFieldReference
  ]
  /**
    * Color for the backlog level
    */
  var color: java.lang.String
  /**
    * Default list of columns for the backlog
    */
  var columnFields: js.Array[BacklogColumn]
  /**
    * Defaulst Work Item Type for the backlog
    */
  var defaultWorkItemType: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeReference
  /**
    * Backlog Id (for Legacy Backlog Level from process config it can be categoryref name)
    */
  var id: java.lang.String
  /**
    * Backlog Name
    */
  var name: java.lang.String
  /**
    * Backlog Rank (Taskbacklog is 0)
    */
  var rank: scala.Double
  /**
    * Max number of work items to show in the given backlog
    */
  var workItemCountLimit: scala.Double
  /**
    * Work Item types participating in this backlog as known by the project/Process, can be overridden by team settings for bugs
    */
  var workItemTypes: js.Array[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeReference
  ]
}

object BacklogLevelConfiguration {
  @scala.inline
  def apply(
    addPanelFields: js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemFieldReference
    ],
    color: java.lang.String,
    columnFields: js.Array[BacklogColumn],
    defaultWorkItemType: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeReference,
    id: java.lang.String,
    name: java.lang.String,
    rank: scala.Double,
    workItemCountLimit: scala.Double,
    workItemTypes: js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeReference
    ]
  ): BacklogLevelConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addPanelFields")(addPanelFields)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("columnFields")(columnFields)
    __obj.updateDynamic("defaultWorkItemType")(defaultWorkItemType)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("rank")(rank)
    __obj.updateDynamic("workItemCountLimit")(workItemCountLimit)
    __obj.updateDynamic("workItemTypes")(workItemTypes)
    __obj.asInstanceOf[BacklogLevelConfiguration]
  }
}

