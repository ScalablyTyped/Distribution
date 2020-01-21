package typings.winrtUwp.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptographicPublicKeyBlobType with Double] = js.native
  /* 4 */ @js.native
  object bcryptEccFullPublicKey extends TopLevel[bcryptEccFullPublicKey with Double]
  
  /* 2 */ @js.native
  object bcryptPublicKey extends TopLevel[bcryptPublicKey with Double]
  
  /* 3 */ @js.native
  object capi1PublicKey extends TopLevel[capi1PublicKey with Double]
  
  /* 1 */ @js.native
  object pkcs1RsaPublicKey extends TopLevel[pkcs1RsaPublicKey with Double]
  
  /* 0 */ @js.native
  object x509SubjectPublicKeyInfo extends TopLevel[x509SubjectPublicKeyInfo with Double]
  
}

