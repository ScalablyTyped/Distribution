package typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasPasswordExpirationResult extends js.Object

/** Results of querying on the password expiration information. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult")
@js.native
object EasPasswordExpirationResult extends js.Object {
  /** One or more admins are not allowed to change their passwords. */
  @js.native
  sealed trait adminsCannotChangePassword extends EasPasswordExpirationResult
  
  /** The computer can be compliant using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant extends EasPasswordExpirationResult
  
  /** The computer is compliant to the policy. */
  @js.native
  sealed trait compliant extends EasPasswordExpirationResult
  
  /** The policy value is not in a valid range. */
  @js.native
  sealed trait invalidParameter extends EasPasswordExpirationResult
  
  /** There are other standard users present who are not allowed to change their passwords. */
  @js.native
  sealed trait localControlledUsersCannotChangePassword extends EasPasswordExpirationResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated extends EasPasswordExpirationResult
  
  /** The EAS password expiration policy cannot be met as the password expiration interval is less than the minimum password interval for the system. */
  @js.native
  sealed trait requestedExpirationIncompatible extends EasPasswordExpirationResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter extends EasPasswordExpirationResult
  
  /** The user is not allowed to change the password. */
  @js.native
  sealed trait userCannotChangePassword extends EasPasswordExpirationResult
  
  /* 7 */ val adminsCannotChangePassword: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.adminsCannotChangePassword with Double = js.native
  /* 2 */ val canBeCompliant: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.canBeCompliant with Double = js.native
  /* 1 */ val compliant: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.compliant with Double = js.native
  /* 5 */ val invalidParameter: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.invalidParameter with Double = js.native
  /* 8 */ val localControlledUsersCannotChangePassword: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.localControlledUsersCannotChangePassword with Double = js.native
  /* 0 */ val notEvaluated: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.notEvaluated with Double = js.native
  /* 4 */ val requestedExpirationIncompatible: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedExpirationIncompatible with Double = js.native
  /* 3 */ val requestedPolicyIsStricter: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedPolicyIsStricter with Double = js.native
  /* 6 */ val userCannotChangePassword: typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.userCannotChangePassword with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasPasswordExpirationResult with Double] = js.native
}

