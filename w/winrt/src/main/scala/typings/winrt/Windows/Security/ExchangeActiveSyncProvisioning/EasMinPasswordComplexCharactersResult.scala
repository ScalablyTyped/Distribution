package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasMinPasswordComplexCharactersResult extends StObject
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult")
@js.native
object EasMinPasswordComplexCharactersResult extends StObject {
  
  @js.native
  sealed trait adminsCannotChangePassword
    extends StObject
       with EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait adminsHaveBlankPassword
    extends StObject
       with EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait canBeCompliant
    extends StObject
       with EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait changeConnectedAdminsPassword
    extends StObject
       with EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait changeConnectedUserPassword
    extends StObject
       with EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait compliant
    extends StObject
       with EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait connectedAdminsProviderPolicyIsWeak
    extends StObject
       with EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait connectedUserProviderPolicyIsWeak
    extends StObject
       with EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait currentUserHasBlankPassword
    extends StObject
       with EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait invalidParameter
    extends StObject
       with EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait localControlledUsersCannotChangePassword
    extends StObject
       with EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait notEvaluated
    extends StObject
       with EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait requestedPolicyIsStricter
    extends StObject
       with EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait requestedPolicyNotEnforceable
    extends StObject
       with EasMinPasswordComplexCharactersResult
  
  @js.native
  sealed trait userCannotChangePassword
    extends StObject
       with EasMinPasswordComplexCharactersResult
}
