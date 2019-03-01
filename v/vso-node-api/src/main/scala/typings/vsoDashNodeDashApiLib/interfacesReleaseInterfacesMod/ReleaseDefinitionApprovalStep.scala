package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionApprovalStep extends ReleaseDefinitionEnvironmentStep {
  var approver: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var isAutomated: scala.Boolean
  var isNotificationOn: scala.Boolean
  var rank: scala.Double
}

object ReleaseDefinitionApprovalStep {
  @scala.inline
  def apply(
    approver: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    id: scala.Double,
    isAutomated: scala.Boolean,
    isNotificationOn: scala.Boolean,
    rank: scala.Double
  ): ReleaseDefinitionApprovalStep = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approver")(approver)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isAutomated")(isAutomated)
    __obj.updateDynamic("isNotificationOn")(isNotificationOn)
    __obj.updateDynamic("rank")(rank)
    __obj.asInstanceOf[ReleaseDefinitionApprovalStep]
  }
}

