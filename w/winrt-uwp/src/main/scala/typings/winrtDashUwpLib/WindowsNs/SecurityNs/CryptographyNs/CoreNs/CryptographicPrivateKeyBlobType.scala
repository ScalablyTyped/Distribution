package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CryptographicPrivateKeyBlobType extends js.Object

/** Specifies the type of the private key contained in a buffer. */
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType")
@js.native
object CryptographicPrivateKeyBlobType extends js.Object {
  @js.native
  sealed trait bcryptEccFullPrivateKey
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType
  
  /** Microsoft private key format defined by Cryptography API: Next Generation (CNG). For examples, see the following CNG structures: */
  @js.native
  sealed trait bcryptPrivateKey
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType
  
  /** Microsoft private key format defined by the legacy Cryptography API (CAPI). For more information, see Base Provider Key BLOBs. */
  @js.native
  sealed trait capi1PrivateKey
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType
  
  /** The key is an RSA private key defined in the PKCS #1 standard. For more information, see the RSA Cryptography Specification in RFC 3347. */
  @js.native
  sealed trait pkcs1RsaPrivateKey
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType
  
  /** This is the default value. The private key is encoded as an ASN.1 PrivateKeyInfo type defined in the PKCS#8 standard. The private key information syntax is defined as follows in RFC 5208. */
  @js.native
  sealed trait pkcs8RawPrivateKeyInfo
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType
  
  /* 4 */ val bcryptEccFullPrivateKey: bcryptEccFullPrivateKey with scala.Double = js.native
  /* 2 */ val bcryptPrivateKey: bcryptPrivateKey with scala.Double = js.native
  /* 3 */ val capi1PrivateKey: capi1PrivateKey with scala.Double = js.native
  /* 1 */ val pkcs1RsaPrivateKey: pkcs1RsaPrivateKey with scala.Double = js.native
  /* 0 */ val pkcs8RawPrivateKeyInfo: pkcs8RawPrivateKeyInfo with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType with scala.Double
  ] = js.native
}

