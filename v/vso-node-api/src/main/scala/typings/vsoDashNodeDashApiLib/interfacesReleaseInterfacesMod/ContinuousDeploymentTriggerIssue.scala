package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousDeploymentTriggerIssue extends AutoTriggerIssue {
  var artifactType: java.lang.String
  var artifactVersionId: java.lang.String
  var sourceId: java.lang.String
}

object ContinuousDeploymentTriggerIssue {
  @scala.inline
  def apply(
    artifactType: java.lang.String,
    artifactVersionId: java.lang.String,
    issue: Issue,
    issueSource: IssueSource,
    project: ProjectReference,
    releaseDefinitionReference: ReleaseDefinitionShallowReference,
    releaseTriggerType: ReleaseTriggerType,
    sourceId: java.lang.String
  ): ContinuousDeploymentTriggerIssue = {
    val __obj = js.Dynamic.literal(artifactType = artifactType, artifactVersionId = artifactVersionId, issue = issue, issueSource = issueSource, project = project, releaseDefinitionReference = releaseDefinitionReference, releaseTriggerType = releaseTriggerType, sourceId = sourceId)
  
    __obj.asInstanceOf[ContinuousDeploymentTriggerIssue]
  }
}

