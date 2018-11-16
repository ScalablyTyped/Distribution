package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeploymentManualInterventionPendingEvent extends js.Object {
  var deployment: Deployment
  var emailRecipients: js.Array[java.lang.String]
  var environmentOwner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var manualIntervention: ManualIntervention
  var project: ProjectReference
  var release: Release
}

