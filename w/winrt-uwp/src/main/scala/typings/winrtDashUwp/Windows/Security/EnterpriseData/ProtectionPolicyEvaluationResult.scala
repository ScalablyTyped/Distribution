package typings.winrtDashUwp.Windows.Security.EnterpriseData

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProtectionPolicyEvaluationResult with Double] = js.native
  /* 0 */ @js.native
  object allowed extends TopLevel[allowed with Double]
  
  /* 1 */ @js.native
  object blocked extends TopLevel[blocked with Double]
  
  /* 2 */ @js.native
  object consentRequired extends TopLevel[consentRequired with Double]
  
}

