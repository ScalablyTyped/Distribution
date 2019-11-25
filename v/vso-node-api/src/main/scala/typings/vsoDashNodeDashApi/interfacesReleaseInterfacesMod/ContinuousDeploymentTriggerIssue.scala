package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousDeploymentTriggerIssue extends AutoTriggerIssue {
  var artifactType: String
  var artifactVersionId: String
  var sourceId: String
}

object ContinuousDeploymentTriggerIssue {
  @scala.inline
  def apply(
    artifactType: String,
    artifactVersionId: String,
    issue: Issue,
    issueSource: IssueSource,
    project: ProjectReference,
    releaseDefinitionReference: ReleaseDefinitionShallowReference,
    releaseTriggerType: ReleaseTriggerType,
    sourceId: String
  ): ContinuousDeploymentTriggerIssue = {
    val __obj = js.Dynamic.literal(artifactType = artifactType.asInstanceOf[js.Any], artifactVersionId = artifactVersionId.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], issueSource = issueSource.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], releaseDefinitionReference = releaseDefinitionReference.asInstanceOf[js.Any], releaseTriggerType = releaseTriggerType.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContinuousDeploymentTriggerIssue]
  }
}

