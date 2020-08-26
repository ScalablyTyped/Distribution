package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuousDeploymentTriggerIssue extends AutoTriggerIssue {
  var artifactType: String = js.native
  var artifactVersionId: String = js.native
  var sourceId: String = js.native
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
  @scala.inline
  implicit class ContinuousDeploymentTriggerIssueOps[Self <: ContinuousDeploymentTriggerIssue] (val x: Self) extends AnyVal {
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
    def setArtifactType(value: String): Self = this.set("artifactType", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtifactVersionId(value: String): Self = this.set("artifactVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceId(value: String): Self = this.set("sourceId", value.asInstanceOf[js.Any])
  }
  
}

