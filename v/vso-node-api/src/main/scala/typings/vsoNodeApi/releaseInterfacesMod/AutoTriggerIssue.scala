package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoTriggerIssue extends StObject {
  
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
  implicit class AutoTriggerIssueMutableBuilder[Self <: AutoTriggerIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssue(value: Issue): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueSource(value: IssueSource): Self = StObject.set(x, "issueSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDefinitionReference(value: ReleaseDefinitionShallowReference): Self = StObject.set(x, "releaseDefinitionReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseTriggerType(value: ReleaseTriggerType): Self = StObject.set(x, "releaseTriggerType", value.asInstanceOf[js.Any])
  }
}
