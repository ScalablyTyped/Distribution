package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

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
    val __obj = js.Dynamic.literal(environments = environments, releaseDefinition = releaseDefinition, releases = releases)
  
    __obj.asInstanceOf[ReleaseDefinitionSummary]
  }
}

