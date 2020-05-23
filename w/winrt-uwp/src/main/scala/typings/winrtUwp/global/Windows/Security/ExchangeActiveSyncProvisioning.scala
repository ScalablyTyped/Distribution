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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables an app for mail to evaluate and apply the Exchange Active Synchronization (EAS) policies. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning")
@js.native
object ExchangeActiveSyncProvisioning extends js.Object {
  /** Provides the app the ability to retrieve device information from the local device. */
  @js.native
  /** Creates an instance of an object that allows the caller app to retrieve device information from the local device. */
  class EasClientDeviceInformation ()
    extends typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasClientDeviceInformation {
    /** Returns the friendly name of the local device. */
    /* CompleteClass */
    override var friendlyName: String = js.native
    /** Returns the identifier of the local device. */
    /* CompleteClass */
    override var id: String = js.native
    /** Returns the operating system of the local device. */
    /* CompleteClass */
    override var operatingSystem: String = js.native
    /** Returns the system firmware version of the local device. */
    /* CompleteClass */
    override var systemFirmwareVersion: String = js.native
    /** Returns the system hardware version of the local device. */
    /* CompleteClass */
    override var systemHardwareVersion: String = js.native
    /** Returns the system manufacturer of the local device. Use this only if the SystemSku is empty. */
    /* CompleteClass */
    override var systemManufacturer: String = js.native
    /** Returns the system product name of the local device. */
    /* CompleteClass */
    override var systemProductName: String = js.native
    /** Returns the system SKU of the local device. */
    /* CompleteClass */
    override var systemSku: String = js.native
  }
  
  /** Modern mail apps evaluate and apply the EAS security policies. An EasClientSecurityPolicy object is constructed by the caller app to set policies received from the Exchange server or application. */
  @js.native
  /** Creates an instance of an object that allows the caller app to set policies received from the Exchange server for evaluation or application. */
  class EasClientSecurityPolicy ()
    extends typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasClientSecurityPolicy {
    /** Gets or sets the ability to prevent convenience logons. DisallowConvenienceLogon is not defined in MS-ASPROV. It is mapped from MS-ASPROV AllowSimplePassword with respect to the Windows password policies. */
    /* CompleteClass */
    override var disallowConvenienceLogon: Boolean = js.native
    /** Gets or sets the maximum length of time the computer can remain inactive before it is locked. The MS-ASPROV name is MaxInactivityTimeDeviceLock. */
    /* CompleteClass */
    override var maxInactivityTimeLock: Double = js.native
    /** Gets or sets the maximum number of failed password attempts for logging on. The MS-ASPROV name is MaxDevicePasswordFailedAttempts. */
    /* CompleteClass */
    override var maxPasswordFailedAttempts: Double = js.native
    /** Gets or sets the minimum number of complex characters that are required for a password. The MS-ASPROV name is MinDevicePasswordComplexCharacters. */
    /* CompleteClass */
    override var minPasswordComplexCharacters: Double = js.native
    /** Gets or set the minimum length of password allowed. The MS-ASPROV name is MinPasswordLength. */
    /* CompleteClass */
    override var minPasswordLength: Double = js.native
    /** Gets or set the length of time that a password is valid. The MS-ASPROV name is DevicePasswordExpiration. */
    /* CompleteClass */
    override var passwordExpiration: Double = js.native
    /** Gets or set the password information previously used. The MS-ASPROV name is DevicePasswordHistory. */
    /* CompleteClass */
    override var passwordHistory: Double = js.native
    /** Gets or sets whether encryption is required. The MS-ASPROV name is RequireDeviceEncryption. */
    /* CompleteClass */
    override var requireEncryption: Boolean = js.native
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
  }
  
