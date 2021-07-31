package typings.winrt.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CryptographicPublicKeyBlobType extends StObject
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType")
@js.native
object CryptographicPublicKeyBlobType extends StObject {
  
  @js.native
  sealed trait bCryptPublicKey
    extends StObject
       with CryptographicPublicKeyBlobType
  
  @js.native
  sealed trait capi1PublicKey
    extends StObject
       with CryptographicPublicKeyBlobType
  
  @js.native
  sealed trait pkcs1RsaPublicKey
    extends StObject
       with CryptographicPublicKeyBlobType
  
  @js.native
  sealed trait x509SubjectPublicKeyInfo
    extends StObject
       with CryptographicPublicKeyBlobType
}
