package typings.winrtDashUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnrollKeyUsages extends js.Object

/** Specifies the cryptographic operations that can be performed by the private key. This enumeration type is used in the KeyUsages property of a CertificateRequestProperties object. */
@JSGlobal("Windows.Security.Cryptography.Certificates.EnrollKeyUsages")
@js.native
object EnrollKeyUsages extends js.Object {
  /** The key can be used for decryption, signing. and key agreement. */
  @js.native
  sealed trait all extends EnrollKeyUsages
  
  /** The key can be used for decryption. */
  @js.native
  sealed trait decryption extends EnrollKeyUsages
  
  /** The key can be used for secret agreement encryption. */
  @js.native
  sealed trait keyAgreement extends EnrollKeyUsages
  
  /** No usage is specified for the key. */
  @js.native
  sealed trait none extends EnrollKeyUsages
  
  /** The key can be used for signing. */
  @js.native
  sealed trait signing extends EnrollKeyUsages
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnrollKeyUsages with Double] = js.native
  /* 4 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 1 */ @js.native
  object decryption extends TopLevel[decryption with Double]
  
  /* 3 */ @js.native
  object keyAgreement extends TopLevel[keyAgreement with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object signing extends TopLevel[signing with Double]
  
}

