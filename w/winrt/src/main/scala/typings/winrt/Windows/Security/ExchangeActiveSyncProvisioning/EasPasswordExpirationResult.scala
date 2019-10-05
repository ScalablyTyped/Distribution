package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 7 */ val adminsCannotChangePassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.adminsCannotChangePassword with Double = js.native
  /* 2 */ val canBeCompliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.canBeCompliant with Double = js.native
  /* 1 */ val compliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.compliant with Double = js.native
  /* 5 */ val invalidParameter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.invalidParameter with Double = js.native
  /* 8 */ val localControlledUsersCannotChangePassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.localControlledUsersCannotChangePassword with Double = js.native
  /* 0 */ val notEvaluated: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.notEvaluated with Double = js.native
  /* 4 */ val requestedExpirationIncompatible: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedExpirationIncompatible with Double = js.native
  /* 3 */ val requestedPolicyIsStricter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedPolicyIsStricter with Double = js.native
  /* 6 */ val userCannotChangePassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.userCannotChangePassword with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasPasswordExpirationResult with Double] = js.native
}

