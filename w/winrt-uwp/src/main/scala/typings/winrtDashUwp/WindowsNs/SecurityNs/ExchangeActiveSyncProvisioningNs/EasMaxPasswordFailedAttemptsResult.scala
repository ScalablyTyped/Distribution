package typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

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
  
  /* 2 */ val canBeCompliant: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult.canBeCompliant with Double = js.native
  /* 1 */ val compliant: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult.compliant with Double = js.native
  /* 4 */ val invalidParameter: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult.invalidParameter with Double = js.native
  /* 0 */ val notEvaluated: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult.notEvaluated with Double = js.native
  /* 3 */ val requestedPolicyIsStricter: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxPasswordFailedAttemptsResult.requestedPolicyIsStricter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasMaxPasswordFailedAttemptsResult with Double] = js.native
}

