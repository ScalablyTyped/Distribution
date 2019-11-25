package typings.typedDashGithubDashApi.distApiDashInterfacesWebDashHooksMod

import typings.typedDashGithubDashApi.distApiDashInterfacesIssueMod.Issue
import typings.typedDashGithubDashApi.distApiDashInterfacesLabelMod.Label
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.labeled
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.unlabeled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueLabeledEvent extends IssueEvent {
  @JSName("action")
  var action_IssueLabeledEvent: labeled | unlabeled
  var label: Label
}

object IssueLabeledEvent {
  @scala.inline
  def apply(action: labeled | unlabeled, issue: Issue, label: Label): IssueLabeledEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssueLabeledEvent]
  }
}

