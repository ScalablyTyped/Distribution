package typings.winrtUwp.Windows.Security.EnterpriseData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProtectionPolicyEvaluationResult extends StObject
/** Possible results when access to protected content is requested or queried. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult")
@js.native
object ProtectionPolicyEvaluationResult extends StObject {
  
  /** Access is allowed. */
  @js.native
  sealed trait allowed
    extends StObject
       with ProtectionPolicyEvaluationResult
  
  /** Access is blocked. */
  @js.native
  sealed trait blocked
    extends StObject
       with ProtectionPolicyEvaluationResult
  
  /** Consent is required for access. */
  @js.native
  sealed trait consentRequired
    extends StObject
       with ProtectionPolicyEvaluationResult
}
