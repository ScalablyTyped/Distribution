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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exportable")(exportable)
    __obj.updateDynamic("friendlyName")(friendlyName)
    __obj.updateDynamic("hashAlgorithmName")(hashAlgorithmName)
    __obj.updateDynamic("keyAlgorithmName")(keyAlgorithmName)
    __obj.updateDynamic("keyProtectionLevel")(keyProtectionLevel)
    __obj.updateDynamic("keySize")(keySize)
    __obj.updateDynamic("keyStorageProviderName")(keyStorageProviderName)
    __obj.updateDynamic("keyUsages")(keyUsages)
    __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[ICertificateRequestProperties]
  }
}

