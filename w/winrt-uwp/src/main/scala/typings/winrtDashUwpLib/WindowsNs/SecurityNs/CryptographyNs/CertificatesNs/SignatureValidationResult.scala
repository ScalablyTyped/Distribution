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
  
  val badMessage: badMessage with java.lang.String = js.native
  val invalidParameter: invalidParameter with java.lang.String = js.native
  val invalidSignature: invalidSignature with java.lang.String = js.native
  val otherErrors: otherErrors with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.SignatureValidationResult with java.lang.String
  ] = js.native
}

