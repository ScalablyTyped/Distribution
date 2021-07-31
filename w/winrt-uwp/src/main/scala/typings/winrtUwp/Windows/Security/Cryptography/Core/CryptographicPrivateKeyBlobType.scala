package typings.winrtUwp.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CryptographicPrivateKeyBlobType extends StObject
/** Specifies the type of the private key contained in a buffer. */
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType")
@js.native
object CryptographicPrivateKeyBlobType extends StObject {
  
  @js.native
  sealed trait bcryptEccFullPrivateKey
    extends StObject
       with CryptographicPrivateKeyBlobType
  
  /** Microsoft private key format defined by Cryptography API: Next Generation (CNG). For examples, see the following CNG structures: */
  @js.native
  sealed trait bcryptPrivateKey
    extends StObject
       with CryptographicPrivateKeyBlobType
  
  /** Microsoft private key format defined by the legacy Cryptography API (CAPI). For more information, see Base Provider Key BLOBs. */
  @js.native
  sealed trait capi1PrivateKey
    extends StObject
       with CryptographicPrivateKeyBlobType
  
  /** The key is an RSA private key defined in the PKCS #1 standard. For more information, see the RSA Cryptography Specification in RFC 3347. */
  @js.native
  sealed trait pkcs1RsaPrivateKey
    extends StObject
       with CryptographicPrivateKeyBlobType
  
  /** This is the default value. The private key is encoded as an ASN.1 PrivateKeyInfo type defined in the PKCS#8 standard. The private key information syntax is defined as follows in RFC 5208. */
  @js.native
  sealed trait pkcs8RawPrivateKeyInfo
    extends StObject
       with CryptographicPrivateKeyBlobType
}
