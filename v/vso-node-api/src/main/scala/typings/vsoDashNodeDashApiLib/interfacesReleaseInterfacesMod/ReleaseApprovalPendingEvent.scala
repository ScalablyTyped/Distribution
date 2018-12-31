package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseApprovalPendingEvent extends js.Object {
  var approval: ReleaseApproval
  var approvalOptions: ApprovalOptions
  var completedApprovals: js.Array[ReleaseApproval]
  var definitionName: java.lang.String
  var deployment: Deployment
  var environmentId: scala.Double
  var environmentName: java.lang.String
  var environments: js.Array[ReleaseEnvironment]
  var isMultipleRankApproval: scala.Boolean
  var pendingApprovals: js.Array[ReleaseApproval]
  var releaseCreator: java.lang.String
  var releaseName: java.lang.String
  var title: java.lang.String
  var webAccessUri: java.lang.String
}

