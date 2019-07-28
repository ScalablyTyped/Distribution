package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionApprovalStep extends ReleaseDefinitionEnvironmentStep {
  var approver: IdentityRef
  var isAutomated: Boolean
  var isNotificationOn: Boolean
  var rank: Double
}

object ReleaseDefinitionApprovalStep {
  @scala.inline
  def apply(approver: IdentityRef, id: Double, isAutomated: Boolean, isNotificationOn: Boolean, rank: Double): ReleaseDefinitionApprovalStep = {
    val __obj = js.Dynamic.literal(approver = approver, id = id, isAutomated = isAutomated, isNotificationOn = isNotificationOn, rank = rank)
  
    __obj.asInstanceOf[ReleaseDefinitionApprovalStep]
  }
}

