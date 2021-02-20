package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ContinuousDeploymentTriggerIssueMutableBuilder[Self <: ContinuousDeploymentTriggerIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactType(value: String): Self = StObject.set(x, "artifactType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactVersionId(value: String): Self = StObject.set(x, "artifactVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
  }
}
