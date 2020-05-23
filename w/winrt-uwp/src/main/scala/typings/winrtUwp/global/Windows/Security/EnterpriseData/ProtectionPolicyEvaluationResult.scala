package typings.winrtUwp.global.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Possible results when access to protected content is requested or queried. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult")
@js.native
object ProtectionPolicyEvaluationResult extends js.Object {
  /* 0 */ val allowed: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult.allowed with Double = js.native
  /* 1 */ val blocked: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult.blocked with Double = js.native
  /* 2 */ val consentRequired: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult.consentRequired with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult with Double
  ] = js.native
}

