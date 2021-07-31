package typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasMinPasswordLengthResult extends StObject
/** Represents the minimum length result for passwords. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult")
@js.native
object EasMinPasswordLengthResult extends StObject {
  
  /** One or more admins are not allowed to change their passwords. */
  @js.native
  sealed trait adminsCannotChangePassword
    extends StObject
       with EasMinPasswordLengthResult
  
  /** The EAS password policies cannot be evaluated as one or more admins have blank passwords. */
  @js.native
  sealed trait adminsHaveBlankPassword
    extends StObject
       with EasMinPasswordLengthResult
  
  /** This computer can be compliant by using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant
    extends StObject
       with EasMinPasswordLengthResult
  
  /** There is at least one administrator whose connected account password must be changed for EAS password policy compliance. */
  @js.native
  sealed trait changeConnectedAdminsPassword
    extends StObject
       with EasMinPasswordLengthResult
  
  /** The connected account password for the current user must be changed for EAS password policy compliance. */
  @js.native
  sealed trait changeConnectedUserPassword
    extends StObject
       with EasMinPasswordLengthResult
  
  /** This computer is compliant to the policy. */
  @js.native
  sealed trait compliant
    extends StObject
       with EasMinPasswordLengthResult
  
  /** The EAS password policy cannot be enforced by the connected account provider of at least one administrator. */
  @js.native
  sealed trait connectedAdminsProviderPolicyIsWeak
    extends StObject
       with EasMinPasswordLengthResult
  
  /** The EAS password policy cannot be enforced by the connected account provider of the current user. */
  @js.native
  sealed trait connectedUserProviderPolicyIsWeak
    extends StObject
       with EasMinPasswordLengthResult
  
  /** The EAS password policies for the user cannot be evaluated as the user has a blank password. */
  @js.native
  sealed trait currentUserHasBlankPassword
    extends StObject
       with EasMinPasswordLengthResult
  
  /** The policy value is not in a valid range. */
  @js.native
  sealed trait invalidParameter
    extends StObject
       with EasMinPasswordLengthResult
  
  /** There are other standard users present who are not allowed to change their passwords. */
  @js.native
  sealed trait localControlledUsersCannotChangePassword
    extends StObject
       with EasMinPasswordLengthResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated
    extends StObject
       with EasMinPasswordLengthResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter
    extends StObject
       with EasMinPasswordLengthResult
  
  /** The EAS policy being evaluated cannot be enforced by the system. */
  @js.native
  sealed trait requestedPolicyNotEnforceable
    extends StObject
       with EasMinPasswordLengthResult
  
  /** The user is not allowed to change the password. */
  @js.native
  sealed trait userCannotChangePassword
    extends StObject
       with EasMinPasswordLengthResult
}
