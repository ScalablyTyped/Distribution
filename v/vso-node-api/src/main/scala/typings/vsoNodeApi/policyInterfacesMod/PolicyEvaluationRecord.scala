package typings.vsoNodeApi.policyInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyEvaluationRecord extends js.Object {
  
  /**
    * Links to other related objects
    */
  var _links: js.Any = js.native
  
  /**
    * A string which uniquely identifies the target of a policy evaluation.
    */
  var artifactId: String = js.native
  
  /**
    * Time when this policy finished evaluating on this pull request.
    */
  var completedDate: Date = js.native
  
  /**
    * Contains all configuration data for the policy which is being evaluated.
    */
  var configuration: PolicyConfiguration = js.native
  
  /**
    * Internal context data of this policy evaluation.
    */
  var context: js.Any = js.native
  
  /**
    * Guid which uniquely identifies this evaluation record (one policy running on one pull request).
    */
  var evaluationId: String = js.native
  
  /**
    * Time when this policy was first evaluated on this pull request.
    */
  var startedDate: Date = js.native
  
  /**
    * Status of the policy (Running, Approved, Failed, etc.)
    */
  var status: PolicyEvaluationStatus = js.native
}
object PolicyEvaluationRecord {
  
  @scala.inline
  def apply(
    _links: js.Any,
    artifactId: String,
    completedDate: Date,
    configuration: PolicyConfiguration,
    context: js.Any,
    evaluationId: String,
    startedDate: Date,
    status: PolicyEvaluationStatus
  ): PolicyEvaluationRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], artifactId = artifactId.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], evaluationId = evaluationId.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyEvaluationRecord]
  }
  
  @scala.inline
  implicit class PolicyEvaluationRecordOps[Self <: PolicyEvaluationRecord] (val x: Self) extends AnyVal {
    
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactId(value: String): Self = this.set("artifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDate(value: Date): Self = this.set("completedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: PolicyConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationId(value: String): Self = this.set("evaluationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedDate(value: Date): Self = this.set("startedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: PolicyEvaluationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
