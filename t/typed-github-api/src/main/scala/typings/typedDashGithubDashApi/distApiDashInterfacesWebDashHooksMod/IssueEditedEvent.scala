package typings.typedDashGithubDashApi.distApiDashInterfacesWebDashHooksMod

import typings.typedDashGithubDashApi.Anon_Body
import typings.typedDashGithubDashApi.distApiDashInterfacesIssueMod.Issue
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.edited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueEditedEvent extends IssueEvent {
  @JSName("action")
  var action_IssueEditedEvent: edited
  var changes: Anon_Body
}

object IssueEditedEvent {
  @scala.inline
  def apply(action: edited, changes: Anon_Body, issue: Issue): IssueEditedEvent = {
    val __obj = js.Dynamic.literal(action = action, changes = changes, issue = issue)
  
    __obj.asInstanceOf[IssueEditedEvent]
  }
}

