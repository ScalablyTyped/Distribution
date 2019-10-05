package typings.winrtDashUwp.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProtectionPolicyEvaluationResult extends js.Object

/** Possible results when access to protected content is requested or queried. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult")
@js.native
object ProtectionPolicyEvaluationResult extends js.Object {
  /** Access is allowed. */
  @js.native
  sealed trait allowed extends ProtectionPolicyEvaluationResult
  
  /** Access is blocked. */
  @js.native
  sealed trait blocked extends ProtectionPolicyEvaluationResult
  
  /** Consent is required for access. */
  @js.native
  sealed trait consentRequired extends ProtectionPolicyEvaluationResult
  
  /* 0 */ val allowed: typings.winrtDashUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult.allowed with Double = js.native
  /* 1 */ val blocked: typings.winrtDashUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult.blocked with Double = js.native
  /* 2 */ val consentRequired: typings.winrtDashUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult.consentRequired with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProtectionPolicyEvaluationResult with Double] = js.native
}

