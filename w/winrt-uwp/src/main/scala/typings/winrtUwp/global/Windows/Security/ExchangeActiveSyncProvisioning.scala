package typings.winrtUwp.global.Windows.Security

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult
import typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType
import typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult
import typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult
import typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult
import typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult
import typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult
import typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult
import typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables an app for mail to evaluate and apply the Exchange Active Synchronization (EAS) policies. */
object ExchangeActiveSyncProvisioning {
  
  /** Provides the app the ability to retrieve device information from the local device. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasClientDeviceInformation")
  @js.native
  /** Creates an instance of an object that allows the caller app to retrieve device information from the local device. */
  open class EasClientDeviceInformation ()
    extends StObject
       with typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasClientDeviceInformation {
    
    /** Returns the friendly name of the local device. */
    /* CompleteClass */
    var friendlyName: String = js.native
    
    /** Returns the identifier of the local device. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Returns the operating system of the local device. */
    /* CompleteClass */
    var operatingSystem: String = js.native
    
    /** Returns the system firmware version of the local device. */
    /* CompleteClass */
    var systemFirmwareVersion: String = js.native
    
    /** Returns the system hardware version of the local device. */
    /* CompleteClass */
    var systemHardwareVersion: String = js.native
    
    /** Returns the system manufacturer of the local device. Use this only if the SystemSku is empty. */
    /* CompleteClass */
    var systemManufacturer: String = js.native
    
    /** Returns the system product name of the local device. */
    /* CompleteClass */
    var systemProductName: String = js.native
    
    /** Returns the system SKU of the local device. */
    /* CompleteClass */
    var systemSku: String = js.native
  }
  
  /** Modern mail apps evaluate and apply the EAS security policies. An EasClientSecurityPolicy object is constructed by the caller app to set policies received from the Exchange server or application. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasClientSecurityPolicy")
  @js.native
  /** Creates an instance of an object that allows the caller app to set policies received from the Exchange server for evaluation or application. */
  open class EasClientSecurityPolicy ()
    extends StObject
       with typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasClientSecurityPolicy {
    
    /**
      * Applies the EAS policies in asynchronous mode once the user consents. ApplyAsync is called by a Windows Store app for mail any time the app wants to make the local computer compliant.
      * @return Returns the evaluation of the callback results, in asynchronous mode, back to the calling app.
      */
    /* CompleteClass */
    override def applyAsync(): IPromiseWithIAsyncOperation[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults
      ] = js.native
    
    /**
      * Evaluates the EAS policies. CheckCompliance is called by a Windows Store app for mail any time the app wants to evaluate whether the local computer is compliant to the given EAS policies. Because this call doesn't involve any UI interactions, it is a synchronous call.
      * @return Returns the results of the compliance check, in synchronous mode.
      */
    /* CompleteClass */
    override def checkCompliance(): typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults = js.native
    
    /** Gets or sets the ability to prevent convenience logons. DisallowConvenienceLogon is not defined in MS-ASPROV. It is mapped from MS-ASPROV AllowSimplePassword with respect to the Windows password policies. */
    /* CompleteClass */
    var disallowConvenienceLogon: Boolean = js.native
    
    /** Gets or sets the maximum length of time the computer can remain inactive before it is locked. The MS-ASPROV name is MaxInactivityTimeDeviceLock. */
    /* CompleteClass */
    var maxInactivityTimeLock: Double = js.native
    
    /** Gets or sets the maximum number of failed password attempts for logging on. The MS-ASPROV name is MaxDevicePasswordFailedAttempts. */
    /* CompleteClass */
    var maxPasswordFailedAttempts: Double = js.native
    
    /** Gets or sets the minimum number of complex characters that are required for a password. The MS-ASPROV name is MinDevicePasswordComplexCharacters. */
    /* CompleteClass */
    var minPasswordComplexCharacters: Double = js.native
    
    /** Gets or set the minimum length of password allowed. The MS-ASPROV name is MinPasswordLength. */
    /* CompleteClass */
    var minPasswordLength: Double = js.native
    
    /** Gets or set the length of time that a password is valid. The MS-ASPROV name is DevicePasswordExpiration. */
    /* CompleteClass */
    var passwordExpiration: Double = js.native
    
    /** Gets or set the password information previously used. The MS-ASPROV name is DevicePasswordHistory. */
    /* CompleteClass */
    var passwordHistory: Double = js.native
    
    /** Gets or sets whether encryption is required. The MS-ASPROV name is RequireDeviceEncryption. */
    /* CompleteClass */
    var requireEncryption: Boolean = js.native
  }
  
