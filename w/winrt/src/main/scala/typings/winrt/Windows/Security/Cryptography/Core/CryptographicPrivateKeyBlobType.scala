package typings.winrt.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptographicPrivateKeyBlobType with Double] = js.native
  /* 2 */ @js.native
  object bCryptPrivateKey extends TopLevel[bCryptPrivateKey with Double]
  
  /* 3 */ @js.native
  object capi1PrivateKey extends TopLevel[capi1PrivateKey with Double]
  
  /* 1 */ @js.native
  object pkcs1RsaPrivateKey extends TopLevel[pkcs1RsaPrivateKey with Double]
  
  /* 0 */ @js.native
  object pkcs8RawPrivateKeyInfo extends TopLevel[pkcs8RawPrivateKeyInfo with Double]
  
}

