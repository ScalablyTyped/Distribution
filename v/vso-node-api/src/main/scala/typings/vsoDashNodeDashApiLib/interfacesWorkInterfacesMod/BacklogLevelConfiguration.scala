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

