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
    val __obj = js.Dynamic.literal(artifacts = artifacts, environments = environments, lastRelease = lastRelease, none = none, tags = tags, triggers = triggers, variables = variables)
  
    __obj.asInstanceOf[Anon_Artifacts]
  }
}

