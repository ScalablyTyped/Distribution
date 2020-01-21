package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApprovals extends js.Object {
  var approvals: Double
  var artifacts: Double
  var environments: Double
  var manualInterventions: Double
  var none: Double
  var tags: Double
  var variables: Double
}

object AnonApprovals {
  @scala.inline
  def apply(
    approvals: Double,
    artifacts: Double,
    environments: Double,
    manualInterventions: Double,
    none: Double,
    tags: Double,
    variables: Double
  ): AnonApprovals = {
    val __obj = js.Dynamic.literal(approvals = approvals.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], manualInterventions = manualInterventions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApprovals]
  }
}

