package typings.winrt.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.bCryptPublicKey
import typings.winrt.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.capi1PublicKey
import typings.winrt.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.pkcs1RsaPublicKey
import typings.winrt.Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType.x509SubjectPublicKeyInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CryptographicPublicKeyBlobType extends js.Object

@JSGlobal("Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType")
@js.native
object CryptographicPublicKeyBlobType extends js.Object {
  @js.native
  sealed trait bCryptPublicKey extends CryptographicPublicKeyBlobType
  
  @js.native
  sealed trait capi1PublicKey extends CryptographicPublicKeyBlobType
  
  @js.native
  sealed trait pkcs1RsaPublicKey extends CryptographicPublicKeyBlobType
  
  @js.native
  sealed trait x509SubjectPublicKeyInfo extends CryptographicPublicKeyBlobType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptographicPublicKeyBlobType with Double] = js.native
  /* 2 */ @js.native
  object bCryptPublicKey extends TopLevel[bCryptPublicKey with Double]
  
  /* 3 */ @js.native
  object capi1PublicKey extends TopLevel[capi1PublicKey with Double]
  
  /* 1 */ @js.native
  object pkcs1RsaPublicKey extends TopLevel[pkcs1RsaPublicKey with Double]
  
  /* 0 */ @js.native
  object x509SubjectPublicKeyInfo extends TopLevel[x509SubjectPublicKeyInfo with Double]
  
}

