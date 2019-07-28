package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CryptographicPrivateKeyBlobType extends js.Object

@JSGlobal("Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType")
@js.native
object CryptographicPrivateKeyBlobType extends js.Object {
  @js.native
  sealed trait bCryptPrivateKey extends CryptographicPrivateKeyBlobType
  
  @js.native
  sealed trait capi1PrivateKey extends CryptographicPrivateKeyBlobType
  
  @js.native
  sealed trait pkcs1RsaPrivateKey extends CryptographicPrivateKeyBlobType
  
  @js.native
  sealed trait pkcs8RawPrivateKeyInfo extends CryptographicPrivateKeyBlobType
  
  /* 2 */ val bCryptPrivateKey: typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType.bCryptPrivateKey with Double = js.native
  /* 3 */ val capi1PrivateKey: typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType.capi1PrivateKey with Double = js.native
  /* 1 */ val pkcs1RsaPrivateKey: typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType.pkcs1RsaPrivateKey with Double = js.native
  /* 0 */ val pkcs8RawPrivateKeyInfo: typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType.pkcs8RawPrivateKeyInfo with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptographicPrivateKeyBlobType with Double] = js.native
}

