package typings.winrtDashUwp.Windows.Security.Cryptography.Core

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
  sealed trait bcryptEccFullPublicKey extends CryptographicPublicKeyBlobType
  
  /** Microsoft public key format defined by Cryptography API: Next Generation (CNG). For examples, see the following CNG structures: */
  @js.native
  sealed trait bcryptPublicKey extends CryptographicPublicKeyBlobType
  
  /** Microsoft public key format defined by the legacy Cryptography API (CAPI). For more information, see Base Provider Key BLOBs. */
  @js.native
  sealed trait capi1PublicKey extends CryptographicPublicKeyBlobType
  
  /** The key is an RSA public key defined in the PKCS #1 standard. For more information, see the RSA Cryptography Specification in RFC 3347. */
  @js.native
  sealed trait pkcs1RsaPublicKey extends CryptographicPublicKeyBlobType
  
  /** This is the default value. The public key is encoded as an ASN.1 SubjectPublicKeyInfo type defined in RFC 5280 and RFC 3280. */
  @js.native
  sealed trait x509SubjectPublicKeyInfo extends CryptographicPublicKeyBlobType
  
  /* 4 */ val bcryptEccFullPublicKey: typings.winrtDashUwp.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.bcryptEccFullPublicKey with Double = js.native
  /* 2 */ val bcryptPublicKey: typings.winrtDashUwp.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.bcryptPublicKey with Double = js.native
  /* 3 */ val capi1PublicKey: typings.winrtDashUwp.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.capi1PublicKey with Double = js.native
  /* 1 */ val pkcs1RsaPublicKey: typings.winrtDashUwp.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.pkcs1RsaPublicKey with Double = js.native
  /* 0 */ val x509SubjectPublicKeyInfo: typings.winrtDashUwp.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.x509SubjectPublicKeyInfo with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptographicPublicKeyBlobType with Double] = js.native
}

