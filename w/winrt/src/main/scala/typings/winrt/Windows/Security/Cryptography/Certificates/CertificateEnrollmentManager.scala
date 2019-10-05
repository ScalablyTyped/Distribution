package typings.winrt.Windows.Security.Cryptography.Certificates

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager")
@js.native
class CertificateEnrollmentManager () extends js.Object

/* static members */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager")
@js.native
object CertificateEnrollmentManager extends js.Object {
  def createRequestAsync(request: CertificateRequestProperties): IAsyncOperation[String] = js.native
  def importPfxDataAsync(
    pfxData: String,
    password: String,
    exportable: ExportOption,
    keyProtectionLevel: KeyProtectionLevel,
    installOption: InstallOptions,
    friendlyName: String
  ): IAsyncAction = js.native
  def installCertificateAsync(certificate: String, installOption: InstallOptions): IAsyncAction = js.native
}