  /** Provides the mail app with the results of the evaluation of the EAS security policies. Every policy being evaluated returns an enumerated value indicating the evaluation results against the policy. The evaluations results are encapsulated in the EasComplianceResults object for the caller app to retrieve. */
  @js.native
  abstract class EasComplianceResults ()
    extends typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults {
    /** Returns the result of whether the computer is compliant with the EAS policies. */
    /* CompleteClass */
    override var compliant: Boolean = js.native
    /** Returns the result of whether convenience logons are disallowed. */
    /* CompleteClass */
    override var disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult = js.native
    /** Gets the type of the Exchange ActiveSync encryption provider. */
    /* CompleteClass */
    override var encryptionProviderType: EasEncryptionProviderType = js.native
    /** Returns the result of the maximum time of inactivity allowed before the computer is locked. */
    /* CompleteClass */
    override var maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult = js.native
    /** Returns the result of the maximum number of failed password attempts allowed. */
    /* CompleteClass */
    override var maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult = js.native
    /** Returns the result of the minimum number of complex password characters required. */
    /* CompleteClass */
    override var minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult = js.native
    /** Returns the result of the minimum length of the password required. */
    /* CompleteClass */
    override var minPasswordLengthResult: EasMinPasswordLengthResult = js.native
    /** Returns the result of whether the password is expired. */
    /* CompleteClass */
    override var passwordExpirationResult: EasPasswordExpirationResult = js.native
    /** Returns the result of the history of passwords. */
    /* CompleteClass */
    override var passwordHistoryResult: EasPasswordHistoryResult = js.native
    /** Returns the result of whether encryption is required. */
    /* CompleteClass */
    override var requireEncryptionResult: EasRequireEncryptionResult = js.native
  }
  
