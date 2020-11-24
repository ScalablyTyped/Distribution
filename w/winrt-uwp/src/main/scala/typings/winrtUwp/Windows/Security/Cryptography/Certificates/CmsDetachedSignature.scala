package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a detached signature for a signed CMS message. */
@js.native
trait CmsDetachedSignature extends js.Object {
  
  /** Gets the list of certificates that are used for chain building for the signer certificate. */
  var certificates: IVectorView[Certificate] = js.native
  
  /** Gets the list of signers that are used for creating or verifying the signature. */
  var signers: IVectorView[CmsSignerInfo] = js.native
  
  /**
    * Verifies a signed CMS message against the original streaming input.
    * @param data The original input stream for the signed CMS message.
    * @return An asynchronous operation to retrieve the result of the signature validation operation.
    */
  def verifySignatureAsync(data: IInputStream): IPromiseWithIAsyncOperation[SignatureValidationResult] = js.native
}
object CmsDetachedSignature {
  
  @scala.inline
  def apply(
    certificates: IVectorView[Certificate],
    signers: IVectorView[CmsSignerInfo],
    verifySignatureAsync: IInputStream => IPromiseWithIAsyncOperation[SignatureValidationResult]
  ): CmsDetachedSignature = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], signers = signers.asInstanceOf[js.Any], verifySignatureAsync = js.Any.fromFunction1(verifySignatureAsync))
    __obj.asInstanceOf[CmsDetachedSignature]
  }
  
  @scala.inline
  implicit class CmsDetachedSignatureOps[Self <: CmsDetachedSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertificates(value: IVectorView[Certificate]): Self = this.set("certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigners(value: IVectorView[CmsSignerInfo]): Self = this.set("signers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifySignatureAsync(value: IInputStream => IPromiseWithIAsyncOperation[SignatureValidationResult]): Self = this.set("verifySignatureAsync", js.Any.fromFunction1(value))
  }
}
