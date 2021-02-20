package typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasPasswordExpirationResult extends StObject
/** Results of querying on the password expiration information. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult")
@js.native
object EasPasswordExpirationResult extends StObject {
  
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
}
