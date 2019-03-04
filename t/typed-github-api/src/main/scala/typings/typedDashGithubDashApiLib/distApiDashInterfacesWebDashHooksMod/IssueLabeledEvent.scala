package typings
package typedDashGithubDashApiLib.distApiDashInterfacesWebDashHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueLabeledEvent extends IssueEvent {
  @JSName("action")
  var action_IssueLabeledEvent: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.labeled | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.unlabeled
  var label: typedDashGithubDashApiLib.distApiDashInterfacesLabelMod.Label
}

object IssueLabeledEvent {
  @scala.inline
  def apply(
    action: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.labeled | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.unlabeled,
    issue: typedDashGithubDashApiLib.distApiDashInterfacesIssueMod.Issue,
    label: typedDashGithubDashApiLib.distApiDashInterfacesLabelMod.Label
  ): IssueLabeledEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue, label = label)
  
    __obj.asInstanceOf[IssueLabeledEvent]
  }
}

