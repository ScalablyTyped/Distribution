package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasPasswordExpirationResult extends js.Object
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult")
@js.native
object EasPasswordExpirationResult extends js.Object {
  
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
