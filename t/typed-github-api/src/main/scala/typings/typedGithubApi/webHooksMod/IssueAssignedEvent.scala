package typings.typedGithubApi.webHooksMod

import typings.typedGithubApi.issueMod.Issue
import typings.typedGithubApi.typedGithubApiStrings.assigned
import typings.typedGithubApi.typedGithubApiStrings.unassigned
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueAssignedEvent extends IssueEvent {
  @JSName("action")
  var action_IssueAssignedEvent: assigned | unassigned = js.native
  var assignee: UserSummary = js.native
}

object IssueAssignedEvent {
  @scala.inline
  def apply(action: assigned | unassigned, assignee: UserSummary, issue: Issue): IssueAssignedEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueAssignedEvent]
  }
  @scala.inline
  implicit class IssueAssignedEventOps[Self <: IssueAssignedEvent] (val x: Self) extends AnyVal {
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
    def setAction(value: assigned | unassigned): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssignee(value: UserSummary): Self = this.set("assignee", value.asInstanceOf[js.Any])
  }
  
}

