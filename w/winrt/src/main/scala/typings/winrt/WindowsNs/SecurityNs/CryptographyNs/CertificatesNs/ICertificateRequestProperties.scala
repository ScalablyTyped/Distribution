package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICertificateRequestProperties extends js.Object {
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
    val __obj = js.Dynamic.literal(exportable = exportable, friendlyName = friendlyName, hashAlgorithmName = hashAlgorithmName, keyAlgorithmName = keyAlgorithmName, keyProtectionLevel = keyProtectionLevel, keySize = keySize, keyStorageProviderName = keyStorageProviderName, keyUsages = keyUsages, subject = subject)
  
    __obj.asInstanceOf[ICertificateRequestProperties]
  }
}

