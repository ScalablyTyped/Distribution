package typings
package typedDashGithubDashApiLib.distApiDashInterfacesWebDashHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typedDashGithubDashApiLib.distApiDashInterfacesWebDashHooksMod.WebHookData because var conflicts: action. Inlined sender, organization, repository */ trait IssueWebHookData extends IssueEvent {
  var organization: js.UndefOr[typedDashGithubDashApiLib.distApiDashInterfacesUserMod.OrganizationSummary] = js.undefined
  var repository: js.UndefOr[typedDashGithubDashApiLib.distApiDashInterfacesRepositoryMod.Repository] = js.undefined
  var sender: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
}

