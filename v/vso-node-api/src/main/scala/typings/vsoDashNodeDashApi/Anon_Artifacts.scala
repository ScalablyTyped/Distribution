package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Artifacts extends js.Object {
  var artifacts: Double
  var environments: Double
  var lastRelease: Double
  var none: Double
  var tags: Double
  var triggers: Double
  var variables: Double
}

object Anon_Artifacts {
  @scala.inline
  def apply(
    artifacts: Double,
    environments: Double,
    lastRelease: Double,
    none: Double,
    tags: Double,
    triggers: Double,
    variables: Double
  ): Anon_Artifacts = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], lastRelease = lastRelease.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Artifacts]
  }
}

