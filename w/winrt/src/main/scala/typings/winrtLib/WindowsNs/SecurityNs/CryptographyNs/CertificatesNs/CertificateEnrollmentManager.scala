package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager")
@js.native
class CertificateEnrollmentManager () extends js.Object

@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager")
@js.native
object CertificateEnrollmentManager extends js.Object {
  def createRequestAsync(request: winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CertificateRequestProperties): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def importPfxDataAsync(
    pfxData: java.lang.String,
    password: java.lang.String,
    exportable: winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ExportOption,
    keyProtectionLevel: winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel,
    installOption: winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions,
    friendlyName: java.lang.String
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def installCertificateAsync(
    certificate: java.lang.String,
    installOption: winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

