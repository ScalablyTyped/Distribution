package typings.vsoNodeApi.dashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dashboard extends js.Object {
  var _links: js.Any
  /**
    * Description of the dashboard.
    */
  var description: String
  /**
    * Server defined version tracking value, used for edit collision detection.
    */
  var eTag: String
  /**
    * ID of the Dashboard. Provided by service at creation time.
    */
  var id: String
  /**
    * Name of the Dashboard.
    */
  var name: String
  /**
    * ID of the Owner for a dashboard. For any legacy dashboards, this would be the unique identifier for the team associated with the dashboard.
    */
  var ownerId: String
  /**
    * Position of the dashboard, within a dashboard group. If unset at creation time, position is decided by the service.
    */
  var position: Double
  /**
    * Interval for client to automatically refresh the dashboard. Expressed in minutes.
    */
  var refreshInterval: Double
  var url: String
  /**
    * The set of Widgets on the dashboard.
    */
  var widgets: js.Array[Widget]
}

object Dashboard {
  @scala.inline
  def apply(
    _links: js.Any,
    description: String,
    eTag: String,
    id: String,
    name: String,
    ownerId: String,
    position: Double,
    refreshInterval: Double,
    url: String,
    widgets: js.Array[Widget]
  ): Dashboard = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], refreshInterval = refreshInterval.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dashboard]
  }
}

