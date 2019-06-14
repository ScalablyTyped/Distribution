package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SignatureValidationResult extends js.Object

/** Describes the result of a signature verification operation. */
@JSGlobal("Windows.Security.Cryptography.Certificates.SignatureValidationResult")
@js.native
object SignatureValidationResult extends js.Object {
  /** A severe error occurred such as missing key provider information or an incorrect algorithm id. */
  @js.native
  sealed trait badMessage
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.SignatureValidationResult
  
  /** An invalid argument was encountered while verifying the signature. */
  @js.native
  sealed trait invalidParameter
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.SignatureValidationResult
  
  /** The signature was not verified. */
  @js.native
  sealed trait invalidSignature
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.SignatureValidationResult
  
  /** Additional errors were encountered. */
  @js.native
  sealed trait otherErrors
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.SignatureValidationResult
  
  /** The signature was verified. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.SignatureValidationResult
  
  /* 2 */ val badMessage: badMessage with scala.Double = js.native
  /* 1 */ val invalidParameter: invalidParameter with scala.Double = js.native
  /* 3 */ val invalidSignature: invalidSignature with scala.Double = js.native
  /* 4 */ val otherErrors: otherErrors with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.SignatureValidationResult with scala.Double
  ] = js.native
}

