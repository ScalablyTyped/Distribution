package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasMinPasswordLengthResult extends StObject
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult")
@js.native
object EasMinPasswordLengthResult extends StObject {
  
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
}
