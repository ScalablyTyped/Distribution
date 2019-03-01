package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArtifactSource extends js.Object {
  var artifactSource: scala.Double
  var containerImage: scala.Double
  var `package`: scala.Double
  var pullRequest: scala.Double
  var schedule: scala.Double
  var sourceRepo: scala.Double
  var undefined: scala.Double
}

object Anon_ArtifactSource {
  @scala.inline
  def apply(
    artifactSource: scala.Double,
    containerImage: scala.Double,
    `package`: scala.Double,
    pullRequest: scala.Double,
    schedule: scala.Double,
    sourceRepo: scala.Double,
    undefined: scala.Double
  ): Anon_ArtifactSource = {
    val __obj = js.Dynamic.literal(`package` = `package`)
    __obj.updateDynamic("artifactSource")(artifactSource)
    __obj.updateDynamic("containerImage")(containerImage)
    __obj.updateDynamic("pullRequest")(pullRequest)
    __obj.updateDynamic("schedule")(schedule)
    __obj.updateDynamic("sourceRepo")(sourceRepo)
    __obj.updateDynamic("undefined")(undefined)
    __obj.asInstanceOf[Anon_ArtifactSource]
  }
}

