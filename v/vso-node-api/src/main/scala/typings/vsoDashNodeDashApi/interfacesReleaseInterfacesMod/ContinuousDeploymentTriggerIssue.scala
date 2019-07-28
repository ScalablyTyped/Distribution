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
    val __obj = js.Dynamic.literal(artifactType = artifactType, artifactVersionId = artifactVersionId, issue = issue, issueSource = issueSource, project = project, releaseDefinitionReference = releaseDefinitionReference, releaseTriggerType = releaseTriggerType, sourceId = sourceId)
  
    __obj.asInstanceOf[ContinuousDeploymentTriggerIssue]
  }
}

