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
    val __obj = js.Dynamic.literal(environment = environment, project = project, release = release)
  
    __obj.asInstanceOf[DeploymentStartedEvent]
  }
}

