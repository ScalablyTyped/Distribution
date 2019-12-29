package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasMinPasswordLengthResult extends js.Object

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult")
@js.native
object EasMinPasswordLengthResult extends js.Object {
  @js.native
  sealed trait adminsCannotChangePassword extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait adminsHaveBlankPassword extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait canBeCompliant extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait changeConnectedAdminsPassword extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait changeConnectedUserPassword extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait compliant extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait connectedAdminsProviderPolicyIsWeak extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait connectedUserProviderPolicyIsWeak extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait currentUserHasBlankPassword extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait invalidParameter extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait localControlledUsersCannotChangePassword extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait notEvaluated extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait requestedPolicyIsStricter extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait requestedPolicyNotEnforceable extends EasMinPasswordLengthResult
  
  @js.native
  sealed trait userCannotChangePassword extends EasMinPasswordLengthResult
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasMinPasswordLengthResult with Double] = js.native
  /* 9 */ @js.native
  object adminsCannotChangePassword extends TopLevel[adminsCannotChangePassword with Double]
  
  /* 7 */ @js.native
  object adminsHaveBlankPassword extends TopLevel[adminsHaveBlankPassword with Double]
  
  /* 2 */ @js.native
  object canBeCompliant extends TopLevel[canBeCompliant with Double]
  
  /* 13 */ @js.native
  object changeConnectedAdminsPassword extends TopLevel[changeConnectedAdminsPassword with Double]
  
  /* 14 */ @js.native
  object changeConnectedUserPassword extends TopLevel[changeConnectedUserPassword with Double]
  
  /* 1 */ @js.native
  object compliant extends TopLevel[compliant with Double]
  
  /* 11 */ @js.native
  object connectedAdminsProviderPolicyIsWeak extends TopLevel[connectedAdminsProviderPolicyIsWeak with Double]
  
  /* 12 */ @js.native
  object connectedUserProviderPolicyIsWeak extends TopLevel[connectedUserProviderPolicyIsWeak with Double]
  
  /* 6 */ @js.native
  object currentUserHasBlankPassword extends TopLevel[currentUserHasBlankPassword with Double]
  
  /* 5 */ @js.native
  object invalidParameter extends TopLevel[invalidParameter with Double]
  
  /* 10 */ @js.native
  object localControlledUsersCannotChangePassword extends TopLevel[localControlledUsersCannotChangePassword with Double]
  
  /* 0 */ @js.native
  object notEvaluated extends TopLevel[notEvaluated with Double]
  
  /* 3 */ @js.native
  object requestedPolicyIsStricter extends TopLevel[requestedPolicyIsStricter with Double]
  
  /* 4 */ @js.native
  object requestedPolicyNotEnforceable extends TopLevel[requestedPolicyNotEnforceable with Double]
  
  /* 8 */ @js.native
  object userCannotChangePassword extends TopLevel[userCannotChangePassword with Double]
  
}

