package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs

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
  sealed trait allowed
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectionPolicyEvaluationResult
  
  /** Access is blocked. */
  @js.native
  sealed trait blocked
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectionPolicyEvaluationResult
  
  /** Consent is required for access. */
  @js.native
  sealed trait consentRequired
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectionPolicyEvaluationResult
  
  val allowed: allowed with java.lang.String = js.native
  val blocked: blocked with java.lang.String = js.native
  val consentRequired: consentRequired with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectionPolicyEvaluationResult with java.lang.String
  ] = js.native
}

