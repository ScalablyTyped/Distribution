package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeploymentStartedEvent]
  }
}

