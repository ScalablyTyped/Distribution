package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasPasswordExpirationResult extends StObject
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult")
@js.native
object EasPasswordExpirationResult extends StObject {
  
  @js.native
  sealed trait adminsCannotChangePassword
    extends StObject
       with EasPasswordExpirationResult
  
  @js.native
  sealed trait canBeCompliant
    extends StObject
       with EasPasswordExpirationResult
  
  @js.native
  sealed trait compliant
    extends StObject
       with EasPasswordExpirationResult
  
  @js.native
  sealed trait invalidParameter
    extends StObject
       with EasPasswordExpirationResult
  
  @js.native
  sealed trait localControlledUsersCannotChangePassword
    extends StObject
       with EasPasswordExpirationResult
  
  @js.native
  sealed trait notEvaluated
    extends StObject
       with EasPasswordExpirationResult
  
  @js.native
  sealed trait requestedExpirationIncompatible
    extends StObject
       with EasPasswordExpirationResult
  
  @js.native
  sealed trait requestedPolicyIsStricter
    extends StObject
       with EasPasswordExpirationResult
  
  @js.native
  sealed trait userCannotChangePassword
    extends StObject
       with EasPasswordExpirationResult
}
