package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CryptographicPublicKeyBlobType extends js.Object

/** Specifies the type of the public key contained in a buffer. */
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType")
@js.native
object CryptographicPublicKeyBlobType extends js.Object {
  @js.native
  sealed trait bcryptEccFullPublicKey
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType
  
  /** Microsoft public key format defined by Cryptography API: Next Generation (CNG). For examples, see the following CNG structures: */
  @js.native
  sealed trait bcryptPublicKey
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType
  
  /** Microsoft public key format defined by the legacy Cryptography API (CAPI). For more information, see Base Provider Key BLOBs. */
  @js.native
  sealed trait capi1PublicKey
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType
  
  /** The key is an RSA public key defined in the PKCS #1 standard. For more information, see the RSA Cryptography Specification in RFC 3347. */
  @js.native
  sealed trait pkcs1RsaPublicKey
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType
  
  /** This is the default value. The public key is encoded as an ASN.1 SubjectPublicKeyInfo type defined in RFC 5280 and RFC 3280. */
  @js.native
  sealed trait x509SubjectPublicKeyInfo
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType
  
  val bcryptEccFullPublicKey: bcryptEccFullPublicKey with java.lang.String = js.native
  val bcryptPublicKey: bcryptPublicKey with java.lang.String = js.native
  val capi1PublicKey: capi1PublicKey with java.lang.String = js.native
  val pkcs1RsaPublicKey: pkcs1RsaPublicKey with java.lang.String = js.native
  val x509SubjectPublicKeyInfo: x509SubjectPublicKeyInfo with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType with java.lang.String
  ] = js.native
}

