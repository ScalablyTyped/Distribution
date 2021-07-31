package typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasMaxInactivityTimeLockResult extends StObject
/** Represents the maximum length of time result before locking the computer. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult")
@js.native
object EasMaxInactivityTimeLockResult extends StObject {
  
  /** This computer can be compliant by using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant
    extends StObject
       with EasMaxInactivityTimeLockResult
  
  /** This computer is compliant to the policy. */
  @js.native
  sealed trait compliant
    extends StObject
       with EasMaxInactivityTimeLockResult
  
  /** The policy value is not in a valid range. */
  @js.native
  sealed trait invalidParameter
    extends StObject
       with EasMaxInactivityTimeLockResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated
    extends StObject
       with EasMaxInactivityTimeLockResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter
    extends StObject
       with EasMaxInactivityTimeLockResult
}
