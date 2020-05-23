package typings.winrt.Windows.Security.Cryptography.Core

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
  
}

