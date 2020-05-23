package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactSource extends js.Object {
  @JSName("package")
  var _package: scala.Double
  var artifactSource: scala.Double
  var containerImage: scala.Double
  var pullRequest: scala.Double
  var schedule: scala.Double
  var sourceRepo: scala.Double
  var undefined: scala.Double
}

object ArtifactSource {
  @scala.inline
  def apply(
    _package: scala.Double,
    artifactSource: scala.Double,
    containerImage: scala.Double,
    pullRequest: scala.Double,
    schedule: scala.Double,
    sourceRepo: scala.Double,
    undefined: scala.Double
  ): ArtifactSource = {
    val __obj = js.Dynamic.literal(artifactSource = artifactSource.asInstanceOf[js.Any], containerImage = containerImage.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], sourceRepo = sourceRepo.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSource]
  }
}

