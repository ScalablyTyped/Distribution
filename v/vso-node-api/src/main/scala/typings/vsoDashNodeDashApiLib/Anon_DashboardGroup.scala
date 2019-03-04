package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DashboardGroup extends js.Object {
  var DashboardGroup: js.Any
  var DashboardScope: Anon_EnumValuesAnonCollectionUser
  var GroupMemberPermission: Anon_EnumValuesAnonEdit
  var TeamDashboardPermission: Anon_EnumValuesAnonCreate
  var WidgetMetadata: js.Any
  var WidgetMetadataResponse: js.Any
  var WidgetScope: Anon_EnumValuesAnonCollectionUser
  var WidgetTypesResponse: js.Any
}

object Anon_DashboardGroup {
  @scala.inline
  def apply(
    DashboardGroup: js.Any,
    DashboardScope: Anon_EnumValuesAnonCollectionUser,
    GroupMemberPermission: Anon_EnumValuesAnonEdit,
    TeamDashboardPermission: Anon_EnumValuesAnonCreate,
    WidgetMetadata: js.Any,
    WidgetMetadataResponse: js.Any,
    WidgetScope: Anon_EnumValuesAnonCollectionUser,
    WidgetTypesResponse: js.Any
  ): Anon_DashboardGroup = {
    val __obj = js.Dynamic.literal(DashboardGroup = DashboardGroup, DashboardScope = DashboardScope, GroupMemberPermission = GroupMemberPermission, TeamDashboardPermission = TeamDashboardPermission, WidgetMetadata = WidgetMetadata, WidgetMetadataResponse = WidgetMetadataResponse, WidgetScope = WidgetScope, WidgetTypesResponse = WidgetTypesResponse)
  
    __obj.asInstanceOf[Anon_DashboardGroup]
  }
}

