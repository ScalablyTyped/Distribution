package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualInterventions extends js.Object {
  var approvals: scala.Double
  var artifacts: scala.Double
  var environments: scala.Double
  var manualInterventions: scala.Double
  var none: scala.Double
  var tags: scala.Double
  var variables: scala.Double
}

object ManualInterventions {
  @scala.inline
  def apply(
    approvals: scala.Double,
    artifacts: scala.Double,
    environments: scala.Double,
    manualInterventions: scala.Double,
    none: scala.Double,
    tags: scala.Double,
    variables: scala.Double
  ): ManualInterventions = {
    val __obj = js.Dynamic.literal(approvals = approvals.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], manualInterventions = manualInterventions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualInterventions]
  }
}

