package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the properties of a certificate request. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateRequestProperties")
@js.native
/** Creates and initializes a new instance of the CertificateRequestProperties . */
class CertificateRequestProperties ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateRequestProperties {
  /** Gets or sets the CA exchange certificate that is used to encrypt a key attestation certificate request. */
  /* CompleteClass */
  override var attestationCredentialCertificate: typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate = js.native
  /** Gets or sets the container name. */
  /* CompleteClass */
  override var containerName: String = js.native
  /** Gets or sets the prefix of the container name. */
  /* CompleteClass */
  override var containerNamePrefix: String = js.native
  /** Gets or sets the name of the elliptic curve. */
  /* CompleteClass */
  override var curveName: String = js.native
  /** Gets or sets the parameters of the elliptic curve. */
  /* CompleteClass */
  override var curveParameters: Double = js.native
  /** Gets or sets a value that specifies whether the private key created for the request can be exported. */
  /* CompleteClass */
  override var exportable: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ExportOption = js.native
  /** Gets or sets the display name of the enrolled certificate. */
  /* CompleteClass */
  override var friendlyName: String = js.native
  /** Gets or sets the hash algorithm used when creating the certificate request signature. */
  /* CompleteClass */
  override var hashAlgorithmName: String = js.native
  /** Gets or sets the public key algorithm. */
  /* CompleteClass */
  override var keyAlgorithmName: String = js.native
  /** Gets or sets the level of strong key protection. */
  /* CompleteClass */
  override var keyProtectionLevel: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel = js.native
  /** Gets or sets the size, in bits, of the private key to be generated. */
  /* CompleteClass */
  override var keySize: Double = js.native
  /** Gets or sets the name of the key storage provider (KSP) that will be used to generate the private key. */
  /* CompleteClass */
  override var keyStorageProviderName: String = js.native
  /** Gets or sets the operation that can be performed by the private key created for this certificate request. The default value is Signing. */
  /* CompleteClass */
  override var keyUsages: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages = js.native
  /** Gets or sets the certificate used to sign the certificate request. */
  /* CompleteClass */
  override var signingCertificate: typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate = js.native
  /** Gets or sets the name of the smart card reader used to create the certificate request. */
  /* CompleteClass */
  override var smartcardReaderName: String = js.native
  /** Gets or sets the subject name. */
  /* CompleteClass */
  override var subject: String = js.native
  /** Gets or sets whether to use the existing key. */
  /* CompleteClass */
  override var useExistingKey: Boolean = js.native
}

