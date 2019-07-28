package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentCompletedEvent extends js.Object {
  var comment: String
  var data: StringDictionary[js.Any]
  var deployment: Deployment
  var environment: ReleaseEnvironment
  var project: ProjectReference
}

object DeploymentCompletedEvent {
  @scala.inline
  def apply(
    comment: String,
    data: StringDictionary[js.Any],
    deployment: Deployment,
    environment: ReleaseEnvironment,
    project: ProjectReference
  ): DeploymentCompletedEvent = {
    val __obj = js.Dynamic.literal(comment = comment, data = data, deployment = deployment, environment = environment, project = project)
  
    __obj.asInstanceOf[DeploymentCompletedEvent]
  }
}

