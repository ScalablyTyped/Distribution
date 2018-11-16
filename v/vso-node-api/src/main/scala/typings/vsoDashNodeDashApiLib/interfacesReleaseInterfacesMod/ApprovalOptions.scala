package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApprovalOptions extends js.Object {
  var autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped: scala.Boolean
  var enforceIdentityRevalidation: scala.Boolean
  var executionOrder: ApprovalExecutionOrder
  var releaseCreatorCanBeApprover: scala.Boolean
  var requiredApproverCount: scala.Double
  var timeoutInMinutes: scala.Double
}

