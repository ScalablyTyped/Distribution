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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approvals")(approvals)
    __obj.updateDynamic("artifacts")(artifacts)
    __obj.updateDynamic("environments")(environments)
    __obj.updateDynamic("manualInterventions")(manualInterventions)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Anon_Approvals]
  }
}

