package typings.typedDashGithubDashApi.distOrganizationMod

import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.OrganizationSummary
import typings.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import typings.typedDashGithubDashApi.distOwnerDashRefMod.OwnerRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedDashGithubDashApi.distInterfacesOrganizationMod.OrganizationSummary because var conflicts: login. Inlined id, avatarUri, description */ @JSImport("typed-github-api/dist/organization", "OrganizationSummaryClass")
@js.native
class OrganizationSummaryClass protected () extends OwnerRefClass {
  def this(data: OrganizationSummary, options: OptionsOrRef) = this()
  var avatarUri: String = js.native
  var description: String = js.native
  var id: Double = js.native
}

