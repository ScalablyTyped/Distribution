package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CryptographicPublicKeyBlobType extends js.Object

@JSGlobal("Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType")
@js.native
object CryptographicPublicKeyBlobType extends js.Object {
  @js.native
  sealed trait bCryptPublicKey
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType
  
  @js.native
  sealed trait capi1PublicKey
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType
  
  @js.native
  sealed trait pkcs1RsaPublicKey
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType
  
  @js.native
  sealed trait x509SubjectPublicKeyInfo
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType
  
  val bCryptPublicKey: bCryptPublicKey with java.lang.String = js.native
  val capi1PublicKey: capi1PublicKey with java.lang.String = js.native
  val pkcs1RsaPublicKey: pkcs1RsaPublicKey with java.lang.String = js.native
  val x509SubjectPublicKeyInfo: x509SubjectPublicKeyInfo with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType with java.lang.String
  ] = js.native
}

