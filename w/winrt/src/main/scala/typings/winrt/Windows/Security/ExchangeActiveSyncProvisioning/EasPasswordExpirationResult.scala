package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasPasswordExpirationResult with Double] = js.native
  /* 7 */ @js.native
  object adminsCannotChangePassword extends TopLevel[adminsCannotChangePassword with Double]
  
  /* 2 */ @js.native
  object canBeCompliant extends TopLevel[canBeCompliant with Double]
  
  /* 1 */ @js.native
  object compliant extends TopLevel[compliant with Double]
  
  /* 5 */ @js.native
  object invalidParameter extends TopLevel[invalidParameter with Double]
  
  /* 8 */ @js.native
  object localControlledUsersCannotChangePassword extends TopLevel[localControlledUsersCannotChangePassword with Double]
  
  /* 0 */ @js.native
  object notEvaluated extends TopLevel[notEvaluated with Double]
  
  /* 4 */ @js.native
  object requestedExpirationIncompatible extends TopLevel[requestedExpirationIncompatible with Double]
  
  /* 3 */ @js.native
  object requestedPolicyIsStricter extends TopLevel[requestedPolicyIsStricter with Double]
  
  /* 6 */ @js.native
  object userCannotChangePassword extends TopLevel[userCannotChangePassword with Double]
  
}

