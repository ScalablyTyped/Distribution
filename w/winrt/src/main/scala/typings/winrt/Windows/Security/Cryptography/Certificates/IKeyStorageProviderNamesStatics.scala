package typings.winrt.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyStorageProviderNamesStatics extends StObject {
  
  var platformKeyStorageProvider: String
  
  var smartcardKeyStorageProvider: String
  
  var softwareKeyStorageProvider: String
}
object IKeyStorageProviderNamesStatics {
  
  inline def apply(
    platformKeyStorageProvider: String,
    smartcardKeyStorageProvider: String,
    softwareKeyStorageProvider: String
  ): IKeyStorageProviderNamesStatics = {
    val __obj = js.Dynamic.literal(platformKeyStorageProvider = platformKeyStorageProvider.asInstanceOf[js.Any], smartcardKeyStorageProvider = smartcardKeyStorageProvider.asInstanceOf[js.Any], softwareKeyStorageProvider = softwareKeyStorageProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyStorageProviderNamesStatics]
  }
  
  extension [Self <: IKeyStorageProviderNamesStatics](x: Self) {
    
    inline def setPlatformKeyStorageProvider(value: String): Self = StObject.set(x, "platformKeyStorageProvider", value.asInstanceOf[js.Any])
    
    inline def setSmartcardKeyStorageProvider(value: String): Self = StObject.set(x, "smartcardKeyStorageProvider", value.asInstanceOf[js.Any])
    
    inline def setSoftwareKeyStorageProvider(value: String): Self = StObject.set(x, "softwareKeyStorageProvider", value.asInstanceOf[js.Any])
  }
}
