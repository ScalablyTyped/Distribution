package typings
package typedDashGithubDashApiLib.distOrganizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typedDashGithubDashApiLib.distInterfacesOrganizationMod.OrganizationSummary because var conflicts: login. Inlined id, avatarUri, description */ @JSImport("typed-github-api/dist/organization", "OrganizationSummaryClass")
@js.native
class OrganizationSummaryClass protected ()
  extends typedDashGithubDashApiLib.distOwnerDashRefMod.OwnerRefClass {
  def this(data: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.OrganizationSummary, options: typedDashGithubDashApiLib.distGithubDashRefMod.OptionsOrRef) = this()
  var avatarUri: java.lang.String = js.native
  var description: java.lang.String = js.native
  var id: scala.Double = js.native
}

