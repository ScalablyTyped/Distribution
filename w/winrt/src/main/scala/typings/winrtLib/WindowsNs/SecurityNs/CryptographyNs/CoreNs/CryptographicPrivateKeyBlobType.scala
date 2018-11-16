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
  
  val bCryptPrivateKey: bCryptPrivateKey with java.lang.String = js.native
  val capi1PrivateKey: capi1PrivateKey with java.lang.String = js.native
  val pkcs1RsaPrivateKey: pkcs1RsaPrivateKey with java.lang.String = js.native
  val pkcs8RawPrivateKeyInfo: pkcs8RawPrivateKeyInfo with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPrivateKeyBlobType with java.lang.String
  ] = js.native
}

