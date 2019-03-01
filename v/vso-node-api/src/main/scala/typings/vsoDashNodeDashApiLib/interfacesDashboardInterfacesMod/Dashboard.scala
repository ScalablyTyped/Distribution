package typings
package vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dashboard extends js.Object {
  var _links: js.Any
  /**
    * Description of the dashboard.
    */
  var description: java.lang.String
  /**
    * Server defined version tracking value, used for edit collision detection.
    */
  var eTag: java.lang.String
  /**
    * ID of the Dashboard. Provided by service at creation time.
    */
  var id: java.lang.String
  /**
    * Name of the Dashboard.
    */
  var name: java.lang.String
  /**
    * ID of the Owner for a dashboard. For any legacy dashboards, this would be the unique identifier for the team associated with the dashboard.
    */
  var ownerId: java.lang.String
  /**
    * Position of the dashboard, within a dashboard group. If unset at creation time, position is decided by the service.
    */
  var position: scala.Double
  /**
    * Interval for client to automatically refresh the dashboard. Expressed in minutes.
    */
  var refreshInterval: scala.Double
  var url: java.lang.String
  /**
    * The set of Widgets on the dashboard.
    */
  var widgets: js.Array[Widget]
}

object Dashboard {
  @scala.inline
  def apply(
    _links: js.Any,
    description: java.lang.String,
    eTag: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    ownerId: java.lang.String,
    position: scala.Double,
    refreshInterval: scala.Double,
    url: java.lang.String,
    widgets: js.Array[Widget]
  ): Dashboard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("eTag")(eTag)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("ownerId")(ownerId)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("refreshInterval")(refreshInterval)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("widgets")(widgets)
    __obj.asInstanceOf[Dashboard]
  }
}

