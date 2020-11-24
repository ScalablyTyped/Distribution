package typings.typedGithubApi.webHooksMod

import typings.typedGithubApi.issueMod.Issue
import typings.typedGithubApi.labelMod.Label
import typings.typedGithubApi.typedGithubApiStrings.labeled
import typings.typedGithubApi.typedGithubApiStrings.unlabeled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssueLabeledEvent extends IssueEvent {
  
  @JSName("action")
  var action_IssueLabeledEvent: labeled | unlabeled = js.native
  
  var label: Label = js.native
}
object IssueLabeledEvent {
  
  @scala.inline
  def apply(action: labeled | unlabeled, issue: Issue, label: Label): IssueLabeledEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueLabeledEvent]
  }
  
  @scala.inline
  implicit class IssueLabeledEventOps[Self <: IssueLabeledEvent] (val x: Self) extends AnyVal {
    
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
    def setAction(value: labeled | unlabeled): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Label): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
