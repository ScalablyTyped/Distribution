package typings.winrt.global.Windows.Security

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult
import typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExchangeActiveSyncProvisioning {
  
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasClientDeviceInformation")
  @js.native
  open class EasClientDeviceInformation ()
    extends StObject
       with typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasClientDeviceInformation {
    
    /* CompleteClass */
    var friendlyName: String = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    /* CompleteClass */
    var operatingSystem: String = js.native
    
    /* CompleteClass */
    var systemManufacturer: String = js.native
    
    /* CompleteClass */
    var systemProductName: String = js.native
    
    /* CompleteClass */
    var systemSku: String = js.native
  }
  
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasClientSecurityPolicy")
  @js.native
  open class EasClientSecurityPolicy ()
    extends StObject
       with typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasClientSecurityPolicy {
    
    /* CompleteClass */
    override def applyAsync(): IAsyncOperation[
        typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults
      ] = js.native
    
    /* CompleteClass */
    override def checkCompliance(): typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults = js.native
    
    /* CompleteClass */
    var disallowConvenienceLogon: Boolean = js.native
    
    /* CompleteClass */
    var maxInactivityTimeLock: Double = js.native
    
    /* CompleteClass */
    var maxPasswordFailedAttempts: Double = js.native
    
    /* CompleteClass */
    var minPasswordComplexCharacters: Double = js.native
    
    /* CompleteClass */
    var minPasswordLength: Double = js.native
    
    /* CompleteClass */
    var passwordExpiration: Double = js.native
    
    /* CompleteClass */
    var passwordHistory: Double = js.native
    
    /* CompleteClass */
    var requireEncryption: Boolean = js.native
  }
  
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults")
  @js.native
  open class EasComplianceResults ()
    extends StObject
       with typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults {
    
    /* CompleteClass */
    var compliant: Boolean = js.native
    
    /* CompleteClass */
    var disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult = js.native
    
    /* CompleteClass */
    var maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult = js.native
    
    /* CompleteClass */
    var maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult = js.native
    
    /* CompleteClass */
    var minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult = js.native
    
    /* CompleteClass */
    var minPasswordLengthResult: EasMinPasswordLengthResult = js.native
    
    /* CompleteClass */
    var passwordExpirationResult: EasPasswordExpirationResult = js.native
    
    /* CompleteClass */
    var passwordHistoryResult: EasPasswordHistoryResult = js.native
    
    /* CompleteClass */
    var requireEncryptionResult: EasRequireEncryptionResult = js.native
  }
  
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult")
  @js.native
  object EasDisallowConvenienceLogonResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult & Double
      ] = js.native
    
    /* 2 */ val canBeCompliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.canBeCompliant & Double = js.native
    
    /* 1 */ val compliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.compliant & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.notEvaluated & Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.requestedPolicyIsStricter & Double = js.native
  }
  
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult")
  @js.native
  object EasMaxInactivityTimeLockResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult & Double
      ] = js.native
    
    /* 2 */ val canBeCompliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.canBeCompliant & Double = js.native
    
    /* 1 */ val compliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.compliant & Double = js.native
    
    /* 4 */ val invalidParameter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.invalidParameter & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.notEvaluated & Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.requestedPolicyIsStricter & Double = js.native
  }
  
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult")
  @js.native
  object EasMaxPasswordFailedAttemptsResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult & Double
      ] = js.native
    
    /* 2 */ val canBeCompliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.canBeCompliant & Double = js.native
    
    /* 1 */ val compliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.compliant & Double = js.native
    
    /* 4 */ val invalidParameter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.invalidParameter & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.notEvaluated & Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.requestedPolicyIsStricter & Double = js.native
  }
  
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult")
  @js.native
  object EasMinPasswordComplexCharactersResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult & Double
      ] = js.native
    
    /* 9 */ val adminsCannotChangePassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.adminsCannotChangePassword & Double = js.native
    
    /* 7 */ val adminsHaveBlankPassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.adminsHaveBlankPassword & Double = js.native
    
    /* 2 */ val canBeCompliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.canBeCompliant & Double = js.native
    
    /* 13 */ val changeConnectedAdminsPassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.changeConnectedAdminsPassword & Double = js.native
    
    /* 14 */ val changeConnectedUserPassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.changeConnectedUserPassword & Double = js.native
    
    /* 1 */ val compliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.compliant & Double = js.native
    
    /* 11 */ val connectedAdminsProviderPolicyIsWeak: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.connectedAdminsProviderPolicyIsWeak & Double = js.native
    
    /* 12 */ val connectedUserProviderPolicyIsWeak: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.connectedUserProviderPolicyIsWeak & Double = js.native
    
    /* 6 */ val currentUserHasBlankPassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.currentUserHasBlankPassword & Double = js.native
    
    /* 5 */ val invalidParameter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.invalidParameter & Double = js.native
    
    /* 10 */ val localControlledUsersCannotChangePassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.localControlledUsersCannotChangePassword & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.notEvaluated & Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.requestedPolicyIsStricter & Double = js.native
    
    /* 4 */ val requestedPolicyNotEnforceable: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.requestedPolicyNotEnforceable & Double = js.native
    
    /* 8 */ val userCannotChangePassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.userCannotChangePassword & Double = js.native
  }
  
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult")
  @js.native
  object EasMinPasswordLengthResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult & Double
      ] = js.native
    
    /* 9 */ val adminsCannotChangePassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.adminsCannotChangePassword & Double = js.native
    
    /* 7 */ val adminsHaveBlankPassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.adminsHaveBlankPassword & Double = js.native
    
    /* 2 */ val canBeCompliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.canBeCompliant & Double = js.native
    
    /* 13 */ val changeConnectedAdminsPassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.changeConnectedAdminsPassword & Double = js.native
    
    /* 14 */ val changeConnectedUserPassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.changeConnectedUserPassword & Double = js.native
    
    /* 1 */ val compliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.compliant & Double = js.native
    
    /* 11 */ val connectedAdminsProviderPolicyIsWeak: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.connectedAdminsProviderPolicyIsWeak & Double = js.native
    
    /* 12 */ val connectedUserProviderPolicyIsWeak: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.connectedUserProviderPolicyIsWeak & Double = js.native
    
    /* 6 */ val currentUserHasBlankPassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.currentUserHasBlankPassword & Double = js.native
    
    /* 5 */ val invalidParameter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.invalidParameter & Double = js.native
    
    /* 10 */ val localControlledUsersCannotChangePassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.localControlledUsersCannotChangePassword & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.notEvaluated & Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.requestedPolicyIsStricter & Double = js.native
    
    /* 4 */ val requestedPolicyNotEnforceable: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.requestedPolicyNotEnforceable & Double = js.native
    
    /* 8 */ val userCannotChangePassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.userCannotChangePassword & Double = js.native
  }
  
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult")
  @js.native
  object EasPasswordExpirationResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult & Double
      ] = js.native
    
    /* 7 */ val adminsCannotChangePassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.adminsCannotChangePassword & Double = js.native
    
    /* 2 */ val canBeCompliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.canBeCompliant & Double = js.native
    
    /* 1 */ val compliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.compliant & Double = js.native
    
    /* 5 */ val invalidParameter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.invalidParameter & Double = js.native
    
    /* 8 */ val localControlledUsersCannotChangePassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.localControlledUsersCannotChangePassword & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.notEvaluated & Double = js.native
    
    /* 4 */ val requestedExpirationIncompatible: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedExpirationIncompatible & Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedPolicyIsStricter & Double = js.native
    
    /* 6 */ val userCannotChangePassword: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.userCannotChangePassword & Double = js.native
  }
  
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult")
  @js.native
  object EasPasswordHistoryResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult & Double
      ] = js.native
    
    /* 2 */ val canBeCompliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.canBeCompliant & Double = js.native
    
    /* 1 */ val compliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.compliant & Double = js.native
    
    /* 4 */ val invalidParameter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.invalidParameter & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.notEvaluated & Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.requestedPolicyIsStricter & Double = js.native
  }
  
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult")
  @js.native
  object EasRequireEncryptionResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult & Double
      ] = js.native
    
    /* 2 */ val canBeCompliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.canBeCompliant & Double = js.native
    
    /* 1 */ val compliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.compliant & Double = js.native
    
    /* 4 */ val deFixedDataNotSupported: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deFixedDataNotSupported & Double = js.native
    
    /* 5 */ val deHardwareNotCompliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deHardwareNotCompliant & Double = js.native
    
    /* 8 */ val deOsVolumeNotProtected: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deOsVolumeNotProtected & Double = js.native
    
    /* 9 */ val deProtectionNotYetEnabled: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deProtectionNotYetEnabled & Double = js.native
    
    /* 7 */ val deProtectionSuspended: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deProtectionSuspended & Double = js.native
    
    /* 6 */ val deWinReNotConfigured: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deWinReNotConfigured & Double = js.native
    
    /* 10 */ val noFeatureLicense: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.noFeatureLicense & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.notEvaluated & Double = js.native
    
    /* 3 */ val notProvisionedOnAllVolumes: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.notProvisionedOnAllVolumes & Double = js.native
    
    /* 11 */ val osNotProtected: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.osNotProtected & Double = js.native
  }
}
