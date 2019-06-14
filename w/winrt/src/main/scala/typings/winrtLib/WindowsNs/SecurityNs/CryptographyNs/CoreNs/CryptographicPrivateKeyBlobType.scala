package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CryptographicPrivateKeyBlobType extends js.Object

@JSGlobal("Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType")
@js.native
object CryptographicPrivateKeyBlobType extends js.Object {
  @js.native
  sealed trait bCryptPrivateKey
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType
  
  @js.native
  sealed trait capi1PrivateKey
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType
  
  @js.native
  sealed trait pkcs1RsaPrivateKey
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType
  
  @js.native
  sealed trait pkcs8RawPrivateKeyInfo
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType
  
  /* 2 */ val bCryptPrivateKey: bCryptPrivateKey with scala.Double = js.native
  /* 3 */ val capi1PrivateKey: capi1PrivateKey with scala.Double = js.native
  /* 1 */ val pkcs1RsaPrivateKey: pkcs1RsaPrivateKey with scala.Double = js.native
  /* 0 */ val pkcs8RawPrivateKeyInfo: pkcs8RawPrivateKeyInfo with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType with scala.Double
  ] = js.native
}

