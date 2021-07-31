package typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasMaxPasswordFailedAttemptsResult extends StObject
/** Represents the maximum number of password attempts results. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult")
@js.native
object EasMaxPasswordFailedAttemptsResult extends StObject {
  
  /** This computer can be compliant by using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant
    extends StObject
       with EasMaxPasswordFailedAttemptsResult
  
  /** This computer is compliant to the policy. */
  @js.native
  sealed trait compliant
    extends StObject
       with EasMaxPasswordFailedAttemptsResult
  
  /** The policy value is not in a valid range. */
  @js.native
  sealed trait invalidParameter
    extends StObject
       with EasMaxPasswordFailedAttemptsResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated
    extends StObject
       with EasMaxPasswordFailedAttemptsResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter
    extends StObject
       with EasMaxPasswordFailedAttemptsResult
}
