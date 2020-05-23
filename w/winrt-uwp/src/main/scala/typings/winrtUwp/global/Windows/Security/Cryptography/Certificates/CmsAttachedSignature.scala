package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a signature attached to a signed CMS message. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CmsAttachedSignature")
@js.native
class CmsAttachedSignature protected ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsAttachedSignature {
  /**
    * Creates a new instance of the CmsAttachedSignature class for the specified signed CMS message.
    * @param inputBlob A signed CMS message blob.
    */
  def this(inputBlob: IBuffer) = this()
  /** Gets the list of certificates that are used for chain building for the signer certificate. */
  /* CompleteClass */
  override var certificates: IVectorView[typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate] = js.native
  /** Gets the content of the signed CMS message. */
  /* CompleteClass */
  override var content: Double = js.native
  /** Gets the list of signers that are used for creating or verifying the signature. */
  /* CompleteClass */
  override var signers: IVectorView[typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsSignerInfo] = js.native
  /**
    * Verifies the signature contained in the signed CMS message.
    * @return The result of the signature verification operation.
    */
  /* CompleteClass */
  override def verifySignature(): typings.winrtUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult = js.native
}

/* static members */
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
    data: IBuffer,
    signers: IIterable[typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsSignerInfo],
    certificates: IIterable[typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate]
  ): IPromiseWithIAsyncOperation[IBuffer] = js.native
}

