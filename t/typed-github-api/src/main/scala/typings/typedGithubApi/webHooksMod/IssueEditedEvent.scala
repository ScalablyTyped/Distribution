package typings.typedGithubApi.webHooksMod

import typings.typedGithubApi.anon.Body
import typings.typedGithubApi.issueMod.Issue
import typings.typedGithubApi.typedGithubApiStrings.edited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueEditedEvent extends IssueEvent {
  @JSName("action")
  var action_IssueEditedEvent: edited
  var changes: Body
}

object IssueEditedEvent {
  @scala.inline
  def apply(action: edited, changes: Body, issue: Issue): IssueEditedEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueEditedEvent]
  }
}

