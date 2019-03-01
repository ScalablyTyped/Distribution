package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentCompletedEvent extends js.Object {
  var comment: java.lang.String
  var data: org.scalablytyped.runtime.StringDictionary[js.Any]
  var deployment: Deployment
  var environment: ReleaseEnvironment
  var project: ProjectReference
}

object DeploymentCompletedEvent {
  @scala.inline
  def apply(
    comment: java.lang.String,
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    deployment: Deployment,
    environment: ReleaseEnvironment,
    project: ProjectReference
  ): DeploymentCompletedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("deployment")(deployment)
    __obj.updateDynamic("environment")(environment)
    __obj.updateDynamic("project")(project)
    __obj.asInstanceOf[DeploymentCompletedEvent]
  }
}

