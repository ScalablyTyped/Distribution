package typings.typedGithubApi.webHooksMod

import typings.typedGithubApi.issueMod.Issue
import typings.typedGithubApi.repositoryMod.Repository
import typings.typedGithubApi.typedGithubApiStrings.assigned
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.demilestoned
import typings.typedGithubApi.typedGithubApiStrings.edited
import typings.typedGithubApi.typedGithubApiStrings.labeled
import typings.typedGithubApi.typedGithubApiStrings.milestoned
import typings.typedGithubApi.typedGithubApiStrings.opened
import typings.typedGithubApi.typedGithubApiStrings.reopened
import typings.typedGithubApi.typedGithubApiStrings.unassigned
import typings.typedGithubApi.typedGithubApiStrings.unlabeled
import typings.typedGithubApi.userMod.OrganizationSummary
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedGithubApi.webHooksMod.Event because Already inherited
- typings.typedGithubApi.webHooksMod.WebHookData because var conflicts: action. Inlined sender, organization, repository */ trait IssueWebHookData extends IssueEvent {
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

