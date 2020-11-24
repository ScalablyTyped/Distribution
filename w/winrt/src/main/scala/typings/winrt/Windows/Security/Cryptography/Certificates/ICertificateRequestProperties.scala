package typings.winrt.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICertificateRequestProperties extends js.Object {
  
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
  implicit class ICertificateRequestPropertiesOps[Self <: ICertificateRequestProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExportable(value: ExportOption): Self = this.set("exportable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlgorithmName(value: String): Self = this.set("hashAlgorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAlgorithmName(value: String): Self = this.set("keyAlgorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyProtectionLevel(value: KeyProtectionLevel): Self = this.set("keyProtectionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySize(value: Double): Self = this.set("keySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyStorageProviderName(value: String): Self = this.set("keyStorageProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUsages(value: EnrollKeyUsages): Self = this.set("keyUsages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
  }
}
