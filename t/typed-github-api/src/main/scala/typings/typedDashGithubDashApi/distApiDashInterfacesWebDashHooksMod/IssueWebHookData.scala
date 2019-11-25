package typings.typedDashGithubDashApi.distApiDashInterfacesWebDashHooksMod

import typings.typedDashGithubDashApi.distApiDashInterfacesIssueMod.Issue
import typings.typedDashGithubDashApi.distApiDashInterfacesRepositoryMod.Repository
import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.OrganizationSummary
import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserSummary
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.assigned
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.demilestoned
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.edited
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.labeled
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.milestoned
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.opened
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.reopened
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.unassigned
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.unlabeled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedDashGithubDashApi.distApiDashInterfacesWebDashHooksMod.Event because Already inherited
- typings.typedDashGithubDashApi.distApiDashInterfacesWebDashHooksMod.WebHookData because var conflicts: action. Inlined sender, organization, repository */ trait IssueWebHookData extends IssueEvent {
  var organization: js.UndefOr[OrganizationSummary] = js.undefined
  var repository: js.UndefOr[Repository] = js.undefined
  var sender: UserSummary
}

object IssueWebHookData {
  @scala.inline
  def apply(
    action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
    issue: Issue,
    sender: UserSummary,
    organization: OrganizationSummary = null,
    repository: Repository = null
  ): IssueWebHookData = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueWebHookData]
  }
}

