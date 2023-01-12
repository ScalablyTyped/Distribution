package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the properties of a certificate request. */
trait CertificateRequestProperties extends StObject {
  
  /** Gets or sets the CA exchange certificate that is used to encrypt a key attestation certificate request. */
  var attestationCredentialCertificate: Certificate
  
  /** Gets or sets the container name. */
  var containerName: String
  
  /** Gets or sets the prefix of the container name. */
  var containerNamePrefix: String
  
  /** Gets or sets the name of the elliptic curve. */
  var curveName: String
  
  /** Gets or sets the parameters of the elliptic curve. */
  var curveParameters: Double
  
  /** Gets or sets a value that specifies whether the private key created for the request can be exported. */
  var exportable: ExportOption
  
  /** Gets or sets the display name of the enrolled certificate. */
  var friendlyName: String
  
  /** Gets or sets the hash algorithm used when creating the certificate request signature. */
  var hashAlgorithmName: String
  
  /** Gets or sets the public key algorithm. */
  var keyAlgorithmName: String
  
  /** Gets or sets the level of strong key protection. */
  var keyProtectionLevel: KeyProtectionLevel
  
  /** Gets or sets the size, in bits, of the private key to be generated. */
  var keySize: Double
  
  /** Gets or sets the name of the key storage provider (KSP) that will be used to generate the private key. */
  var keyStorageProviderName: String
  
  /** Gets or sets the operation that can be performed by the private key created for this certificate request. The default value is Signing. */
  var keyUsages: EnrollKeyUsages
  
  /** Gets or sets the certificate used to sign the certificate request. */
  var signingCertificate: Certificate
  
  /** Gets or sets the name of the smart card reader used to create the certificate request. */
  var smartcardReaderName: String
  
  /** Gets or sets the subject name. */
  var subject: String
  
  /** Gets or sets whether to use the existing key. */
  var useExistingKey: Boolean
}
object CertificateRequestProperties {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: CertificateRequestProperties] (val x: Self) extends AnyVal {
    
    inline def setAttestationCredentialCertificate(value: Certificate): Self = StObject.set(x, "attestationCredentialCertificate", value.asInstanceOf[js.Any])
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNamePrefix(value: String): Self = StObject.set(x, "containerNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setCurveName(value: String): Self = StObject.set(x, "curveName", value.asInstanceOf[js.Any])
    
    inline def setCurveParameters(value: Double): Self = StObject.set(x, "curveParameters", value.asInstanceOf[js.Any])
    
    inline def setExportable(value: ExportOption): Self = StObject.set(x, "exportable", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmName(value: String): Self = StObject.set(x, "hashAlgorithmName", value.asInstanceOf[js.Any])
    
    inline def setKeyAlgorithmName(value: String): Self = StObject.set(x, "keyAlgorithmName", value.asInstanceOf[js.Any])
    
    inline def setKeyProtectionLevel(value: KeyProtectionLevel): Self = StObject.set(x, "keyProtectionLevel", value.asInstanceOf[js.Any])
    
    inline def setKeySize(value: Double): Self = StObject.set(x, "keySize", value.asInstanceOf[js.Any])
    
    inline def setKeyStorageProviderName(value: String): Self = StObject.set(x, "keyStorageProviderName", value.asInstanceOf[js.Any])
    
    inline def setKeyUsages(value: EnrollKeyUsages): Self = StObject.set(x, "keyUsages", value.asInstanceOf[js.Any])
    
    inline def setSigningCertificate(value: Certificate): Self = StObject.set(x, "signingCertificate", value.asInstanceOf[js.Any])
    
    inline def setSmartcardReaderName(value: String): Self = StObject.set(x, "smartcardReaderName", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setUseExistingKey(value: Boolean): Self = StObject.set(x, "useExistingKey", value.asInstanceOf[js.Any])
  }
}
