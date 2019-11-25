package typings.vsoDashNodeDashApi.interfacesPolicyInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyEvaluationRecord extends js.Object {
  /**
    * Links to other related objects
    */
  var _links: js.Any
  /**
    * A string which uniquely identifies the target of a policy evaluation.
    */
  var artifactId: String
  /**
    * Time when this policy finished evaluating on this pull request.
    */
  var completedDate: Date
  /**
    * Contains all configuration data for the policy which is being evaluated.
    */
  var configuration: PolicyConfiguration
  /**
    * Internal context data of this policy evaluation.
    */
  var context: js.Any
  /**
    * Guid which uniquely identifies this evaluation record (one policy running on one pull request).
    */
  var evaluationId: String
  /**
    * Time when this policy was first evaluated on this pull request.
    */
  var startedDate: Date
  /**
    * Status of the policy (Running, Approved, Failed, etc.)
    */
  var status: PolicyEvaluationStatus
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
}

