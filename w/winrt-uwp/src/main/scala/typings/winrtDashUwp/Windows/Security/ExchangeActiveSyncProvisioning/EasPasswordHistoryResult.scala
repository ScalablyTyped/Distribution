package typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning

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
  
  /* 2 */ val canBeCompliant: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.canBeCompliant with Double = js.native
  /* 1 */ val compliant: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.compliant with Double = js.native
  /* 4 */ val invalidParameter: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.invalidParameter with Double = js.native
  /* 0 */ val notEvaluated: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.notEvaluated with Double = js.native
  /* 3 */ val requestedPolicyIsStricter: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.requestedPolicyIsStricter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasPasswordHistoryResult with Double] = js.native
}

