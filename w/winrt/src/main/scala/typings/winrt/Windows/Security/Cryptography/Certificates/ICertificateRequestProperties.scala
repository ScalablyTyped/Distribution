package typings.winrt.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICertificateRequestProperties extends StObject {
  
  var exportable: ExportOption
  
  var friendlyName: String
  
  var hashAlgorithmName: String
  
  var keyAlgorithmName: String
  
  var keyProtectionLevel: KeyProtectionLevel
  
  var keySize: Double
  
  var keyStorageProviderName: String
  
  var keyUsages: EnrollKeyUsages
  
  var subject: String
}
object ICertificateRequestProperties {
  
  inline def apply(
    exportable: ExportOption,
    friendlyName: String,
    hashAlgorithmName: String,
    keyAlgorithmName: String,
    keyProtectionLevel: KeyProtectionLevel,
    keySize: Double,
    keyStorageProviderName: String,
    keyUsages: EnrollKeyUsages,
    subject: String
  ): ICertificateRequestProperties = {
    val __obj = js.Dynamic.literal(exportable = exportable.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], hashAlgorithmName = hashAlgorithmName.asInstanceOf[js.Any], keyAlgorithmName = keyAlgorithmName.asInstanceOf[js.Any], keyProtectionLevel = keyProtectionLevel.asInstanceOf[js.Any], keySize = keySize.asInstanceOf[js.Any], keyStorageProviderName = keyStorageProviderName.asInstanceOf[js.Any], keyUsages = keyUsages.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICertificateRequestProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICertificateRequestProperties] (val x: Self) extends AnyVal {
    
    inline def setExportable(value: ExportOption): Self = StObject.set(x, "exportable", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmName(value: String): Self = StObject.set(x, "hashAlgorithmName", value.asInstanceOf[js.Any])
    
    inline def setKeyAlgorithmName(value: String): Self = StObject.set(x, "keyAlgorithmName", value.asInstanceOf[js.Any])
    
    inline def setKeyProtectionLevel(value: KeyProtectionLevel): Self = StObject.set(x, "keyProtectionLevel", value.asInstanceOf[js.Any])
    
    inline def setKeySize(value: Double): Self = StObject.set(x, "keySize", value.asInstanceOf[js.Any])
    
    inline def setKeyStorageProviderName(value: String): Self = StObject.set(x, "keyStorageProviderName", value.asInstanceOf[js.Any])
    
    inline def setKeyUsages(value: EnrollKeyUsages): Self = StObject.set(x, "keyUsages", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
