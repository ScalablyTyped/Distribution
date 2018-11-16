package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

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
  sealed trait canBeCompliant
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxInactivityTimeLockResult
  
  /** This computer is compliant to the policy. */
  @js.native
  sealed trait compliant
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxInactivityTimeLockResult
  
  /** The policy value is not in a valid range. */
  @js.native
  sealed trait invalidParameter
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxInactivityTimeLockResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxInactivityTimeLockResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxInactivityTimeLockResult
  
  val canBeCompliant: canBeCompliant with java.lang.String = js.native
  val compliant: compliant with java.lang.String = js.native
  val invalidParameter: invalidParameter with java.lang.String = js.native
  val notEvaluated: notEvaluated with java.lang.String = js.native
  val requestedPolicyIsStricter: requestedPolicyIsStricter with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasMaxInactivityTimeLockResult with java.lang.String
  ] = js.native
}

