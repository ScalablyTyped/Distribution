package typings.winrtUwp.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CryptographicPublicKeyBlobType extends StObject
/** Specifies the type of the public key contained in a buffer. */
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType")
@js.native
object CryptographicPublicKeyBlobType extends StObject {
  
  @js.native
  sealed trait bcryptEccFullPublicKey
    extends StObject
       with CryptographicPublicKeyBlobType
  
  /** Microsoft public key format defined by Cryptography API: Next Generation (CNG). For examples, see the following CNG structures: */
  @js.native
  sealed trait bcryptPublicKey
    extends StObject
       with CryptographicPublicKeyBlobType
  
  /** Microsoft public key format defined by the legacy Cryptography API (CAPI). For more information, see Base Provider Key BLOBs. */
  @js.native
  sealed trait capi1PublicKey
    extends StObject
       with CryptographicPublicKeyBlobType
  
  /** The key is an RSA public key defined in the PKCS #1 standard. For more information, see the RSA Cryptography Specification in RFC 3347. */
  @js.native
  sealed trait pkcs1RsaPublicKey
    extends StObject
       with CryptographicPublicKeyBlobType
  
  /** This is the default value. The public key is encoded as an ASN.1 SubjectPublicKeyInfo type defined in RFC 5280 and RFC 3280. */
  @js.native
  sealed trait x509SubjectPublicKeyInfo
    extends StObject
       with CryptographicPublicKeyBlobType
}
