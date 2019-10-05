package typings.winrtDashUwp.Windows.Security.Credentials.UI

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Checks for availability of a biometric (fingerprint) verifier device and performs a biometric verification. */
@JSGlobal("Windows.Security.Credentials.UI.UserConsentVerifier")
@js.native
abstract class UserConsentVerifier () extends js.Object

/* static members */
@JSGlobal("Windows.Security.Credentials.UI.UserConsentVerifier")
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

