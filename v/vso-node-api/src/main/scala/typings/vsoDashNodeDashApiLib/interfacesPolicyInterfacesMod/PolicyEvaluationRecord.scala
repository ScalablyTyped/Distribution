package typings
package vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod

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
  var artifactId: java.lang.String
  /**
    * Time when this policy finished evaluating on this pull request.
    */
  var completedDate: stdLib.Date
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
  var evaluationId: java.lang.String
  /**
    * Time when this policy was first evaluated on this pull request.
    */
  var startedDate: stdLib.Date
  /**
    * Status of the policy (Running, Approved, Failed, etc.)
    */
  var status: PolicyEvaluationStatus
}

object PolicyEvaluationRecord {
  @scala.inline
  def apply(
    _links: js.Any,
    artifactId: java.lang.String,
    completedDate: stdLib.Date,
    configuration: PolicyConfiguration,
    context: js.Any,
    evaluationId: java.lang.String,
    startedDate: stdLib.Date,
    status: PolicyEvaluationStatus
  ): PolicyEvaluationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("artifactId")(artifactId)
    __obj.updateDynamic("completedDate")(completedDate)
    __obj.updateDynamic("configuration")(configuration)
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("evaluationId")(evaluationId)
    __obj.updateDynamic("startedDate")(startedDate)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[PolicyEvaluationRecord]
  }
}

