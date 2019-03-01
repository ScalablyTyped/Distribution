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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("issue")(issue)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[IssueLabeledEvent]
  }
}