  /** Results of whether the logon can occur. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @js.native
  object EasDisallowConvenienceLogonResult extends js.Object {
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.canBeCompliant with Double = js.native
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.compliant with Double = js.native
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.notEvaluated with Double = js.native
    /* 3 */ val requestedPolicyIsStricter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.requestedPolicyIsStricter with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult with Double
      ] = js.native
  }
  
  /** Describes the type of Exchange ActiveSync encryption provider. */
  @js.native
  object EasEncryptionProviderType extends js.Object {
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType.notEvaluated with Double = js.native
    /* 2 */ val otherEncryption: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType.otherEncryption with Double = js.native
    /* 1 */ val windowsEncryption: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType.windowsEncryption with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType with Double
      ] = js.native
  }
  
  /** Represents the maximum length of time result before locking the computer. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @js.native
  object EasMaxInactivityTimeLockResult extends js.Object {
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.canBeCompliant with Double = js.native
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.compliant with Double = js.native
    /* 4 */ val invalidParameter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.invalidParameter with Double = js.native
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.notEvaluated with Double = js.native
    /* 3 */ val requestedPolicyIsStricter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.requestedPolicyIsStricter with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult with Double
      ] = js.native
  }
  
  /** Represents the maximum number of password attempts results. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @js.native
  object EasMaxPasswordFailedAttemptsResult extends js.Object {
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.canBeCompliant with Double = js.native
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.compliant with Double = js.native
    /* 4 */ val invalidParameter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.invalidParameter with Double = js.native
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.notEvaluated with Double = js.native
    /* 3 */ val requestedPolicyIsStricter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.requestedPolicyIsStricter with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult with Double
      ] = js.native
  }
  
  /** Represents the minimum complexity result for passwords. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @js.native
  object EasMinPasswordComplexCharactersResult extends js.Object {
    /* 9 */ val adminsCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.adminsCannotChangePassword with Double = js.native
    /* 7 */ val adminsHaveBlankPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.adminsHaveBlankPassword with Double = js.native
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.canBeCompliant with Double = js.native
    /* 13 */ val changeConnectedAdminsPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.changeConnectedAdminsPassword with Double = js.native
    /* 14 */ val changeConnectedUserPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.changeConnectedUserPassword with Double = js.native
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.compliant with Double = js.native
    /* 11 */ val connectedAdminsProviderPolicyIsWeak: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.connectedAdminsProviderPolicyIsWeak with Double = js.native
    /* 12 */ val connectedUserProviderPolicyIsWeak: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.connectedUserProviderPolicyIsWeak with Double = js.native
    /* 6 */ val currentUserHasBlankPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.currentUserHasBlankPassword with Double = js.native
    /* 5 */ val invalidParameter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.invalidParameter with Double = js.native
    /* 10 */ val localControlledUsersCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.localControlledUsersCannotChangePassword with Double = js.native
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.notEvaluated with Double = js.native
    /* 3 */ val requestedPolicyIsStricter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.requestedPolicyIsStricter with Double = js.native
    /* 4 */ val requestedPolicyNotEnforceable: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.requestedPolicyNotEnforceable with Double = js.native
    /* 8 */ val userCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.userCannotChangePassword with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult with Double
      ] = js.native
  }
  
  /** Represents the minimum length result for passwords. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @js.native
  object EasMinPasswordLengthResult extends js.Object {
    /* 9 */ val adminsCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.adminsCannotChangePassword with Double = js.native
    /* 7 */ val adminsHaveBlankPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.adminsHaveBlankPassword with Double = js.native
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.canBeCompliant with Double = js.native
    /* 13 */ val changeConnectedAdminsPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.changeConnectedAdminsPassword with Double = js.native
    /* 14 */ val changeConnectedUserPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.changeConnectedUserPassword with Double = js.native
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.compliant with Double = js.native
    /* 11 */ val connectedAdminsProviderPolicyIsWeak: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.connectedAdminsProviderPolicyIsWeak with Double = js.native
    /* 12 */ val connectedUserProviderPolicyIsWeak: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.connectedUserProviderPolicyIsWeak with Double = js.native
    /* 6 */ val currentUserHasBlankPassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.currentUserHasBlankPassword with Double = js.native
    /* 5 */ val invalidParameter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.invalidParameter with Double = js.native
    /* 10 */ val localControlledUsersCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.localControlledUsersCannotChangePassword with Double = js.native
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.notEvaluated with Double = js.native
    /* 3 */ val requestedPolicyIsStricter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.requestedPolicyIsStricter with Double = js.native
    /* 4 */ val requestedPolicyNotEnforceable: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.requestedPolicyNotEnforceable with Double = js.native
    /* 8 */ val userCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.userCannotChangePassword with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult with Double
      ] = js.native
  }
  
  /** Results of querying on the password expiration information. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @js.native
  object EasPasswordExpirationResult extends js.Object {
    /* 7 */ val adminsCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.adminsCannotChangePassword with Double = js.native
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.canBeCompliant with Double = js.native
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.compliant with Double = js.native
    /* 5 */ val invalidParameter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.invalidParameter with Double = js.native
    /* 8 */ val localControlledUsersCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.localControlledUsersCannotChangePassword with Double = js.native
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.notEvaluated with Double = js.native
    /* 4 */ val requestedExpirationIncompatible: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedExpirationIncompatible with Double = js.native
    /* 3 */ val requestedPolicyIsStricter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedPolicyIsStricter with Double = js.native
    /* 6 */ val userCannotChangePassword: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.userCannotChangePassword with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult with Double
      ] = js.native
  }
  
  /** Represents the password history. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @js.native
  object EasPasswordHistoryResult extends js.Object {
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.canBeCompliant with Double = js.native
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.compliant with Double = js.native
    /* 4 */ val invalidParameter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.invalidParameter with Double = js.native
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.notEvaluated with Double = js.native
    /* 3 */ val requestedPolicyIsStricter: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.requestedPolicyIsStricter with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult with Double
      ] = js.native
  }
  
  /** Represents the type of encryption required. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @js.native
  object EasRequireEncryptionResult extends js.Object {
    /* 2 */ val canBeCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.canBeCompliant with Double = js.native
    /* 1 */ val compliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.compliant with Double = js.native
    /* 4 */ val deFixedDataNotSupported: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deFixedDataNotSupported with Double = js.native
    /* 6 */ val deHardwareNotCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deHardwareNotCompliant with Double = js.native
    /* 12 */ val deOsVolumeNotProtected: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deOsVolumeNotProtected with Double = js.native
    /* 14 */ val deProtectionNotYetEnabled: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deProtectionNotYetEnabled with Double = js.native
    /* 10 */ val deProtectionSuspended: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deProtectionSuspended with Double = js.native
    /* 8 */ val deWinReNotConfigured: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deWinReNotConfigured with Double = js.native
    /* 5 */ val fixedDataNotSupported: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.fixedDataNotSupported with Double = js.native
    /* 7 */ val hardwareNotCompliant: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.hardwareNotCompliant with Double = js.native
    /* 9 */ val lockNotConfigured: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.lockNotConfigured with Double = js.native
    /* 16 */ val noFeatureLicense: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.noFeatureLicense with Double = js.native
    /* 0 */ val notEvaluated: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.notEvaluated with Double = js.native
    /* 3 */ val notProvisionedOnAllVolumes: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.notProvisionedOnAllVolumes with Double = js.native
    /* 17 */ val osNotProtected: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.osNotProtected with Double = js.native
    /* 13 */ val osVolumeNotProtected: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.osVolumeNotProtected with Double = js.native
    /* 15 */ val protectionNotYetEnabled: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.protectionNotYetEnabled with Double = js.native
    /* 11 */ val protectionSuspended: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.protectionSuspended with Double = js.native
    /* 18 */ val unexpectedFailure: typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.unexpectedFailure with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult with Double
      ] = js.native
  }
  
}

