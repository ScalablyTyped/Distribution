package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentStartedEvent extends js.Object {
  var environment: ReleaseEnvironment
  var project: ProjectReference
  var release: Release
}

object DeploymentStartedEvent {
  @scala.inline
  def apply(environment: ReleaseEnvironment, project: ProjectReference, release: Release): DeploymentStartedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("environment")(environment)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[DeploymentStartedEvent]
  }
}