  /** Provides the mail app with the results of the evaluation of the EAS security policies. Every policy being evaluated returns an enumerated value indicating the evaluation results against the policy. The evaluations results are encapsulated in the EasComplianceResults object for the caller app to retrieve. */
  /* note: abstract class */ @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults")
  @js.native
  open class EasComplianceResults ()
    extends StObject
       with typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults {
    
    /** Returns the result of whether the computer is compliant with the EAS policies. */
    /* CompleteClass */
    var compliant: Boolean = js.native
    
    /** Returns the result of whether convenience logons are disallowed. */
    /* CompleteClass */
    var disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult = js.native
    
    /** Gets the type of the Exchange ActiveSync encryption provider. */
    /* CompleteClass */
    var encryptionProviderType: EasEncryptionProviderType = js.native
    
    /** Returns the result of the maximum time of inactivity allowed before the computer is locked. */
    /* CompleteClass */
    var maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult = js.native
    
    /** Returns the result of the maximum number of failed password attempts allowed. */
    /* CompleteClass */
    var maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult = js.native
    
    /** Returns the result of the minimum number of complex password characters required. */
    /* CompleteClass */
    var minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult = js.native
    
    /** Returns the result of the minimum length of the password required. */
    /* CompleteClass */
    var minPasswordLengthResult: EasMinPasswordLengthResult = js.native
    
    /** Returns the result of whether the password is expired. */
    /* CompleteClass */
    var passwordExpirationResult: EasPasswordExpirationResult = js.native
    
    /** Returns the result of the history of passwords. */
    /* CompleteClass */
    var passwordHistoryResult: EasPasswordHistoryResult = js.native
    
    /** Returns the result of whether encryption is required. */
    /* CompleteClass */
    var requireEncryptionResult: EasRequireEncryptionResult = js.native
  }
  
  /** Results of whether the logon can occur. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult")
  @js.native
  object EasDisallowConvenienceLogonResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult & Double
      ] = js.native
    
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.canBeCompliant & Double = js.native
    
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.compliant & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.notEvaluated & Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.requestedPolicyIsStricter & Double = js.native
  }
  
  /** Describes the type of Exchange ActiveSync encryption provider. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType")
  @js.native
  object EasEncryptionProviderType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType & Double
      ] = js.native
    
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType.notEvaluated & Double = js.native
    
    /* 2 */ val otherEncryption: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType.otherEncryption & Double = js.native
    
