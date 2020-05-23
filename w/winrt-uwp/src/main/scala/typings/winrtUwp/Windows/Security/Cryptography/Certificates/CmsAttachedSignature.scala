package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a signature attached to a signed CMS message. */
trait CmsAttachedSignature extends js.Object {
  /** Gets the list of certificates that are used for chain building for the signer certificate. */
  var certificates: IVectorView[Certificate]
  /** Gets the content of the signed CMS message. */
  var content: Double
  /** Gets the list of signers that are used for creating or verifying the signature. */
  var signers: IVectorView[CmsSignerInfo]
  /**
    * Verifies the signature contained in the signed CMS message.
    * @return The result of the signature verification operation.
    */
  def verifySignature(): SignatureValidationResult
}

object CmsAttachedSignature {
  @scala.inline
  def apply(
    certificates: IVectorView[Certificate],
    content: Double,
    signers: IVectorView[CmsSignerInfo],
    verifySignature: () => SignatureValidationResult
  ): CmsAttachedSignature = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], signers = signers.asInstanceOf[js.Any], verifySignature = js.Any.fromFunction0(verifySignature))
    __obj.asInstanceOf[CmsAttachedSignature]
  }
}

