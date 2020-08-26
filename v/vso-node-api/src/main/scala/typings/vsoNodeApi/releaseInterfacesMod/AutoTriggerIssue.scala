package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoTriggerIssue extends js.Object {
  var issue: Issue = js.native
  var issueSource: IssueSource = js.native
  var project: ProjectReference = js.native
  var releaseDefinitionReference: ReleaseDefinitionShallowReference = js.native
  var releaseTriggerType: ReleaseTriggerType = js.native
}

object AutoTriggerIssue {
  @scala.inline
  def apply(
    issue: Issue,
    issueSource: IssueSource,
    project: ProjectReference,
    releaseDefinitionReference: ReleaseDefinitionShallowReference,
    releaseTriggerType: ReleaseTriggerType
  ): AutoTriggerIssue = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any], issueSource = issueSource.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], releaseDefinitionReference = releaseDefinitionReference.asInstanceOf[js.Any], releaseTriggerType = releaseTriggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoTriggerIssue]
  }
  @scala.inline
  implicit class AutoTriggerIssueOps[Self <: AutoTriggerIssue] (val x: Self) extends AnyVal {
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
    def setIssue(value: Issue): Self = this.set("issue", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssueSource(value: IssueSource): Self = this.set("issueSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: ProjectReference): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseDefinitionReference(value: ReleaseDefinitionShallowReference): Self = this.set("releaseDefinitionReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseTriggerType(value: ReleaseTriggerType): Self = this.set("releaseTriggerType", value.asInstanceOf[js.Any])
  }
  
}

