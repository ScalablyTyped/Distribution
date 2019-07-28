package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs

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
  
  /* 2 */ val bCryptPublicKey: typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType.bCryptPublicKey with Double = js.native
  /* 3 */ val capi1PublicKey: typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType.capi1PublicKey with Double = js.native
  /* 1 */ val pkcs1RsaPublicKey: typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType.pkcs1RsaPublicKey with Double = js.native
  /* 0 */ val x509SubjectPublicKeyInfo: typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType.x509SubjectPublicKeyInfo with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptographicPublicKeyBlobType with Double] = js.native
}

