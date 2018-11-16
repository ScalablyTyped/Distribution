package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReleaseGates extends js.Object {
  var deploymentJobs: js.Array[DeploymentJob]
  var id: scala.Double
  var lastModifiedOn: stdLib.Date
  var runPlanId: java.lang.String
  var stabilizationCompletedOn: stdLib.Date
  var startedOn: stdLib.Date
  var status: GateStatus
}

