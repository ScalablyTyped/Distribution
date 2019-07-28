package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Approvals extends js.Object {
  var approvals: Double
  var artifacts: Double
  var environments: Double
  var manualInterventions: Double
  var none: Double
  var tags: Double
  var variables: Double
}

object Anon_Approvals {
  @scala.inline
  def apply(
    approvals: Double,
    artifacts: Double,
    environments: Double,
    manualInterventions: Double,
    none: Double,
    tags: Double,
    variables: Double
  ): Anon_Approvals = {
    val __obj = js.Dynamic.literal(approvals = approvals, artifacts = artifacts, environments = environments, manualInterventions = manualInterventions, none = none, tags = tags, variables = variables)
  
    __obj.asInstanceOf[Anon_Approvals]
  }
}

