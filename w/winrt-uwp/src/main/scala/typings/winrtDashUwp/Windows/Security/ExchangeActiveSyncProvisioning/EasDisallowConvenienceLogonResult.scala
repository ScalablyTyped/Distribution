package typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasDisallowConvenienceLogonResult with Double] = js.native
  /* 2 */ @js.native
  object canBeCompliant extends TopLevel[canBeCompliant with Double]
  
  /* 1 */ @js.native
  object compliant extends TopLevel[compliant with Double]
  
  /* 0 */ @js.native
  object notEvaluated extends TopLevel[notEvaluated with Double]
  
  /* 3 */ @js.native
  object requestedPolicyIsStricter extends TopLevel[requestedPolicyIsStricter with Double]
  
}

