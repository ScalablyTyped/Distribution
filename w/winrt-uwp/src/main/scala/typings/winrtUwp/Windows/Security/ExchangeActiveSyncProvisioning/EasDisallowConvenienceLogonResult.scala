package typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasDisallowConvenienceLogonResult extends js.Object
/** Results of whether the logon can occur. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult")
@js.native
object EasDisallowConvenienceLogonResult extends js.Object {
  
  /** This computer can be compliant by using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant extends EasDisallowConvenienceLogonResult
  
  /** This computer is compliant to the policy. */
  @js.native
  sealed trait compliant extends EasDisallowConvenienceLogonResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated extends EasDisallowConvenienceLogonResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter extends EasDisallowConvenienceLogonResult
}
