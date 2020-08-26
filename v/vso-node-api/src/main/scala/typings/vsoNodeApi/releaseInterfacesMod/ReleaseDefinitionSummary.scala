package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDefinitionSummary extends js.Object {
  var environments: js.Array[ReleaseDefinitionEnvironmentSummary] = js.native
  var releaseDefinition: ReleaseDefinitionShallowReference = js.native
  var releases: js.Array[Release] = js.native
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
  @scala.inline
  implicit class ReleaseDefinitionSummaryOps[Self <: ReleaseDefinitionSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnvironmentsVarargs(value: ReleaseDefinitionEnvironmentSummary*): Self = this.set("environments", js.Array(value :_*))
    @scala.inline
    def setEnvironments(value: js.Array[ReleaseDefinitionEnvironmentSummary]): Self = this.set("environments", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = this.set("releaseDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleasesVarargs(value: Release*): Self = this.set("releases", js.Array(value :_*))
    @scala.inline
    def setReleases(value: js.Array[Release]): Self = this.set("releases", value.asInstanceOf[js.Any])
  }
  
}

