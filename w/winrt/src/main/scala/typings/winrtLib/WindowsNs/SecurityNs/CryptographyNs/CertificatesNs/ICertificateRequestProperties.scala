package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICertificateRequestProperties extends js.Object {
  var exportable: ExportOption
  var friendlyName: java.lang.String
  var hashAlgorithmName: java.lang.String
  var keyAlgorithmName: java.lang.String
  var keyProtectionLevel: KeyProtectionLevel
  var keySize: scala.Double
  var keyStorageProviderName: java.lang.String
  var keyUsages: EnrollKeyUsages
  var subject: java.lang.String
}

object ICertificateRequestProperties {
  @scala.inline
  def apply(
    exportable: ExportOption,
    friendlyName: java.lang.String,
    hashAlgorithmName: java.lang.String,
    keyAlgorithmName: java.lang.String,
    keyProtectionLevel: KeyProtectionLevel,
    keySize: scala.Double,
    keyStorageProviderName: java.lang.String,
    keyUsages: EnrollKeyUsages,
    subject: java.lang.String
  ): ICertificateRequestProperties = {
    val __obj = js.Dynamic.literal(exportable = exportable, friendlyName = friendlyName, hashAlgorithmName = hashAlgorithmName, keyAlgorithmName = keyAlgorithmName, keyProtectionLevel = keyProtectionLevel, keySize = keySize, keyStorageProviderName = keyStorageProviderName, keyUsages = keyUsages, subject = subject)
  
    __obj.asInstanceOf[ICertificateRequestProperties]
  }
}

