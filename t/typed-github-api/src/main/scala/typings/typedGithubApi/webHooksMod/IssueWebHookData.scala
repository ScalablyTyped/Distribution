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
- typings.typedGithubApi.webHooksMod.WebHookData because var conflicts: action. Inlined sender, organization, repository */ @js.native
trait IssueWebHookData extends IssueEvent {
  var organization: js.UndefOr[OrganizationSummary] = js.native
  var repository: js.UndefOr[Repository] = js.native
  var sender: UserSummary = js.native
}

object IssueWebHookData {
  @scala.inline
  def apply(
    action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
    issue: Issue,
    sender: UserSummary
  ): IssueWebHookData = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueWebHookData]
  }
  @scala.inline
  implicit class IssueWebHookDataOps[Self <: IssueWebHookData] (val x: Self) extends AnyVal {
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
    def setSender(value: UserSummary): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganization(value: OrganizationSummary): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    @scala.inline
    def setRepository(value: Repository): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
  }
  
}

