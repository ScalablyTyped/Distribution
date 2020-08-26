package typings.winrtUwp.global.Windows.Security.Credentials

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult
import typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables you to use credentials without the complexity of the underlying operations, providing a uniform experience for credentials that reduces credential prompting to an absolute minimum. This namespace collects various types of credentials from users, stores them on the local computer, and presents them to web services and proxies by using existing authentication models. */
@JSGlobal("Windows.Security.Credentials.UI")
@js.native
object UI extends js.Object {
  /** Creates an asynchronous object that displays a dialog box of credentials to the user and collects the user's response. */
  @js.native
  abstract class CredentialPicker ()
    extends typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPicker
  
  /** Controls the appearance and behavior of a credential prompt. */
  @js.native
  /** Creates and initializes a new, empty instance of the CredentialPickerOptions object. */
  class CredentialPickerOptions ()
    extends typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerOptions
  
  /** Describes the results of the dialog box operation. */
  @js.native
  abstract class CredentialPickerResults ()
    extends typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerResults
  
  /** Checks for availability of a biometric (fingerprint) verifier device and performs a biometric verification. */
  @js.native
  abstract class UserConsentVerifier ()
    extends typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifier
  
  /** Identifies which authentication protocol to use. */
  @js.native
  object AuthenticationProtocol extends js.Object {
    /* 0 */ val basic: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.basic with Double = js.native
    /* 5 */ val credSsp: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.credSsp with Double = js.native
    /* 6 */ val custom: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.custom with Double = js.native
    /* 1 */ val digest: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.digest with Double = js.native
    /* 3 */ val kerberos: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.kerberos with Double = js.native
    /* 4 */ val negotiate: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.negotiate with Double = js.native
    /* 2 */ val ntlm: typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol.ntlm with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Credentials.UI.AuthenticationProtocol with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object CredentialPicker extends js.Object {
    /**
      * Displays a dialog box to the user and collects credentials from the user.
      * @param options The options on displaying and collecting the credential box.
      * @return The credential and options from the user.
      */
    def pickAsync(options: typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerOptions): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
    /**
      * Constructor used to initiate asynchronous prompting operations using two inputs.
      * @param targetName The target name to display.
      * @param message The message to display in the dialog box.
      * @return The credential and options from the user.
      */
    def pickAsync(targetName: String, message: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
    /**
      * Constructor used to initiate asynchronous prompting operations using three inputs.
      * @param targetName The target name to display.
      * @param message The message to display in the dialog box.
      * @param caption The caption to display in the dialog box.
      * @return The credential and options from the user.
      */
    def pickAsync(targetName: String, message: String, caption: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
  }
  
  /** Identifies the state of the dialog box option on whether to save credentials. */
  @js.native
  object CredentialSaveOption extends js.Object {
    /* 2 */ val hidden: typings.winrtUwp.Windows.Security.Credentials.UI.CredentialSaveOption.hidden with Double = js.native
    /* 1 */ val selected: typings.winrtUwp.Windows.Security.Credentials.UI.CredentialSaveOption.selected with Double = js.native
    /* 0 */ val unselected: typings.winrtUwp.Windows.Security.Credentials.UI.CredentialSaveOption.unselected with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Credentials.UI.CredentialSaveOption with Double
      ] = js.native
  }
  
  /** Describes the result of a biometric (fingerprint) verification operation. */
  @js.native
  object UserConsentVerificationResult extends js.Object {
    /* 6 */ val canceled: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.canceled with Double = js.native
    /* 4 */ val deviceBusy: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.deviceBusy with Double = js.native
    /* 1 */ val deviceNotPresent: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.deviceNotPresent with Double = js.native
    /* 3 */ val disabledByPolicy: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.disabledByPolicy with Double = js.native
    /* 2 */ val notConfiguredForUser: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.notConfiguredForUser with Double = js.native
    /* 5 */ val retriesExhausted: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.retriesExhausted with Double = js.native
    /* 0 */ val verified: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult.verified with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerificationResult with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object UserConsentVerifier extends js.Object {
    /**
      * Checks to see whether a biometric (fingerprint) verifier device is available.
      * @return A UserConsentVerifierAvailability value that describes the result of the availability check operation.
      */
    def checkAvailabilityAsync(): IPromiseWithIAsyncOperation[UserConsentVerifierAvailability] = js.native
    /**
      * Performs a fingerprint (biometric) verification.
      * @param message A message to display to the user for this biometric verification request.
      * @return A UserConsentVerificationResult value that describes the result of the biometric verification.
      */
    def requestVerificationAsync(message: String): IPromiseWithIAsyncOperation[UserConsentVerificationResult] = js.native
  }
  
  /** Describes the result of a check for a biometric (fingerprint) verifier device. */
  @js.native
  object UserConsentVerifierAvailability extends js.Object {
    /* 0 */ val available: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability.available with Double = js.native
    /* 4 */ val deviceBusy: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability.deviceBusy with Double = js.native
    /* 1 */ val deviceNotPresent: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability.deviceNotPresent with Double = js.native
    /* 3 */ val disabledByPolicy: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability.disabledByPolicy with Double = js.native
    /* 2 */ val notConfiguredForUser: typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability.notConfiguredForUser with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Credentials.UI.UserConsentVerifierAvailability with Double
      ] = js.native
  }
  
}

