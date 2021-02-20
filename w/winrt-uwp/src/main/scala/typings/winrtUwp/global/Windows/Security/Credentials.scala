package typings.winrtUwp.global.Windows.Security

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Credentials.KeyCredentialCreationOption
import typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult
import typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability
import typings.winrtUwp.Windows.Security.Credentials.WebAccountState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a common way to securely store and manage your passcodes, passphrases, and other identification information. */
object Credentials {
  
  /** Represents a key credential, an RSA, 2048-bit, asymmetric key that represents a user's identity for an application. */
  @JSGlobal("Windows.Security.Credentials.KeyCredential")
  @js.native
  abstract class KeyCredential ()
    extends typings.winrtUwp.Windows.Security.Credentials.KeyCredential
  
  /** Represents the results of the KeyCredential.GetAttestationAsync method. */
  @JSGlobal("Windows.Security.Credentials.KeyCredentialAttestationResult")
  @js.native
  abstract class KeyCredentialAttestationResult ()
    extends typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationResult
  
  /** Represents key credential attestation statuses. */
  @JSGlobal("Windows.Security.Credentials.KeyCredentialAttestationStatus")
  @js.native
  object KeyCredentialAttestationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus with Double
      ] = js.native
    
    /* 2 */ val notSupported: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus.notSupported with Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus.success with Double = js.native
    
    /* 3 */ val temporaryFailure: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus.temporaryFailure with Double = js.native
    
    /* 1 */ val unknownError: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus.unknownError with Double = js.native
  }
  
  /** Represents the options for creating key credentials. */
  @JSGlobal("Windows.Security.Credentials.KeyCredentialCreationOption")
  @js.native
  object KeyCredentialCreationOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Credentials.KeyCredentialCreationOption with Double
      ] = js.native
    
    /* 1 */ val failIfExists: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialCreationOption.failIfExists with Double = js.native
    
    /* 0 */ val replaceExisting: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialCreationOption.replaceExisting with Double = js.native
  }
  
  /** Contains methods for basic management of key credentials. */
  @JSGlobal("Windows.Security.Credentials.KeyCredentialManager")
  @js.native
  abstract class KeyCredentialManager ()
    extends typings.winrtUwp.Windows.Security.Credentials.KeyCredentialManager
  object KeyCredentialManager {
    
    /**
      * Deletes a previously provisioned user identity key for the current user and application.
      * @param name The name of the key to delete.
      * @return This method does not return a value.
      */
    /* static member */
    @JSGlobal("Windows.Security.Credentials.KeyCredentialManager.deleteAsync")
    @js.native
    def deleteAsync(name: String): IPromiseWithIAsyncAction = js.native
    
    /**
      * Determines if the current device and user is capable of provisioning a key credential.
      * @return When this method completes, it returns true if the current device and user is capable of provisioning a key credential. Otherwise, it returns false.
      */
    /* static member */
    @JSGlobal("Windows.Security.Credentials.KeyCredentialManager.isSupportedAsync")
    @js.native
    def isSupportedAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Retrieves a key credential for the current user and application.
      * @param name The name of the key credential to open.
      * @return When this method completes, it returns the results of the key credential retrieval.
      */
    /* static member */
    @JSGlobal("Windows.Security.Credentials.KeyCredentialManager.openAsync")
    @js.native
    def openAsync(name: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.KeyCredentialRetrievalResult] = js.native
    
    /**
      * Renews an attestation for a key credential.
      * @return This method does not return a value.
      */
    /* static member */
    @JSGlobal("Windows.Security.Credentials.KeyCredentialManager.renewAttestationAsync")
    @js.native
    def renewAttestationAsync(): IPromiseWithIAsyncAction = js.native
    
    /**
      * Creates a new key credential for the current user and application.
      * @param name The name of the key credential to create.
      * @param option Options for the creation operation.
      * @return When this method completes, it returns the results of the key credential creation.
      */
    /* static member */
    @JSGlobal("Windows.Security.Credentials.KeyCredentialManager.requestCreateAsync")
    @js.native
    def requestCreateAsync(name: String, option: KeyCredentialCreationOption): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.KeyCredentialRetrievalResult] = js.native
  }
  
  /** Represents the result of a key credential operation. */
  @JSGlobal("Windows.Security.Credentials.KeyCredentialOperationResult")
  @js.native
  abstract class KeyCredentialOperationResult ()
    extends typings.winrtUwp.Windows.Security.Credentials.KeyCredentialOperationResult
  
  /** Represents the result of a key credential retrieval. */
  @JSGlobal("Windows.Security.Credentials.KeyCredentialRetrievalResult")
  @js.native
  abstract class KeyCredentialRetrievalResult ()
    extends typings.winrtUwp.Windows.Security.Credentials.KeyCredentialRetrievalResult
  
  /** Represents the status of a key credential request. */
  @JSGlobal("Windows.Security.Credentials.KeyCredentialStatus")
  @js.native
  object KeyCredentialStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus with Double] = js.native
    
    /* 5 */ val credentialAlreadyExists: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.credentialAlreadyExists with Double = js.native
    
    /* 2 */ val notFound: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.notFound with Double = js.native
    
    /* 6 */ val securityDeviceLocked: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.securityDeviceLocked with Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.success with Double = js.native
    
    /* 1 */ val unknownError: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.unknownError with Double = js.native
    
    /* 3 */ val userCanceled: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.userCanceled with Double = js.native
    
    /* 4 */ val userPrefersPassword: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.userPrefersPassword with Double = js.native
  }
  
  /** Represents the password credential store. */
  @JSGlobal("Windows.Security.Credentials.PasswordCredential")
  @js.native
  /** Creates and initializes a new, empty instance of the PasswordCredential object. */
  class PasswordCredential ()
    extends typings.winrtUwp.Windows.Security.Credentials.PasswordCredential {
    /**
      * Creates and initializes a new instance of the PasswordCredential object that contains the provided credential data.
      * @param resource The resource for which the credentials are used.
      * @param userName The user name that must be present in the credentials.
      * @param password The password for the created credentials.
      */
    def this(resource: String, userName: String, password: String) = this()
  }
  
  /** Represents the password credential property store. This class and its members are reserved for internal use and are not intended to be used in your code. */
  @JSGlobal("Windows.Security.Credentials.PasswordCredentialPropertyStore")
  @js.native
  /** This method is reserved for internal use and is not intended to be used in your code. */
  class PasswordCredentialPropertyStore ()
    extends typings.winrtUwp.Windows.Security.Credentials.PasswordCredentialPropertyStore
  
  /** Represents a Credential Locker of credentials. The contents of the locker are specific to the app or service. Apps and services don't have access to credentials associated with other apps or services. */
  @JSGlobal("Windows.Security.Credentials.PasswordVault")
  @js.native
  /** Creates and initializes a new instance of the PasswordVault object. */
  class PasswordVault ()
    extends typings.winrtUwp.Windows.Security.Credentials.PasswordVault
  
  /** Enables you to use credentials without the complexity of the underlying operations, providing a uniform experience for credentials that reduces credential prompting to an absolute minimum. This namespace collects various types of credentials from users, stores them on the local computer, and presents them to web services and proxies by using existing authentication models. */
  object UI {
    
    /** Identifies which authentication protocol to use. */
    @JSGlobal("Windows.Security.Credentials.UI.AuthenticationProtocol")
    @js.native
    object AuthenticationProtocol extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol with Double
          ] = js.native
      
      /* 0 */ val basic: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.basic with Double = js.native
      
      /* 5 */ val credSsp: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.credSsp with Double = js.native
      
      /* 6 */ val custom: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.custom with Double = js.native
      
      /* 1 */ val digest: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.digest with Double = js.native
      
      /* 3 */ val kerberos: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.kerberos with Double = js.native
      
      /* 4 */ val negotiate: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.negotiate with Double = js.native
      
      /* 2 */ val ntlm: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.ntlm with Double = js.native
    }
    
    /** Creates an asynchronous object that displays a dialog box of credentials to the user and collects the user's response. */
    @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker")
    @js.native
    abstract class CredentialPicker ()
      extends typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPicker
    object CredentialPicker {
      
      /**
        * Displays a dialog box to the user and collects credentials from the user.
        * @param options The options on displaying and collecting the credential box.
        * @return The credential and options from the user.
        */
      /* static member */
      @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker.pickAsync")
      @js.native
      def pickAsync(options: typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerOptions): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
      /**
        * Constructor used to initiate asynchronous prompting operations using two inputs.
        * @param targetName The target name to display.
        * @param message The message to display in the dialog box.
        * @return The credential and options from the user.
        */
      /* static member */
      @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker.pickAsync")
      @js.native
      def pickAsync(targetName: String, message: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
      /**
        * Constructor used to initiate asynchronous prompting operations using three inputs.
        * @param targetName The target name to display.
        * @param message The message to display in the dialog box.
        * @param caption The caption to display in the dialog box.
        * @return The credential and options from the user.
        */
      /* static member */
      @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker.pickAsync")
      @js.native
      def pickAsync(targetName: String, message: String, caption: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
    }
    
    /** Controls the appearance and behavior of a credential prompt. */
    @JSGlobal("Windows.Security.Credentials.UI.CredentialPickerOptions")
    @js.native
    /** Creates and initializes a new, empty instance of the CredentialPickerOptions object. */
    class CredentialPickerOptions ()
      extends typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerOptions
    
    /** Describes the results of the dialog box operation. */
    @JSGlobal("Windows.Security.Credentials.UI.CredentialPickerResults")
    @js.native
    abstract class CredentialPickerResults ()
      extends typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerResults
    
    /** Identifies the state of the dialog box option on whether to save credentials. */
    @JSGlobal("Windows.Security.Credentials.UI.CredentialSaveOption")
    @js.native
    object CredentialSaveOption extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Credentials.UI.CredentialSaveOption with Double
          ] = js.native
      
      /* 2 */ val hidden: typings.winrtUwp.Windows.Security.Credentials.UI.CredentialSaveOption.hidden with Double = js.native
      
      /* 1 */ val selected: typings.winrtUwp.Windows.Security.Credentials.UI.CredentialSaveOption.selected with Double = js.native
      
      /* 0 */ val unselected: typings.winrtUwp.Windows.Security.Credentials.UI.CredentialSaveOption.unselected with Double = js.native
    }
    
    /** Describes the result of a biometric (fingerprint) verification operation. */
    @JSGlobal("Windows.Security.Credentials.UI.UserConsentVerificationResult")
    @js.native
    object UserConsentVerificationResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult with Double
          ] = js.native
      
      /* 6 */ val canceled: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.canceled with Double = js.native
      
      /* 4 */ val deviceBusy: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.deviceBusy with Double = js.native
      
      /* 1 */ val deviceNotPresent: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.deviceNotPresent with Double = js.native
      
      /* 3 */ val disabledByPolicy: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.disabledByPolicy with Double = js.native
      
      /* 2 */ val notConfiguredForUser: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.notConfiguredForUser with Double = js.native
      
      /* 5 */ val retriesExhausted: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.retriesExhausted with Double = js.native
      
      /* 0 */ val verified: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.verified with Double = js.native
    }
    
    /** Checks for availability of a biometric (fingerprint) verifier device and performs a biometric verification. */
    @JSGlobal("Windows.Security.Credentials.UI.UserConsentVerifier")
    @js.native
    abstract class UserConsentVerifier ()
      extends typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifier
    object UserConsentVerifier {
      
      /**
        * Checks to see whether a biometric (fingerprint) verifier device is available.
        * @return A UserConsentVerifierAvailability value that describes the result of the availability check operation.
        */
      /* static member */
      @JSGlobal("Windows.Security.Credentials.UI.UserConsentVerifier.checkAvailabilityAsync")
      @js.native
      def checkAvailabilityAsync(): IPromiseWithIAsyncOperation[UserConsentVerifierAvailability] = js.native
      
      /**
        * Performs a fingerprint (biometric) verification.
        * @param message A message to display to the user for this biometric verification request.
        * @return A UserConsentVerificationResult value that describes the result of the biometric verification.
        */
      /* static member */
      @JSGlobal("Windows.Security.Credentials.UI.UserConsentVerifier.requestVerificationAsync")
      @js.native
      def requestVerificationAsync(message: String): IPromiseWithIAsyncOperation[UserConsentVerificationResult] = js.native
    }
    
    /** Describes the result of a check for a biometric (fingerprint) verifier device. */
    @JSGlobal("Windows.Security.Credentials.UI.UserConsentVerifierAvailability")
    @js.native
    object UserConsentVerifierAvailability extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability with Double
          ] = js.native
      
      /* 0 */ val available: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability.available with Double = js.native
      
      /* 4 */ val deviceBusy: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability.deviceBusy with Double = js.native
      
      /* 1 */ val deviceNotPresent: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability.deviceNotPresent with Double = js.native
      
      /* 3 */ val disabledByPolicy: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability.disabledByPolicy with Double = js.native
      
      /* 2 */ val notConfiguredForUser: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability.notConfiguredForUser with Double = js.native
    }
  }
  
  /** Identifies an account from a web account provider. */
  @JSGlobal("Windows.Security.Credentials.WebAccount")
  @js.native
  class WebAccount protected ()
    extends typings.winrtUwp.Windows.Security.Credentials.WebAccount {
    /**
      * Creates an instance of the WebAccount class.
      * @param webAccountProvider The web account provider associated with the web account.
      * @param userName The user name of the web account.
      * @param state The state of the web account.
      */
    def this(
      webAccountProvider: typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider,
      userName: String,
      state: WebAccountState
    ) = this()
  }
  
  /** Represents the sizes of a web account picture. */
  @JSGlobal("Windows.Security.Credentials.WebAccountPictureSize")
  @js.native
  object WebAccountPictureSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.Credentials.WebAccountPictureSize with Double] = js.native
    
    /* 3 */ val size1080x1080: typings.winrtUwp.Windows.Security.Credentials.WebAccountPictureSize.size1080x1080 with Double = js.native
    
    /* 1 */ val size208x208: typings.winrtUwp.Windows.Security.Credentials.WebAccountPictureSize.size208x208 with Double = js.native
    
    /* 2 */ val size424x424: typings.winrtUwp.Windows.Security.Credentials.WebAccountPictureSize.size424x424 with Double = js.native
    
    /* 0 */ val size64x64: typings.winrtUwp.Windows.Security.Credentials.WebAccountPictureSize.size64x64 with Double = js.native
  }
  
  /** Represents a web account authentication provider. */
  @JSGlobal("Windows.Security.Credentials.WebAccountProvider")
  @js.native
  class WebAccountProvider protected ()
    extends typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider {
    /**
      * Creates an instance of the WebAccountProvider class.
      * @param id The web account provider id.
      * @param displayName The display name for the web account provider.
      * @param iconUri The Uri of the icon image to display for the web account provider.
      */
    def this(id: String, displayName: String, iconUri: Uri) = this()
  }
  
  /** Describes the state of a WebAccount object. */
  @JSGlobal("Windows.Security.Credentials.WebAccountState")
  @js.native
  object WebAccountState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.Credentials.WebAccountState with Double] = js.native
    
    /* 1 */ val connected: typings.winrtUwp.Windows.Security.Credentials.WebAccountState.connected with Double = js.native
    
    /* 2 */ val error: typings.winrtUwp.Windows.Security.Credentials.WebAccountState.error with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Security.Credentials.WebAccountState.none with Double = js.native
  }
}
