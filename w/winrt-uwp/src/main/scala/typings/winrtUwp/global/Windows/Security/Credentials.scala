package typings.winrtUwp.global.Windows.Security

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus
import typings.winrtUwp.Windows.Security.Credentials.KeyCredentialCreationOption
import typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus
import typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol
import typings.winrtUwp.Windows.Security.Credentials.UI.CredentialSaveOption
import typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult
import typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability
import typings.winrtUwp.Windows.Security.Credentials.WebAccountState
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.System.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a common way to securely store and manage your passcodes, passphrases, and other identification information. */
object Credentials {
  
  /** Represents a key credential, an RSA, 2048-bit, asymmetric key that represents a user's identity for an application. */
  @JSGlobal("Windows.Security.Credentials.KeyCredential")
  @js.native
  abstract class KeyCredential ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Credentials.KeyCredential
  
  /** Represents the results of the KeyCredential.GetAttestationAsync method. */
  @JSGlobal("Windows.Security.Credentials.KeyCredentialAttestationResult")
  @js.native
  abstract class KeyCredentialAttestationResult ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationResult {
    
    /** Gets the attestation information for the KeyCredential. */
    /* CompleteClass */
    var attestationBuffer: IBuffer = js.native
    
    /** Gets the chain of certificates used to verify the attestation. */
    /* CompleteClass */
    var certificateChainBuffer: IBuffer = js.native
    
    /** Gets the status of the key credential attestation. */
    /* CompleteClass */
    var status: KeyCredentialAttestationStatus = js.native
  }
  
