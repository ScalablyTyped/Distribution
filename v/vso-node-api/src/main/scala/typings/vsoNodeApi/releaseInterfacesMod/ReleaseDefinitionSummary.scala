package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionSummary extends js.Object {
  var environments: js.Array[ReleaseDefinitionEnvironmentSummary]
  var releaseDefinition: ReleaseDefinitionShallowReference
  var releases: js.Array[Release]
}

object ReleaseDefinitionSummary {
  @scala.inline
  def apply(
    environments: js.Array[ReleaseDefinitionEnvironmentSummary],
    releaseDefinition: ReleaseDefinitionShallowReference,
    releases: js.Array[Release]
  ): ReleaseDefinitionSummary = {
    val __obj = js.Dynamic.literal(environments = environments.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releases = releases.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionSummary]
  }
}

