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
    val __obj = js.Dynamic.literal(approver = approver, id = id, isAutomated = isAutomated, isNotificationOn = isNotificationOn, rank = rank)
  
    __obj.asInstanceOf[ReleaseDefinitionApprovalStep]
  }
}

