package typings.winrtDashUwp.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.bcryptEccFullPrivateKey
import typings.winrtDashUwp.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.bcryptPrivateKey
import typings.winrtDashUwp.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.capi1PrivateKey
import typings.winrtDashUwp.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.pkcs1RsaPrivateKey
import typings.winrtDashUwp.Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType.pkcs8RawPrivateKeyInfo
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptographicPrivateKeyBlobType with Double] = js.native
  /* 4 */ @js.native
  object bcryptEccFullPrivateKey extends TopLevel[bcryptEccFullPrivateKey with Double]
  
  /* 2 */ @js.native
  object bcryptPrivateKey extends TopLevel[bcryptPrivateKey with Double]
  
  /* 3 */ @js.native
  object capi1PrivateKey extends TopLevel[capi1PrivateKey with Double]
  
  /* 1 */ @js.native
  object pkcs1RsaPrivateKey extends TopLevel[pkcs1RsaPrivateKey with Double]
  
  /* 0 */ @js.native
  object pkcs8RawPrivateKeyInfo extends TopLevel[pkcs8RawPrivateKeyInfo with Double]
  
}

