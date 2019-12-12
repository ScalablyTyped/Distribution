package typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.canBeCompliant
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.compliant
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.invalidParameter
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.notEvaluated
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.requestedPolicyIsStricter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasMaxPasswordFailedAttemptsResult extends js.Object

/** Represents the maximum number of password attempts results. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult")
@js.native
object EasMaxPasswordFailedAttemptsResult extends js.Object {
  /** This computer can be compliant by using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant extends EasMaxPasswordFailedAttemptsResult
  
  /** This computer is compliant to the policy. */
  @js.native
  sealed trait compliant extends EasMaxPasswordFailedAttemptsResult
  
  /** The policy value is not in a valid range. */
  @js.native
  sealed trait invalidParameter extends EasMaxPasswordFailedAttemptsResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated extends EasMaxPasswordFailedAttemptsResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter extends EasMaxPasswordFailedAttemptsResult
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasMaxPasswordFailedAttemptsResult with Double] = js.native
  /* 2 */ @js.native
  object canBeCompliant extends TopLevel[canBeCompliant with Double]
  
  /* 1 */ @js.native
  object compliant extends TopLevel[compliant with Double]
  
  /* 4 */ @js.native
  object invalidParameter extends TopLevel[invalidParameter with Double]
  
  /* 0 */ @js.native
  object notEvaluated extends TopLevel[notEvaluated with Double]
  
  /* 3 */ @js.native
  object requestedPolicyIsStricter extends TopLevel[requestedPolicyIsStricter with Double]
  
}

