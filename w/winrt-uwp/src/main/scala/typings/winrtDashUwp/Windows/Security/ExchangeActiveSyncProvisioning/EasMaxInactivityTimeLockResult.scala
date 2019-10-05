package typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasMaxInactivityTimeLockResult extends js.Object

/** Represents the maximum length of time result before locking the computer. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult")
@js.native
object EasMaxInactivityTimeLockResult extends js.Object {
  /** This computer can be compliant by using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant extends EasMaxInactivityTimeLockResult
  
  /** This computer is compliant to the policy. */
  @js.native
  sealed trait compliant extends EasMaxInactivityTimeLockResult
  
  /** The policy value is not in a valid range. */
  @js.native
  sealed trait invalidParameter extends EasMaxInactivityTimeLockResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated extends EasMaxInactivityTimeLockResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter extends EasMaxInactivityTimeLockResult
  
  /* 2 */ val canBeCompliant: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.canBeCompliant with Double = js.native
  /* 1 */ val compliant: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.compliant with Double = js.native
  /* 4 */ val invalidParameter: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.invalidParameter with Double = js.native
  /* 0 */ val notEvaluated: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.notEvaluated with Double = js.native
  /* 3 */ val requestedPolicyIsStricter: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.requestedPolicyIsStricter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasMaxInactivityTimeLockResult with Double] = js.native
}

