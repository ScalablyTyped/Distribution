package typings.winrt.Windows.Security.Cryptography.Certificates

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
    val __obj = js.Dynamic.literal(exportable = exportable.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], hashAlgorithmName = hashAlgorithmName.asInstanceOf[js.Any], keyAlgorithmName = keyAlgorithmName.asInstanceOf[js.Any], keyProtectionLevel = keyProtectionLevel.asInstanceOf[js.Any], keySize = keySize.asInstanceOf[js.Any], keyStorageProviderName = keyStorageProviderName.asInstanceOf[js.Any], keyUsages = keyUsages.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICertificateRequestProperties]
  }
}

