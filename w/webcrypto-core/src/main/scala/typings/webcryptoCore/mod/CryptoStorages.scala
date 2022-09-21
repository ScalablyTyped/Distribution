package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoStorages extends StObject {
  
  var certStorage: CryptoCertificateStorage
  
  var keyStorage: CryptoKeyStorage
}
object CryptoStorages {
  
  inline def apply(certStorage: CryptoCertificateStorage, keyStorage: CryptoKeyStorage): CryptoStorages = {
    val __obj = js.Dynamic.literal(certStorage = certStorage.asInstanceOf[js.Any], keyStorage = keyStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoStorages]
  }
  
  extension [Self <: CryptoStorages](x: Self) {
    
    inline def setCertStorage(value: CryptoCertificateStorage): Self = StObject.set(x, "certStorage", value.asInstanceOf[js.Any])
    
    inline def setKeyStorage(value: CryptoKeyStorage): Self = StObject.set(x, "keyStorage", value.asInstanceOf[js.Any])
  }
}
