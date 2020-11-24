package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the properties of a certificate request. */
@js.native
trait CertificateRequestProperties extends js.Object {
  
  /** Gets or sets the CA exchange certificate that is used to encrypt a key attestation certificate request. */
  var attestationCredentialCertificate: Certificate = js.native
  
  /** Gets or sets the container name. */
  var containerName: String = js.native
  
  /** Gets or sets the prefix of the container name. */
  var containerNamePrefix: String = js.native
  
  /** Gets or sets the name of the elliptic curve. */
  var curveName: String = js.native
  
  /** Gets or sets the parameters of the elliptic curve. */
  var curveParameters: Double = js.native
  
  /** Gets or sets a value that specifies whether the private key created for the request can be exported. */
  var exportable: ExportOption = js.native
  
  /** Gets or sets the display name of the enrolled certificate. */
  var friendlyName: String = js.native
  
  /** Gets or sets the hash algorithm used when creating the certificate request signature. */
  var hashAlgorithmName: String = js.native
  
  /** Gets or sets the public key algorithm. */
  var keyAlgorithmName: String = js.native
  
  /** Gets or sets the level of strong key protection. */
  var keyProtectionLevel: KeyProtectionLevel = js.native
  
  /** Gets or sets the size, in bits, of the private key to be generated. */
  var keySize: Double = js.native
  
  /** Gets or sets the name of the key storage provider (KSP) that will be used to generate the private key. */
  var keyStorageProviderName: String = js.native
  
  /** Gets or sets the operation that can be performed by the private key created for this certificate request. The default value is Signing. */
  var keyUsages: EnrollKeyUsages = js.native
  
  /** Gets or sets the certificate used to sign the certificate request. */
  var signingCertificate: Certificate = js.native
  
  /** Gets or sets the name of the smart card reader used to create the certificate request. */
  var smartcardReaderName: String = js.native
  
  /** Gets or sets the subject name. */
  var subject: String = js.native
  
  /** Gets or sets whether to use the existing key. */
  var useExistingKey: Boolean = js.native
}
object CertificateRequestProperties {
  
  @scala.inline
  def apply(
    attestationCredentialCertificate: Certificate,
    containerName: String,
    containerNamePrefix: String,
    curveName: String,
    curveParameters: Double,
    exportable: ExportOption,
    friendlyName: String,
    hashAlgorithmName: String,
    keyAlgorithmName: String,
    keyProtectionLevel: KeyProtectionLevel,
    keySize: Double,
    keyStorageProviderName: String,
    keyUsages: EnrollKeyUsages,
    signingCertificate: Certificate,
    smartcardReaderName: String,
    subject: String,
    useExistingKey: Boolean
  ): CertificateRequestProperties = {
    val __obj = js.Dynamic.literal(attestationCredentialCertificate = attestationCredentialCertificate.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], containerNamePrefix = containerNamePrefix.asInstanceOf[js.Any], curveName = curveName.asInstanceOf[js.Any], curveParameters = curveParameters.asInstanceOf[js.Any], exportable = exportable.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], hashAlgorithmName = hashAlgorithmName.asInstanceOf[js.Any], keyAlgorithmName = keyAlgorithmName.asInstanceOf[js.Any], keyProtectionLevel = keyProtectionLevel.asInstanceOf[js.Any], keySize = keySize.asInstanceOf[js.Any], keyStorageProviderName = keyStorageProviderName.asInstanceOf[js.Any], keyUsages = keyUsages.asInstanceOf[js.Any], signingCertificate = signingCertificate.asInstanceOf[js.Any], smartcardReaderName = smartcardReaderName.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], useExistingKey = useExistingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateRequestProperties]
  }
  
  @scala.inline
  implicit class CertificateRequestPropertiesOps[Self <: CertificateRequestProperties] (val x: Self) extends AnyVal {
    
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
    def setAttestationCredentialCertificate(value: Certificate): Self = this.set("attestationCredentialCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNamePrefix(value: String): Self = this.set("containerNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveName(value: String): Self = this.set("curveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveParameters(value: Double): Self = this.set("curveParameters", value.asInstanceOf[js.Any])
    
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
    def setSigningCertificate(value: Certificate): Self = this.set("signingCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartcardReaderName(value: String): Self = this.set("smartcardReaderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExistingKey(value: Boolean): Self = this.set("useExistingKey", value.asInstanceOf[js.Any])
  }
}
