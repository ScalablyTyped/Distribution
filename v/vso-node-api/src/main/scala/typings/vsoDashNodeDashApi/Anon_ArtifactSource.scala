package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArtifactSource extends js.Object {
  var artifactSource: Double
  var containerImage: Double
  var `package`: Double
  var pullRequest: Double
  var schedule: Double
  var sourceRepo: Double
  var undefined: Double
}

object Anon_ArtifactSource {
  @scala.inline
  def apply(
    artifactSource: Double,
    containerImage: Double,
    `package`: Double,
    pullRequest: Double,
    schedule: Double,
    sourceRepo: Double,
    undefined: Double
  ): Anon_ArtifactSource = {
    val __obj = js.Dynamic.literal(artifactSource = artifactSource, containerImage = containerImage, pullRequest = pullRequest, schedule = schedule, sourceRepo = sourceRepo, undefined = undefined)
    __obj.updateDynamic("package")(`package`)
    __obj.asInstanceOf[Anon_ArtifactSource]
  }
}

