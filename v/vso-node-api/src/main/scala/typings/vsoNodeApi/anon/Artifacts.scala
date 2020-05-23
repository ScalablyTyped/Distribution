package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artifacts extends js.Object {
  var artifacts: scala.Double
  var environments: scala.Double
  var lastRelease: scala.Double
  var none: scala.Double
  var tags: scala.Double
  var triggers: scala.Double
  var variables: scala.Double
}

object Artifacts {
  @scala.inline
  def apply(
    artifacts: scala.Double,
    environments: scala.Double,
    lastRelease: scala.Double,
    none: scala.Double,
    tags: scala.Double,
    triggers: scala.Double,
    variables: scala.Double
  ): Artifacts = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], lastRelease = lastRelease.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifacts]
  }
}

