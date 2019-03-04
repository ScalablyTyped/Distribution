package typings
package vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardGroup extends js.Object {
  var _links: js.Any
  /**
    * A list of Dashboards held by the Dashboard Group
    */
  var dashboardEntries: js.Array[DashboardGroupEntry]
  /**
    * Deprecated: The old permission model describing the level of permissions for the current team. Pre-M125.
    */
  var permission: GroupMemberPermission
  /**
    * A permissions bit mask describing the security permissions of the current team for dashboards. When this permission is the value None, use GroupMemberPermission. Permissions are evaluated based on the presence of a value other than None, else the GroupMemberPermission will be saved.
    */
  var teamDashboardPermission: TeamDashboardPermission
  var url: java.lang.String
}

object DashboardGroup {
  @scala.inline
  def apply(
    _links: js.Any,
    dashboardEntries: js.Array[DashboardGroupEntry],
    permission: GroupMemberPermission,
    teamDashboardPermission: TeamDashboardPermission,
    url: java.lang.String
  ): DashboardGroup = {
    val __obj = js.Dynamic.literal(_links = _links, dashboardEntries = dashboardEntries, permission = permission, teamDashboardPermission = teamDashboardPermission, url = url)
  
    __obj.asInstanceOf[DashboardGroup]
  }
}

