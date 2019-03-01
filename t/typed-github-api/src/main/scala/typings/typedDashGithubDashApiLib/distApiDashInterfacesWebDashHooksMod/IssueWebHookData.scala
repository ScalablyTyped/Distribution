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

object IssueWebHookData {
  @scala.inline
  def apply(
    action: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.assigned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.unassigned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.labeled | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.unlabeled | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.opened | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.edited | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.milestoned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.demilestoned | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.reopened,
    issue: typedDashGithubDashApiLib.distApiDashInterfacesIssueMod.Issue,
    sender: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary,
    organization: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.OrganizationSummary = null,
    repository: typedDashGithubDashApiLib.distApiDashInterfacesRepositoryMod.Repository = null
  ): IssueWebHookData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("issue")(issue)
    __obj.updateDynamic("sender")(sender)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    __obj.asInstanceOf[IssueWebHookData]
  }
}

