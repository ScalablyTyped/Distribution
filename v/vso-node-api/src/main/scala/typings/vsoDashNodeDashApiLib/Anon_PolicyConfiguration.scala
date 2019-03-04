package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PolicyConfiguration extends js.Object {
  var PolicyConfiguration: js.Any
  var PolicyEvaluationRecord: js.Any
  var PolicyEvaluationStatus: Anon_EnumValuesAnonApprovedBroken
}

object Anon_PolicyConfiguration {
  @scala.inline
  def apply(
    PolicyConfiguration: js.Any,
    PolicyEvaluationRecord: js.Any,
    PolicyEvaluationStatus: Anon_EnumValuesAnonApprovedBroken
  ): Anon_PolicyConfiguration = {
    val __obj = js.Dynamic.literal(PolicyConfiguration = PolicyConfiguration, PolicyEvaluationRecord = PolicyEvaluationRecord, PolicyEvaluationStatus = PolicyEvaluationStatus)
  
    __obj.asInstanceOf[Anon_PolicyConfiguration]
  }
}

