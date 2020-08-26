package typings.typedGithubApi.webHooksMod

import typings.typedGithubApi.anon.Body
import typings.typedGithubApi.issueMod.Issue
import typings.typedGithubApi.typedGithubApiStrings.edited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueEditedEvent extends IssueEvent {
  @JSName("action")
  var action_IssueEditedEvent: edited = js.native
  var changes: Body = js.native
}

object IssueEditedEvent {
  @scala.inline
  def apply(action: edited, changes: Body, issue: Issue): IssueEditedEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueEditedEvent]
  }
  @scala.inline
  implicit class IssueEditedEventOps[Self <: IssueEditedEvent] (val x: Self) extends AnyVal {
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
    def setAction(value: edited): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setChanges(value: Body): Self = this.set("changes", value.asInstanceOf[js.Any])
  }
  
}

