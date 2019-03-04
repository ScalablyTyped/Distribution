package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Approvals extends js.Object {
  var approvals: scala.Double
  var artifacts: scala.Double
  var environments: scala.Double
  var manualInterventions: scala.Double
  var none: scala.Double
  var tags: scala.Double
  var variables: scala.Double
}

object Anon_Approvals {
  @scala.inline
  def apply(
    approvals: scala.Double,
    artifacts: scala.Double,
    environments: scala.Double,
    manualInterventions: scala.Double,
    none: scala.Double,
    tags: scala.Double,
    variables: scala.Double
  ): Anon_Approvals = {
    val __obj = js.Dynamic.literal(approvals = approvals, artifacts = artifacts, environments = environments, manualInterventions = manualInterventions, none = none, tags = tags, variables = variables)
  
    __obj.asInstanceOf[Anon_Approvals]
  }
}