    /* 1 */ val windowsEncryption: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType.windowsEncryption & Double = js.native
  }
  
  /** Represents the maximum length of time result before locking the computer. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult")
  @js.native
  object EasMaxInactivityTimeLockResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult & Double
      ] = js.native
    
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.canBeCompliant & Double = js.native
    
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.compliant & Double = js.native
    
    /* 4 */ val invalidParameter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.invalidParameter & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.notEvaluated & Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.requestedPolicyIsStricter & Double = js.native
  }
  
  /** Represents the maximum number of password attempts results. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult")
  @js.native
  object EasMaxPasswordFailedAttemptsResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult & Double
      ] = js.native
    
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.canBeCompliant & Double = js.native
    
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.compliant & Double = js.native
    
    /* 4 */ val invalidParameter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.invalidParameter & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.notEvaluated & Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.requestedPolicyIsStricter & Double = js.native
  }
  
  /** Represents the minimum complexity result for passwords. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult")
  @js.native
  object EasMinPasswordComplexCharactersResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult & Double
      ] = js.native
    
    /* 9 */ val adminsCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.adminsCannotChangePassword & Double = js.native
    
    /* 7 */ val adminsHaveBlankPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.adminsHaveBlankPassword & Double = js.native
    
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.canBeCompliant & Double = js.native
    
    /* 13 */ val changeConnectedAdminsPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.changeConnectedAdminsPassword & Double = js.native
    
    /* 14 */ val changeConnectedUserPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.changeConnectedUserPassword & Double = js.native
    
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.compliant & Double = js.native
    
    /* 11 */ val connectedAdminsProviderPolicyIsWeak: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.connectedAdminsProviderPolicyIsWeak & Double = js.native
    
    /* 12 */ val connectedUserProviderPolicyIsWeak: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.connectedUserProviderPolicyIsWeak & Double = js.native
    
    /* 6 */ val currentUserHasBlankPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.currentUserHasBlankPassword & Double = js.native
    
    /* 5 */ val invalidParameter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.invalidParameter & Double = js.native
    
    /* 10 */ val localControlledUsersCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.localControlledUsersCannotChangePassword & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.notEvaluated & Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.requestedPolicyIsStricter & Double = js.native
    
    /* 4 */ val requestedPolicyNotEnforceable: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.requestedPolicyNotEnforceable & Double = js.native
    
    /* 8 */ val userCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.userCannotChangePassword & Double = js.native
  }
  
  /** Represents the minimum length result for passwords. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult")
  @js.native
  object EasMinPasswordLengthResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult & Double
      ] = js.native
    
    /* 9 */ val adminsCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.adminsCannotChangePassword & Double = js.native
    
    /* 7 */ val adminsHaveBlankPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.adminsHaveBlankPassword & Double = js.native
    
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.canBeCompliant & Double = js.native
    
    /* 13 */ val changeConnectedAdminsPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.changeConnectedAdminsPassword & Double = js.native
    
    /* 14 */ val changeConnectedUserPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.changeConnectedUserPassword & Double = js.native
    
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.compliant & Double = js.native
    
    /* 11 */ val connectedAdminsProviderPolicyIsWeak: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.connectedAdminsProviderPolicyIsWeak & Double = js.native
    
    /* 12 */ val connectedUserProviderPolicyIsWeak: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.connectedUserProviderPolicyIsWeak & Double = js.native
    
    /* 6 */ val currentUserHasBlankPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.currentUserHasBlankPassword & Double = js.native
    
    /* 5 */ val invalidParameter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.invalidParameter & Double = js.native
    
    /* 10 */ val localControlledUsersCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.localControlledUsersCannotChangePassword & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.notEvaluated & Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.requestedPolicyIsStricter & Double = js.native
    
    /* 4 */ val requestedPolicyNotEnforceable: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.requestedPolicyNotEnforceable & Double = js.native
    
    /* 8 */ val userCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.userCannotChangePassword & Double = js.native
  }
  
  /** Results of querying on the password expiration information. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult")
  @js.native
  object EasPasswordExpirationResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult & Double
      ] = js.native
    
    /* 7 */ val adminsCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.adminsCannotChangePassword & Double = js.native
    
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.canBeCompliant & Double = js.native
    
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.compliant & Double = js.native
    
    /* 5 */ val invalidParameter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.invalidParameter & Double = js.native
    
    /* 8 */ val localControlledUsersCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.localControlledUsersCannotChangePassword & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.notEvaluated & Double = js.native
    
    /* 4 */ val requestedExpirationIncompatible: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedExpirationIncompatible & Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedPolicyIsStricter & Double = js.native
    
    /* 6 */ val userCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.userCannotChangePassword & Double = js.native
  }
  
  /** Represents the password history. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult")
  @js.native
  object EasPasswordHistoryResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult & Double
      ] = js.native
    
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.canBeCompliant & Double = js.native
    
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.compliant & Double = js.native
    
    /* 4 */ val invalidParameter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.invalidParameter & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.notEvaluated & Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.requestedPolicyIsStricter & Double = js.native
  }
  
  /** Represents the type of encryption required. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult")
  @js.native
  object EasRequireEncryptionResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult & Double
      ] = js.native
    
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.canBeCompliant & Double = js.native
    
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.compliant & Double = js.native
    
    /* 4 */ val deFixedDataNotSupported: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deFixedDataNotSupported & Double = js.native
    
    /* 6 */ val deHardwareNotCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deHardwareNotCompliant & Double = js.native
    
    /* 12 */ val deOsVolumeNotProtected: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deOsVolumeNotProtected & Double = js.native
    
    /* 14 */ val deProtectionNotYetEnabled: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deProtectionNotYetEnabled & Double = js.native
    
    /* 10 */ val deProtectionSuspended: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deProtectionSuspended & Double = js.native
    
    /* 8 */ val deWinReNotConfigured: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deWinReNotConfigured & Double = js.native
    
    /* 5 */ val fixedDataNotSupported: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.fixedDataNotSupported & Double = js.native
    
    /* 7 */ val hardwareNotCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.hardwareNotCompliant & Double = js.native
    
    /* 9 */ val lockNotConfigured: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.lockNotConfigured & Double = js.native
    
    /* 16 */ val noFeatureLicense: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.noFeatureLicense & Double = js.native
    
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.notEvaluated & Double = js.native
    
    /* 3 */ val notProvisionedOnAllVolumes: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.notProvisionedOnAllVolumes & Double = js.native
    
    /* 17 */ val osNotProtected: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.osNotProtected & Double = js.native
    
    /* 13 */ val osVolumeNotProtected: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.osVolumeNotProtected & Double = js.native
    
    /* 15 */ val protectionNotYetEnabled: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.protectionNotYetEnabled & Double = js.native
    
    /* 11 */ val protectionSuspended: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.protectionSuspended & Double = js.native
    
    /* 18 */ val unexpectedFailure: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.unexpectedFailure & Double = js.native
  }
}
