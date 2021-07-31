package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnrollKeyUsages extends StObject
/** Specifies the cryptographic operations that can be performed by the private key. This enumeration type is used in the KeyUsages property of a CertificateRequestProperties object. */
@JSGlobal("Windows.Security.Cryptography.Certificates.EnrollKeyUsages")
@js.native
object EnrollKeyUsages extends StObject {
  
  /** The key can be used for decryption, signing. and key agreement. */
  @js.native
  sealed trait all
    extends StObject
       with EnrollKeyUsages
  
  /** The key can be used for decryption. */
  @js.native
  sealed trait decryption
    extends StObject
       with EnrollKeyUsages
  
  /** The key can be used for secret agreement encryption. */
  @js.native
  sealed trait keyAgreement
    extends StObject
       with EnrollKeyUsages
  
  /** No usage is specified for the key. */
  @js.native
  sealed trait none
    extends StObject
       with EnrollKeyUsages
  
  /** The key can be used for signing. */
  @js.native
  sealed trait signing
    extends StObject
       with EnrollKeyUsages
}
