package typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasPasswordHistoryResult extends StObject
/** Represents the password history. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult")
@js.native
object EasPasswordHistoryResult extends StObject {
  
  /** The computer can be compliant using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant
    extends StObject
       with EasPasswordHistoryResult
  
  /** The computer is compliant to the policy. */
  @js.native
  sealed trait compliant
    extends StObject
       with EasPasswordHistoryResult
  
  /** The policy value is not in a valid range. */
  @js.native
  sealed trait invalidParameter
    extends StObject
       with EasPasswordHistoryResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated
    extends StObject
       with EasPasswordHistoryResult
  
  /** The requested policy is stricter than the computer policies. */
  @js.native
  sealed trait requestedPolicyIsStricter
    extends StObject
       with EasPasswordHistoryResult
}
