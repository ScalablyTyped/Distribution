package typings.typedGithubApi.webHooksMod

import typings.typedGithubApi.issueMod.Issue
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueEvent extends Event {
  @JSName("action")
  var action_IssueEvent: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened = js.native
  var issue: Issue = js.native
}

object IssueEvent {
  @scala.inline
  def apply(
    action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
    issue: Issue
  ): IssueEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueEvent]
  }
  @scala.inline
  implicit class IssueEventOps[Self <: IssueEvent] (val x: Self) extends AnyVal {
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
    def setAction(
      value: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
    ): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssue(value: Issue): Self = this.set("issue", value.asInstanceOf[js.Any])
  }
  
}

