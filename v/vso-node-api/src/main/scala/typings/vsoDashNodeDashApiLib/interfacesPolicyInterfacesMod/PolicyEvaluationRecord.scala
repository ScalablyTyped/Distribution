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

