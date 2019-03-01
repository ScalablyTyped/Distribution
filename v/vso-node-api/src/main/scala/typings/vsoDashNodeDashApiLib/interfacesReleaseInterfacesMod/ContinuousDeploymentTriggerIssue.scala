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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifactType")(artifactType)
    __obj.updateDynamic("artifactVersionId")(artifactVersionId)
    __obj.updateDynamic("issue")(issue)
    __obj.updateDynamic("issueSource")(issueSource)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("releaseDefinitionReference")(releaseDefinitionReference)
    __obj.updateDynamic("releaseTriggerType")(releaseTriggerType)
    __obj.updateDynamic("sourceId")(sourceId)
    __obj.asInstanceOf[ContinuousDeploymentTriggerIssue]
  }
}

