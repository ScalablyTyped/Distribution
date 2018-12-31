package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a signature attached to a signed CMS message. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CmsAttachedSignature")
@js.native
class CmsAttachedSignature protected () extends js.Object {
  /**
    * Creates a new instance of the CmsAttachedSignature class for the specified signed CMS message.
    * @param inputBlob A signed CMS message blob.
    */
  def this(inputBlob: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer) = this()
  /** Gets the list of certificates that are used for chain building for the signer certificate. */
  var certificates: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[Certificate] = js.native
  /** Gets the content of the signed CMS message. */
  var content: scala.Double = js.native
  /** Gets the list of signers that are used for creating or verifying the signature. */
  var signers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[CmsSignerInfo] = js.native
  /**
    * Verifies the signature contained in the signed CMS message.
    * @return The result of the signature verification operation.
    */
  def verifySignature(): SignatureValidationResult = js.native
}

/** Represents a signature attached to a signed CMS message. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CmsAttachedSignature")
@js.native
object CmsAttachedSignature extends js.Object {
  /**
    * Signs the specified input data using the specified signer information and creates an attached signed CMS message.
    * @param data The input data to be signed.
    * @param signers The signer information used to compute the signature.
    * @param certificates The list of certificates to build the chain for the signer certificates.
    * @return An asynchronous operation to retrieve the attached signed CMS message.
    */
  def generateSignatureAsync(
    data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    signers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CmsSignerInfo],
    certificates: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.Certificate]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer] = js.native
}

