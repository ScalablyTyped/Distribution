package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildArtifactAddedEvent extends BuildUpdatedEvent {
  var artifact: BuildArtifact
}

object BuildArtifactAddedEvent {
  @scala.inline
  def apply(artifact: BuildArtifact, build: Build, buildId: Double): BuildArtifactAddedEvent = {
    val __obj = js.Dynamic.literal(artifact = artifact.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildArtifactAddedEvent]
  }
}

