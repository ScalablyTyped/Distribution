package typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CoreNs

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
  sealed trait bcryptEccFullPrivateKey extends CryptographicPrivateKeyBlobType
  
  /** Microsoft private key format defined by Cryptography API: Next Generation (CNG). For examples, see the following CNG structures: */
  @js.native
  sealed trait bcryptPrivateKey extends CryptographicPrivateKeyBlobType
  
  /** Microsoft private key format defined by the legacy Cryptography API (CAPI). For more information, see Base Provider Key BLOBs. */
  @js.native
  sealed trait capi1PrivateKey extends CryptographicPrivateKeyBlobType
  
  /** The key is an RSA private key defined in the PKCS #1 standard. For more information, see the RSA Cryptography Specification in RFC 3347. */
  @js.native
  sealed trait pkcs1RsaPrivateKey extends CryptographicPrivateKeyBlobType
  
  /** This is the default value. The private key is encoded as an ASN.1 PrivateKeyInfo type defined in the PKCS#8 standard. The private key information syntax is defined as follows in RFC 5208. */
  @js.native
  sealed trait pkcs8RawPrivateKeyInfo extends CryptographicPrivateKeyBlobType
  
  /* 4 */ val bcryptEccFullPrivateKey: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType.bcryptEccFullPrivateKey with Double = js.native
  /* 2 */ val bcryptPrivateKey: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType.bcryptPrivateKey with Double = js.native
  /* 3 */ val capi1PrivateKey: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType.capi1PrivateKey with Double = js.native
  /* 1 */ val pkcs1RsaPrivateKey: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType.pkcs1RsaPrivateKey with Double = js.native
  /* 0 */ val pkcs8RawPrivateKeyInfo: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType.pkcs8RawPrivateKeyInfo with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptographicPrivateKeyBlobType with Double] = js.native
}

