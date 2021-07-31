package typings.winrtUwp.Windows.Security.Credentials

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a key credential, an RSA, 2048-bit, asymmetric key that represents a user's identity for an application. */
@js.native
trait KeyCredential extends StObject {
  
  /**
    * Gets an attestation for a key credential. Call this method after provisioning a key credential for the current user and application.
    * @return When this method completes, it returns a key credential attestation result.
    */
  def getAttestationAsync(): IPromiseWithIAsyncOperation[KeyCredentialAttestationResult] = js.native
  
  /** Gets the name of the key credential. */
  var name: String = js.native
  
  /**
    * Prompts the user to cryptographcally sign data using their key credential.
    * @param data The data to cryptographically sign.
    * @return When this method completes, it returns a key credential operation result.
    */
  def requestSignAsync(data: IBuffer): IPromiseWithIAsyncOperation[KeyCredentialOperationResult] = js.native
  
  /**
    * Gets the public portion of the asymmetric KeyCredential .
    * @return The public portion of the asymmetric key credential.
    */
  def retrievePublicKey(): IBuffer = js.native
  /**
    * Gets the public portion of the asymmetric KeyCredential .
    * @param blobType The blob type of the public key to retrieve.
    * @return The public portion of the asymmetric key credential.
    */
  def retrievePublicKey(blobType: CryptographicPublicKeyBlobType): IBuffer = js.native
}
