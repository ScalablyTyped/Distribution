package typings.winrt.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CryptographicPrivateKeyBlobType extends StObject
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType")
@js.native
object CryptographicPrivateKeyBlobType extends StObject {
  
  @js.native
  sealed trait bCryptPrivateKey
    extends StObject
       with CryptographicPrivateKeyBlobType
  
  @js.native
  sealed trait capi1PrivateKey
    extends StObject
       with CryptographicPrivateKeyBlobType
  
  @js.native
  sealed trait pkcs1RsaPrivateKey
    extends StObject
       with CryptographicPrivateKeyBlobType
  
  @js.native
  sealed trait pkcs8RawPrivateKeyInfo
    extends StObject
       with CryptographicPrivateKeyBlobType
}
