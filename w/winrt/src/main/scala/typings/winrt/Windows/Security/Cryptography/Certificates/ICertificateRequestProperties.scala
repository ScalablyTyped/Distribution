package typings.winrt.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICertificateRequestProperties extends StObject {
  
  var exportable: ExportOption = js.native
  
  var friendlyName: String = js.native
  
  var hashAlgorithmName: String = js.native
  
  var keyAlgorithmName: String = js.native
  
  var keyProtectionLevel: KeyProtectionLevel = js.native
  
  var keySize: Double = js.native
  
  var keyStorageProviderName: String = js.native
  
  var keyUsages: EnrollKeyUsages = js.native
  
  var subject: String = js.native
}
object ICertificateRequestProperties {
  
  @scala.inline
  def apply(
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
  implicit class ICertificateRequestPropertiesMutableBuilder[Self <: ICertificateRequestProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportable(value: ExportOption): Self = StObject.set(x, "exportable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlgorithmName(value: String): Self = StObject.set(x, "hashAlgorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAlgorithmName(value: String): Self = StObject.set(x, "keyAlgorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyProtectionLevel(value: KeyProtectionLevel): Self = StObject.set(x, "keyProtectionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySize(value: Double): Self = StObject.set(x, "keySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyStorageProviderName(value: String): Self = StObject.set(x, "keyStorageProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUsages(value: EnrollKeyUsages): Self = StObject.set(x, "keyUsages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
