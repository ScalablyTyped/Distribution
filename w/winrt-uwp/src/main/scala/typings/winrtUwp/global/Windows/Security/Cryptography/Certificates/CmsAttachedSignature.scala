package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
