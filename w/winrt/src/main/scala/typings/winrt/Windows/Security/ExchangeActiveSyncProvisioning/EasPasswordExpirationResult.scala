package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasPasswordExpirationResult extends StObject
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult")
@js.native
object EasPasswordExpirationResult extends StObject {
  
  @js.native
  sealed trait adminsCannotChangePassword extends EasPasswordExpirationResult
  
  @js.native
  sealed trait canBeCompliant extends EasPasswordExpirationResult
  
  @js.native
  sealed trait compliant extends EasPasswordExpirationResult
  
  @js.native
  sealed trait invalidParameter extends EasPasswordExpirationResult
  
  @js.native
  sealed trait localControlledUsersCannotChangePassword extends EasPasswordExpirationResult
  
  @js.native
  sealed trait notEvaluated extends EasPasswordExpirationResult
  
  @js.native
  sealed trait requestedExpirationIncompatible extends EasPasswordExpirationResult
  
  @js.native
  sealed trait requestedPolicyIsStricter extends EasPasswordExpirationResult
  
  @js.native
  sealed trait userCannotChangePassword extends EasPasswordExpirationResult
}
