package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the properties of a certificate request. */
@js.native
trait CertificateRequestProperties extends StObject {
  
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
  implicit class CertificateRequestPropertiesMutableBuilder[Self <: CertificateRequestProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttestationCredentialCertificate(value: Certificate): Self = StObject.set(x, "attestationCredentialCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNamePrefix(value: String): Self = StObject.set(x, "containerNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveName(value: String): Self = StObject.set(x, "curveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveParameters(value: Double): Self = StObject.set(x, "curveParameters", value.asInstanceOf[js.Any])
    
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
    def setSigningCertificate(value: Certificate): Self = StObject.set(x, "signingCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartcardReaderName(value: String): Self = StObject.set(x, "smartcardReaderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExistingKey(value: Boolean): Self = StObject.set(x, "useExistingKey", value.asInstanceOf[js.Any])
  }
}