  /** Represents key credential attestation statuses. */
  @JSGlobal("Windows.Security.Credentials.KeyCredentialAttestationStatus")
  @js.native
  object KeyCredentialAttestationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus & Double
      ] = js.native
    
    /* 2 */ val notSupported: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus.notSupported & Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus.success & Double = js.native
    
    /* 3 */ val temporaryFailure: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus.temporaryFailure & Double = js.native
    
    /* 1 */ val unknownError: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialAttestationStatus.unknownError & Double = js.native
  }
  
  /** Represents the options for creating key credentials. */
  @JSGlobal("Windows.Security.Credentials.KeyCredentialCreationOption")
  @js.native
  object KeyCredentialCreationOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Credentials.KeyCredentialCreationOption & Double
      ] = js.native
    
    /* 1 */ val failIfExists: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialCreationOption.failIfExists & Double = js.native
    
    /* 0 */ val replaceExisting: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialCreationOption.replaceExisting & Double = js.native
  }
  
  /** Contains methods for basic management of key credentials. */
  @JSGlobal("Windows.Security.Credentials.KeyCredentialManager")
  @js.native
  abstract class KeyCredentialManager ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Credentials.KeyCredentialManager
  object KeyCredentialManager {
    
    @JSGlobal("Windows.Security.Credentials.KeyCredentialManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Deletes a previously provisioned user identity key for the current user and application.
      * @param name The name of the key to delete.
      * @return This method does not return a value.
      */
    /* static member */
    @scala.inline
    def deleteAsync(name: String): IPromiseWithIAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAsync")(name.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncAction]
    
    /**
      * Determines if the current device and user is capable of provisioning a key credential.
      * @return When this method completes, it returns true if the current device and user is capable of provisioning a key credential. Otherwise, it returns false.
      */
    /* static member */
    @scala.inline
    def isSupportedAsync(): IPromiseWithIAsyncOperation[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedAsync")().asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
    
    /**
      * Retrieves a key credential for the current user and application.
      * @param name The name of the key credential to open.
      * @return When this method completes, it returns the results of the key credential retrieval.
      */
    /* static member */
    @scala.inline
    def openAsync(name: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.KeyCredentialRetrievalResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("openAsync")(name.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.KeyCredentialRetrievalResult]]
    
    /**
      * Renews an attestation for a key credential.
      * @return This method does not return a value.
      */
    /* static member */
    @scala.inline
    def renewAttestationAsync(): IPromiseWithIAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("renewAttestationAsync")().asInstanceOf[IPromiseWithIAsyncAction]
    
    /**
      * Creates a new key credential for the current user and application.
      * @param name The name of the key credential to create.
      * @param option Options for the creation operation.
      * @return When this method completes, it returns the results of the key credential creation.
      */
    /* static member */
    @scala.inline
    def requestCreateAsync(name: String, option: KeyCredentialCreationOption): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.KeyCredentialRetrievalResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestCreateAsync")(name.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.KeyCredentialRetrievalResult]]
  }
  
  /** Represents the result of a key credential operation. */
  @JSGlobal("Windows.Security.Credentials.KeyCredentialOperationResult")
  @js.native
  abstract class KeyCredentialOperationResult ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Credentials.KeyCredentialOperationResult {
    
    /** Gets the result of the key credential operation. */
    /* CompleteClass */
    var result: IBuffer = js.native
    
    /** Gets the status of the key credential. */
    /* CompleteClass */
    var status: KeyCredentialStatus = js.native
  }
  
  /** Represents the result of a key credential retrieval. */
  @JSGlobal("Windows.Security.Credentials.KeyCredentialRetrievalResult")
  @js.native
  abstract class KeyCredentialRetrievalResult ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Credentials.KeyCredentialRetrievalResult {
    
    /** Gets the key credential. */
    /* CompleteClass */
    var credential: typings.winrtUwp.Windows.Security.Credentials.KeyCredential = js.native
    
    /** Gets the status of the key credential. */
    /* CompleteClass */
    var status: KeyCredentialStatus = js.native
  }
  
  /** Represents the status of a key credential request. */
  @JSGlobal("Windows.Security.Credentials.KeyCredentialStatus")
  @js.native
  object KeyCredentialStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus & Double] = js.native
    
    /* 5 */ val credentialAlreadyExists: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.credentialAlreadyExists & Double = js.native
    
    /* 2 */ val notFound: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.notFound & Double = js.native
    
    /* 6 */ val securityDeviceLocked: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.securityDeviceLocked & Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.success & Double = js.native
    
    /* 1 */ val unknownError: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.unknownError & Double = js.native
    
    /* 3 */ val userCanceled: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.userCanceled & Double = js.native
    
    /* 4 */ val userPrefersPassword: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.userPrefersPassword & Double = js.native
  }
  
  /** Represents the password credential store. */
  @JSGlobal("Windows.Security.Credentials.PasswordCredential")
  @js.native
  /** Creates and initializes a new, empty instance of the PasswordCredential object. */
  class PasswordCredential ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Credentials.PasswordCredential {
    /**
      * Creates and initializes a new instance of the PasswordCredential object that contains the provided credential data.
      * @param resource The resource for which the credentials are used.
      * @param userName The user name that must be present in the credentials.
      * @param password The password for the created credentials.
      */
    def this(resource: String, userName: String, password: String) = this()
    
    /** Gets or sets the password string of the credential. */
    /* CompleteClass */
    var password: String = js.native
    
    /** This API is intended for internal use only should not be used in your code. */
    /* CompleteClass */
    var properties: IPropertySet = js.native
    
    /** Gets or sets the resource of the credential. */
    /* CompleteClass */
    var resource: String = js.native
    
    /** Populates the password for the credential. After the operation returns successfully, you can get the password from the Password property. */
    /* CompleteClass */
    override def retrievePassword(): Unit = js.native
    
    /** Gets or sets the user name of the credential. */
    /* CompleteClass */
    var userName: String = js.native
  }
  
  /** Represents the password credential property store. This class and its members are reserved for internal use and are not intended to be used in your code. */
  @JSGlobal("Windows.Security.Credentials.PasswordCredentialPropertyStore")
  @js.native
  /** This method is reserved for internal use and is not intended to be used in your code. */
  class PasswordCredentialPropertyStore ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Credentials.PasswordCredentialPropertyStore
  
  /** Represents a Credential Locker of credentials. The contents of the locker are specific to the app or service. Apps and services don't have access to credentials associated with other apps or services. */
  @JSGlobal("Windows.Security.Credentials.PasswordVault")
  @js.native
  /** Creates and initializes a new instance of the PasswordVault object. */
  class PasswordVault ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Credentials.PasswordVault {
    
    /**
      * Adds a credential to the Credential Locker.
      * @param credential The credential to be added.
      */
    /* CompleteClass */
    override def add(credential: typings.winrtUwp.Windows.Security.Credentials.PasswordCredential): Unit = js.native
    
    /**
      * Searches the Credential Locker for credentials matching the resource specified.
      * @param resource The resource to be searched for.
      * @return When this method returns, contains an IVectorView of credential objects that match the search criteria.
      */
    /* CompleteClass */
    override def findAllByResource(resource: String): IVectorView[typings.winrtUwp.Windows.Security.Credentials.PasswordCredential] = js.native
    
    /**
      * Searches the Credential Locker for credentials that match the user name specified.
      * @param userName The user name to be searched for.
      * @return When this method returns, contains an IVectorView of credential objects that match the search criteria.
      */
    /* CompleteClass */
    override def findAllByUserName(userName: String): IVectorView[typings.winrtUwp.Windows.Security.Credentials.PasswordCredential] = js.native
    
    /**
      * Removes a credential from the Credential Locker.
      * @param credential The credential to be removed.
      */
    /* CompleteClass */
    override def remove(credential: typings.winrtUwp.Windows.Security.Credentials.PasswordCredential): Unit = js.native
    
    /**
      * Reads a credential from the Credential Locker.
      * @param resource The resource for which the credential is used.
      * @param userName The user name that must be present in the credential.
      * @return The returned credential that contains all the data.
      */
    /* CompleteClass */
    override def retrieve(resource: String, userName: String): typings.winrtUwp.Windows.Security.Credentials.PasswordCredential = js.native
    
    /**
      * Retrieves all of the credentials stored in the Credential Locker.
      * @return When this method returns, contains an IVectorView output of credential objects that match the search criteria. This output is a snapshot and not dynamic. If the results are used for updating or deleting credentials, those changes won't be reflected in the previous output.
      */
    /* CompleteClass */
    override def retrieveAll(): IVectorView[typings.winrtUwp.Windows.Security.Credentials.PasswordCredential] = js.native
  }
  
  /** Enables you to use credentials without the complexity of the underlying operations, providing a uniform experience for credentials that reduces credential prompting to an absolute minimum. This namespace collects various types of credentials from users, stores them on the local computer, and presents them to web services and proxies by using existing authentication models. */
  object UI {
    
    /** Identifies which authentication protocol to use. */
    @JSGlobal("Windows.Security.Credentials.UI.AuthenticationProtocol")
    @js.native
    object AuthenticationProtocol extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol & Double] = js.native
      
      /* 0 */ val basic: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.basic & Double = js.native
      
      /* 5 */ val credSsp: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.credSsp & Double = js.native
      
      /* 6 */ val custom: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.custom & Double = js.native
      
      /* 1 */ val digest: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.digest & Double = js.native
      
      /* 3 */ val kerberos: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.kerberos & Double = js.native
      
      /* 4 */ val negotiate: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.negotiate & Double = js.native
      
      /* 2 */ val ntlm: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.ntlm & Double = js.native
    }
    
    /** Creates an asynchronous object that displays a dialog box of credentials to the user and collects the user's response. */
    @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker")
    @js.native
    abstract class CredentialPicker ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPicker
    object CredentialPicker {
      
      @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Displays a dialog box to the user and collects credentials from the user.
        * @param options The options on displaying and collecting the credential box.
        * @return The credential and options from the user.
        */
      /* static member */
      @scala.inline
      def pickAsync(options: typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerOptions): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("pickAsync")(options.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerResults]]
      /**
        * Constructor used to initiate asynchronous prompting operations using two inputs.
        * @param targetName The target name to display.
        * @param message The message to display in the dialog box.
        * @return The credential and options from the user.
        */
      /* static member */
      @scala.inline
      def pickAsync(targetName: String, message: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("pickAsync")(targetName.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerResults]]
      /**
        * Constructor used to initiate asynchronous prompting operations using three inputs.
        * @param targetName The target name to display.
        * @param message The message to display in the dialog box.
        * @param caption The caption to display in the dialog box.
        * @return The credential and options from the user.
        */
      /* static member */
      @scala.inline
      def pickAsync(targetName: String, message: String, caption: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("pickAsync")(targetName.asInstanceOf[js.Any], message.asInstanceOf[js.Any], caption.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerResults]]
    }
    
    /** Controls the appearance and behavior of a credential prompt. */
    @JSGlobal("Windows.Security.Credentials.UI.CredentialPickerOptions")
    @js.native
    /** Creates and initializes a new, empty instance of the CredentialPickerOptions object. */
    class CredentialPickerOptions ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerOptions {
      
      /** Gets or sets the option of whether the dialog box is displayed. */
      /* CompleteClass */
      var alwaysDisplayDialog: Boolean = js.native
      
      /** Gets or sets the authentication protocol. */
      /* CompleteClass */
      var authenticationProtocol: AuthenticationProtocol = js.native
      
      /** Gets or sets whether the caller wants to save the credentials. */
      /* CompleteClass */
      var callerSavesCredential: Boolean = js.native
      
      /** Gets or sets the caption text that is displayed to the user. */
      /* CompleteClass */
      var caption: String = js.native
      
      /** Gets or sets the option on saving credentials. */
      /* CompleteClass */
      var credentialSaveOption: CredentialSaveOption = js.native
      
      /** Gets or sets whether the authentication protocol is custom rather than a standard authentication protocol. */
      /* CompleteClass */
      var customAuthenticationProtocol: String = js.native
      
      /** Gets or sets the error code. */
      /* CompleteClass */
      var errorCode: Double = js.native
      
      /** Gets or sets the body of text that displays to the user. */
      /* CompleteClass */
      var message: String = js.native
      
      /** Gets or sets whether to fill dialog box fields with previous credentials. */
      /* CompleteClass */
      var previousCredential: IBuffer = js.native
      
      /** Gets or sets the name of the target computer. */
      /* CompleteClass */
      var targetName: String = js.native
    }
    
    /** Describes the results of the dialog box operation. */
    @JSGlobal("Windows.Security.Credentials.UI.CredentialPickerResults")
    @js.native
    abstract class CredentialPickerResults ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerResults {
      
      /** Gets the opaque credential. */
      /* CompleteClass */
      var credential: IBuffer = js.native
      
      /** Gets the domain name portion of the unpacked credential. */
      /* CompleteClass */
      var credentialDomainName: String = js.native
      
      /** Gets the password portion of the unpacked credential. */
      /* CompleteClass */
      var credentialPassword: String = js.native
      
      /** Gets the state of the "Save Credentials" check box. */
      /* CompleteClass */
      var credentialSaveOption: CredentialSaveOption = js.native
      
      /** Gets the status of the credential save operation. */
      /* CompleteClass */
      var credentialSaved: Boolean = js.native
      
      /** Gets the user name of the unpacked credential. */
      /* CompleteClass */
      var credentialUserName: String = js.native
      
      /** Gets the value of the error code. */
      /* CompleteClass */
      var errorCode: Double = js.native
    }
    
    /** Identifies the state of the dialog box option on whether to save credentials. */
    @JSGlobal("Windows.Security.Credentials.UI.CredentialSaveOption")
    @js.native
    object CredentialSaveOption extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.Credentials.UI.CredentialSaveOption & Double] = js.native
      
      /* 2 */ val hidden: typings.winrtUwp.Windows.Security.Credentials.UI.CredentialSaveOption.hidden & Double = js.native
      
      /* 1 */ val selected: typings.winrtUwp.Windows.Security.Credentials.UI.CredentialSaveOption.selected & Double = js.native
      
      /* 0 */ val unselected: typings.winrtUwp.Windows.Security.Credentials.UI.CredentialSaveOption.unselected & Double = js.native
    }
    
    /** Describes the result of a biometric (fingerprint) verification operation. */
    @JSGlobal("Windows.Security.Credentials.UI.UserConsentVerificationResult")
    @js.native
    object UserConsentVerificationResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult & Double
          ] = js.native
      
      /* 6 */ val canceled: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.canceled & Double = js.native
      
      /* 4 */ val deviceBusy: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.deviceBusy & Double = js.native
      
      /* 1 */ val deviceNotPresent: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.deviceNotPresent & Double = js.native
      
      /* 3 */ val disabledByPolicy: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.disabledByPolicy & Double = js.native
      
      /* 2 */ val notConfiguredForUser: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.notConfiguredForUser & Double = js.native
      
      /* 5 */ val retriesExhausted: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.retriesExhausted & Double = js.native
      
      /* 0 */ val verified: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.verified & Double = js.native
    }
    
    /** Checks for availability of a biometric (fingerprint) verifier device and performs a biometric verification. */
    @JSGlobal("Windows.Security.Credentials.UI.UserConsentVerifier")
    @js.native
    abstract class UserConsentVerifier ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifier
    object UserConsentVerifier {
      
      @JSGlobal("Windows.Security.Credentials.UI.UserConsentVerifier")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Checks to see whether a biometric (fingerprint) verifier device is available.
        * @return A UserConsentVerifierAvailability value that describes the result of the availability check operation.
        */
      /* static member */
      @scala.inline
      def checkAvailabilityAsync(): IPromiseWithIAsyncOperation[UserConsentVerifierAvailability] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkAvailabilityAsync")().asInstanceOf[IPromiseWithIAsyncOperation[UserConsentVerifierAvailability]]
      
      /**
        * Performs a fingerprint (biometric) verification.
        * @param message A message to display to the user for this biometric verification request.
        * @return A UserConsentVerificationResult value that describes the result of the biometric verification.
        */
      /* static member */
      @scala.inline
      def requestVerificationAsync(message: String): IPromiseWithIAsyncOperation[UserConsentVerificationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestVerificationAsync")(message.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[UserConsentVerificationResult]]
    }
    
    /** Describes the result of a check for a biometric (fingerprint) verifier device. */
    @JSGlobal("Windows.Security.Credentials.UI.UserConsentVerifierAvailability")
    @js.native
    object UserConsentVerifierAvailability extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability & Double
          ] = js.native
      
      /* 0 */ val available: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability.available & Double = js.native
      
      /* 4 */ val deviceBusy: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability.deviceBusy & Double = js.native
      
      /* 1 */ val deviceNotPresent: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability.deviceNotPresent & Double = js.native
      
      /* 3 */ val disabledByPolicy: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability.disabledByPolicy & Double = js.native
      
      /* 2 */ val notConfiguredForUser: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability.notConfiguredForUser & Double = js.native
    }
  }
  
  /** Identifies an account from a web account provider. */
  @JSGlobal("Windows.Security.Credentials.WebAccount")
  @js.native
  class WebAccount protected ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Credentials.WebAccount {
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
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.Credentials.WebAccountPictureSize & Double] = js.native
    
    /* 3 */ val size1080x1080: typings.winrtUwp.Windows.Security.Credentials.WebAccountPictureSize.size1080x1080 & Double = js.native
    
    /* 1 */ val size208x208: typings.winrtUwp.Windows.Security.Credentials.WebAccountPictureSize.size208x208 & Double = js.native
    
    /* 2 */ val size424x424: typings.winrtUwp.Windows.Security.Credentials.WebAccountPictureSize.size424x424 & Double = js.native
    
    /* 0 */ val size64x64: typings.winrtUwp.Windows.Security.Credentials.WebAccountPictureSize.size64x64 & Double = js.native
  }
  
  /** Represents a web account authentication provider. */
  @JSGlobal("Windows.Security.Credentials.WebAccountProvider")
  @js.native
  class WebAccountProvider protected ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider {
    /**
      * Creates an instance of the WebAccountProvider class.
      * @param id The web account provider id.
      * @param displayName The display name for the web account provider.
      * @param iconUri The Uri of the icon image to display for the web account provider.
      */
    def this(id: String, displayName: String, iconUri: Uri) = this()
    
    /** Gets the authority of the web account provider. Use authority to disambiguate between a single provider with multiple identities (such as a Microsoft account versus Azure Active Directory). */
    /* CompleteClass */
    var authority: String = js.native
    
    /** Gets the display name for the web account provider. */
    /* CompleteClass */
    var displayName: String = js.native
    
    /** Gets the display purpose of the web account provider. */
    /* CompleteClass */
    var displayPurpose: String = js.native
    
    /** Gets the Uri of the icon image to display for the web account provider. */
    /* CompleteClass */
    var iconUri: Uri = js.native
    
    /** Gets the web account provider id. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Gets the user associated with the provider. */
    /* CompleteClass */
    var user: User = js.native
  }
  
  /** Describes the state of a WebAccount object. */
  @JSGlobal("Windows.Security.Credentials.WebAccountState")
  @js.native
  object WebAccountState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.Credentials.WebAccountState & Double] = js.native
    
    /* 1 */ val connected: typings.winrtUwp.Windows.Security.Credentials.WebAccountState.connected & Double = js.native
    
    /* 2 */ val error: typings.winrtUwp.Windows.Security.Credentials.WebAccountState.error & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Security.Credentials.WebAccountState.none & Double = js.native
  }
}
