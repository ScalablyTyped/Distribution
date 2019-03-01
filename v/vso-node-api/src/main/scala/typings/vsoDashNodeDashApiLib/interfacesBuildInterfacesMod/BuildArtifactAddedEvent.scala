package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildArtifactAddedEvent extends BuildUpdatedEvent {
  var artifact: BuildArtifact
}

object BuildArtifactAddedEvent {
  @scala.inline
  def apply(artifact: BuildArtifact, build: Build, buildId: scala.Double): BuildArtifactAddedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifact")(artifact)
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("buildId")(buildId)
    __obj.asInstanceOf[BuildArtifactAddedEvent]
  }
}

