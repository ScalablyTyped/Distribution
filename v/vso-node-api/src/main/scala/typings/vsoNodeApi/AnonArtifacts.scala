package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArtifacts extends js.Object {
  var artifacts: Double
  var environments: Double
  var lastRelease: Double
  var none: Double
  var tags: Double
  var triggers: Double
  var variables: Double
}

object AnonArtifacts {
  @scala.inline
  def apply(
    artifacts: Double,
    environments: Double,
    lastRelease: Double,
    none: Double,
    tags: Double,
    triggers: Double,
    variables: Double
  ): AnonArtifacts = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], lastRelease = lastRelease.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArtifacts]
  }
}

