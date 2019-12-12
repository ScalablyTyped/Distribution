package typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.adminsCannotChangePassword
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.canBeCompliant
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.compliant
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.invalidParameter
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.localControlledUsersCannotChangePassword
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.notEvaluated
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedExpirationIncompatible
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedPolicyIsStricter
import typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.userCannotChangePassword
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasPasswordExpirationResult with Double] = js.native
  /* 7 */ @js.native
  object adminsCannotChangePassword extends TopLevel[adminsCannotChangePassword with Double]
  
  /* 2 */ @js.native
  object canBeCompliant extends TopLevel[canBeCompliant with Double]
  
  /* 1 */ @js.native
  object compliant extends TopLevel[compliant with Double]
  
  /* 5 */ @js.native
  object invalidParameter extends TopLevel[invalidParameter with Double]
  
  /* 8 */ @js.native
  object localControlledUsersCannotChangePassword extends TopLevel[localControlledUsersCannotChangePassword with Double]
  
  /* 0 */ @js.native
  object notEvaluated extends TopLevel[notEvaluated with Double]
  
  /* 4 */ @js.native
  object requestedExpirationIncompatible extends TopLevel[requestedExpirationIncompatible with Double]
  
  /* 3 */ @js.native
  object requestedPolicyIsStricter extends TopLevel[requestedPolicyIsStricter with Double]
  
  /* 6 */ @js.native
  object userCannotChangePassword extends TopLevel[userCannotChangePassword with Double]
  
}

