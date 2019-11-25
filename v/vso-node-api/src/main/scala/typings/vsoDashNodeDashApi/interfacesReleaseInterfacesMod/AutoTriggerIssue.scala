package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoTriggerIssue extends js.Object {
  var issue: Issue
  var issueSource: IssueSource
  var project: ProjectReference
  var releaseDefinitionReference: ReleaseDefinitionShallowReference
  var releaseTriggerType: ReleaseTriggerType
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
}

