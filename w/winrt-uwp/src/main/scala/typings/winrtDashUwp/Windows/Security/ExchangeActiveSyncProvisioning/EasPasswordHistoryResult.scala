package typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.canBeCompliant
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.compliant
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.invalidParameter
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.notEvaluated
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.requestedPolicyIsStricter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasPasswordHistoryResult extends js.Object

/** Represents the password history. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult")
@js.native
object EasPasswordHistoryResult extends js.Object {
  /** The computer can be compliant using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant extends EasPasswordHistoryResult
  
  /** The computer is compliant to the policy. */
  @js.native
  sealed trait compliant extends EasPasswordHistoryResult
  
  /** The policy value is not in a valid range. */
  @js.native
  sealed trait invalidParameter extends EasPasswordHistoryResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated extends EasPasswordHistoryResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter extends EasPasswordHistoryResult
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasPasswordHistoryResult with Double] = js.native
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

