package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the result of a certificate chain verification operation. */
@JSGlobal("Windows.Security.Cryptography.Certificates.ChainValidationResult")
@js.native
object ChainValidationResult extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult with Double
  ] = js.native
  
  /* 9 */ val basicConstraintsError: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.basicConstraintsError with Double = js.native
  
  /* 3 */ val expired: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.expired with Double = js.native
  
  /* 4 */ val incompleteChain: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.incompleteChain with Double = js.native
  
  /* 8 */ val invalidCertificateAuthorityPolicy: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.invalidCertificateAuthorityPolicy with Double = js.native
  
  /* 7 */ val invalidName: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.invalidName with Double = js.native
  
  /* 5 */ val invalidSignature: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.invalidSignature with Double = js.native
  
  /* 13 */ val otherErrors: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.otherErrors with Double = js.native
  
  /* 12 */ val revocationFailure: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.revocationFailure with Double = js.native
  
  /* 11 */ val revocationInformationMissing: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.revocationInformationMissing with Double = js.native
  
  /* 2 */ val revoked: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.revoked with Double = js.native
  
  /* 0 */ val success: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.success with Double = js.native
  
  /* 10 */ val unknownCriticalExtension: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.unknownCriticalExtension with Double = js.native
  
  /* 1 */ val untrusted: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.untrusted with Double = js.native
  
  /* 6 */ val wrongUsage: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.wrongUsage with Double = js.native
}
